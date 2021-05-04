package com.qa.AutomateWebsite;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;


public class TC_AmazonWebsite extends TestBase
{


	
	  public static WebDriver driver;
	    public static XSSFWorkbook workbook;
	    public static XSSFSheet worksheet;
	    public static DataFormatter formatter= new DataFormatter();
	    static String SheetName= "Sheet1";

		 // Write obj1=new Write();
		  //public int DataSet=-1;








		  /*@Test
		  public void apen() throws InterruptedException
		  {
		  amazonOb.All().click();
		  Thread.sleep(3000);	
		  }*/
		  /*@Test(priority=1,dataProvider="getData")
		  public void order(String username,String password) throws InterruptedException 
		  {
		  	/*amazonOb.All().click();
		  	Thread.sleep(3000);	
		  	amazonOb.Username().sendKeys(username);
		  	amazonOb.Continue().click();
		  	amazonOb.Password().sendKeys(password);
		  	amazonOb.Submit().click();
		  	Thread.sleep(2000);
		  	
		  	
		  	
		  	amazonOb.setAdress().click();
		  	Thread.sleep(3000);
		  	amazonOb.adressNavigate().click();
		  	Thread.sleep(3000);
		  	amazonOb.newAdress().click();
		  	Thread.sleep(2500);
		  	amazonOb.Country().click();
		  	amazonOb.chooseCountry().click();
		  	amazonOb.Name().sendKeys("Buddhadev Ghosh");
		  	amazonOb.Mobile().sendKeys("7908934099");
		  	amazonOb.pinCode().sendKeys("721127");
		  	amazonOb.Adressline().sendKeys("Garhbeta hoomgarh road");
		  	amazonOb.Adressline2().sendKeys("Garhbeta,paschim medinipur");
		  	amazonOb.Landmark().sendKeys("college");
		  	amazonOb.State().click();
		  	amazonOb.stateChoose().click();
		  	amazonOb.addAdress().click();
		  	Thread.sleep(7000);
		  	
		  	 amazonOb.SearchBox().sendKeys("wings of fire");
		  	 amazonOb.Search().click();
		  	Thread.sleep(3000);
		  	System.out.println(driver.getTitle());
		  	driver.findElement(By.cssSelector("#search > div.s-desktop-width-max.s-opposite-dir > div > div.s-matching-dir.sg-col-16-of-20.sg-col.sg-col-8-of-12.sg-col-12-of-16 > div > span:nth-child(4) > div.s-main-slot.s-result-list.s-search-results.sg-row > div:nth-child(2) > div > span > div > div > div:nth-child(2) > div.sg-col.sg-col-4-of-12.sg-col-8-of-16.sg-col-12-of-20 > div > div:nth-child(1) > h2 > a > span")).click();
		  	//Thread.sleep(7000);
		  	
		  	JavascriptExecutor js = (JavascriptExecutor) driver;
		  	js.executeScript("window.scrollBy(0,500)");
		  	
		  	Set<String> ids = driver.getWindowHandles();
		  	Iterator<String> it = ids.iterator();
		  	String parentid=it.next();
		  	String childid=it.next();
		  	driver.switchTo().window(childid);
		  	System.out.println(driver.getTitle());
		  	
		  	driver.findElement(By.cssSelector("#buy-now-button")).click();
		  	Thread.sleep(3000);
		  }*/

	
	@Test(priority=2,dataProvider="getData")
	public void mobileRecharge(String username,String password,String mNumber,String Ramount) throws InterruptedException
	{	
		amazonOb.All().click();
		Thread.sleep(2000);	
		amazonOb.Username().sendKeys(username);
		Thread.sleep(2000);
		amazonOb.Continue().click();
		amazonOb.Password().sendKeys(password);
		amazonOb.Submit().click();
		Thread.sleep(16000);
		amazonOb.amazonPay().click();
		amazonOb.mRecharge().click();
		Thread.sleep(3000);
		amazonOb.mNumber().click();
		amazonOb.mNumber().sendKeys(mNumber);
		Thread.sleep(5000);
		amazonOb.rAmount().sendKeys(Ramount);
		Thread.sleep(7000);
		amazonOb.rClick().click();
		Thread.sleep(3000);
		/*driver.navigate().back();
		amazonOb.Menu().click();
		Thread.sleep(3000);
		amazonOb.Logout().click();*/
		
	}
	
	

@DataProvider
public static Object[][] getData() throws IOException
{
	int k=0;
FileInputStream fileInputStream= new FileInputStream("C:\\Users\\buddh\\eclipse-workspace\\SeleniumAutomation\\Excel\\AmazonWebsite.xlsx");
    workbook = new XSSFWorkbook (fileInputStream); 
    worksheet=workbook.getSheet("Sheet1");
    
    XSSFRow Row=worksheet.getRow(0);
 
    int RowNum = worksheet.getPhysicalNumberOfRows();
    int ColNum= Row.getLastCellNum();
   System.out.println(RowNum);
    System.out.println(ColNum);
    Object Data[][]= new Object[RowNum][ColNum];
  
      for(int i=1; i<=RowNum; i++)
        {  
            XSSFRow row= worksheet.getRow(i);
             
            for (int j=0; j<ColNum; j++)
            {
                if(row==null)
                   break;// Data[i][j]="";
                else
                {
                    XSSFCell cell= row.getCell(j);
                    if(cell==null)
                      Data[i][j]= "";
                    else
                    {
                        String value=formatter.formatCellValue(cell);
                        Data[i][j]=value;
                        k++;
                        System.out.println(value);
                        System.out.println(k);
                    }
                }
            }
        }
        

    return Data;
}


}






/*



@DataProvider
public Object[][] getData()
{
	Object[][] data = new Object[1][2];
	//data[0][0]="buddha";
	//data[0][1]="buddja";
	data[0][0]="7908934099";
	data[0][1]="Buddha79";
	return data;
}*/



















