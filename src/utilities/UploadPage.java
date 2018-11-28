package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.BasePage;

public class UploadPage extends BasePage {
	@FindBy(xpath="(//div[@class='row'])[2]/div[1]")
	private WebElement AddProtocol;
	
public UploadPage(WebDriver driver){
	super(driver);
	PageFactory.initElements(driver, this);
	}

public void AddProtocolfile(){
	AddProtocol.click();
	//AddProtocol.sendKeys("eclipse").
}
}
