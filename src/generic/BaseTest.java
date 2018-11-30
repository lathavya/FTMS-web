package generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest implements Auto_const 
{
	static
	{
		System.setProperty(Chrome_Key, Chrome_value);
	}

public WebDriver driver;

@BeforeMethod
public void OpenApp()
	{
	driver = new ChromeDriver();
	driver.get("http://bs4485:Bangalore@2@ftms-qa-hsb.dupont.com/FTMS/");
	}

@AfterMethod
public void ScreenshotCloseApp()
	{
	driver.quit();
	}

}
