package generic;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;


public  class BasePage extends BaseTest  
{
public WebDriver driver;
	
public BasePage(WebDriver driver)
	{
		this.driver= driver;
	}
	
public void Verifytitle(String title)
	{
		WebDriverWait wait = new WebDriverWait(driver, 10);
		try{
		wait.until(ExpectedConditions.titleContains(title));
		Reporter.log(title+" is passed",true);
		}
		catch(Exception e){
			BasePage BP = new BasePage(driver);
			BP.Screenshot("unexpected");
			Reporter.log("title is not matching",true);
			Assert.fail();
		}
	}
	
public void VerifyElement(WebElement element)
	{
		WebDriverWait wait = new WebDriverWait(driver,70);
		try{
			wait.until(ExpectedConditions.visibilityOf(element));
			}
		catch(Exception e){
			BasePage BP = new BasePage(driver);
			BP.Screenshot("unexpected");
			Reporter.log("Exsiting values in table not Present",true);
			Assert.fail();
			}
	}

public void Uploadfiles(String filename)
	{
		try {
			StringSelection Str = new StringSelection(filename);
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(Str, null);
			Thread.sleep(3000);
			Robot R = new Robot();
			R.keyPress(KeyEvent.VK_CONTROL);
			R.keyPress(KeyEvent.VK_V);
			R.keyRelease(KeyEvent.VK_CONTROL);
			R.keyRelease(KeyEvent.VK_V);
			R.keyPress(KeyEvent.VK_ENTER);
			R.keyRelease(KeyEvent.VK_ENTER);
			R.keyPress(KeyEvent.VK_CANCEL);
			R.keyRelease(KeyEvent.VK_CANCEL);
			} 
		catch (Exception e) {
			System.out.println("Not able to upload file");	
			}
	}

public void Screenshot(String Screenshotname)
	{
		try {
		     TakesScreenshot ts= (TakesScreenshot) driver ;
          	 File src = ts.getScreenshotAs(OutputType.FILE);
          	 File drc = new File("./Screenshot/"+Screenshotname+".png");
          	 FileUtils.copyFile(src, drc);
			} 
		catch (Exception e) {
			System.out.println("Expection while taking screenshot"+e.getMessage());
			}     		
	}

public void ClearSearchfiled()
	{
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		try {
			WebElement Searchfield = driver.findElement(By.xpath("(//input[@type='text'])[6]"));
			Thread.sleep(2000);
			Searchfield.clear();
			} catch (Exception e) {
				  System.out.println("Not able to clear fields");	
			}
	}
}
