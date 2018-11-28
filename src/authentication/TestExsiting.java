package authentication;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



public class TestExsiting {
public static void main(String[] args) throws InterruptedException, IOException {
	System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	driver.get("http://bs4485:Bangalore!@ftms-qa-hsb.dupont.com/FTMS/");
	//Thread.sleep(3000);
Pageobjectmodel p = new Pageobjectmodel(driver);
p.ClickOnHomeButton();
p.ClickonPlans();
p.ClickonBiologyPlan();
	 WebElement exist = driver.findElement(By.xpath("(//tr[@class='protocol-row IE8-zebra-row'])[1]"));
	 Actions ac= new Actions(driver);
	 ac.moveToElement(exist);
	 ac.doubleClick().perform();
	Thread.sleep(30000);
	TakesScreenshot js = (TakesScreenshot)driver;
	File scr = js.getScreenshotAs(OutputType.FILE);
	File dst = new File("C:\\Users\\lathavya.buddya.bc\\Desktop\\New folder\\SS.jpeg");
	FileUtils.copyFile(scr, dst);
}
}
