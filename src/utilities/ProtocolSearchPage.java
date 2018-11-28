package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.BasePage;

public class ProtocolSearchPage extends BasePage {
	@FindBy(xpath="(//tr)[3]")
	private WebElement Table;

public ProtocolSearchPage(WebDriver driver){
	super(driver);
	PageFactory.initElements(driver, this);
}

public void ProtocolSearchTable(){
	VerifyElement(Table);
}

}