package authentication;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test {
public static void main(String[] args) throws InterruptedException{
	System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	driver.get("http://bs4485:Bangalore!@ftms-qa-hsb.dupont.com/FTMS/");
	//Thread.sleep(3000);
Pageobjectmodel p = new Pageobjectmodel(driver);
p.ClickOnHomeButton();
p.ClickonPlans();
p.ClickonBiologyPlan();
//Thread.sleep(10000);
p.CreateNewBiologyplan();
Thread.sleep(30000);
p.ClickonProject();

p.SendProjectname("IDEA-0A0I7A7R: Indoxacarb Registration Review - USA");
Actions ac = new Actions(driver);
ac.sendKeys(Keys.ENTER).perform();
p.SelectRegion();
p.SelectInitationYear();
p.Selectprofoliocode();
ac.sendKeys(Keys.ENTER).perform();
p.EnterName("Lathavya");
p.SelectProjectlead();
ac.sendKeys(Keys.ENTER).perform();
p.SelectNo();
//p.ClickonSave();
//driver.close();
}
}
