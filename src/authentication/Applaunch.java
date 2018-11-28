package authentication;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Applaunch {
	public static void main(String[] args){
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		try {
			Runtime.getRuntime().exec("C:\\Users\\lathavya.buddya.bc\\Desktop\\Autoit.exe") ;
		} catch (IOException e) {
	        System.out.println("not able to run autoit");
			//e.printStackTrace();
		}
		driver.get("http://ftms-qa-hsb.dupont.com/FTMS/");	
		
		driver.quit();
	}

}
