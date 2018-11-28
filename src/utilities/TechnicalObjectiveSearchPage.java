package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.BasePage;

public class TechnicalObjectiveSearchPage extends BasePage {
	@FindBy(xpath="(//td[@unselectable='on'])[1]")
	private WebElement Table;
	
	public TechnicalObjectiveSearchPage(WebDriver driver){
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	public void TechnicalObjectiveTable(){
		VerifyElement(Table);
	}

}
