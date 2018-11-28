package script;

import generic.BasePage;
import generic.BaseTest;
import utilities.AssignmentSearchPage;
import utilities.BiologyPlanReportPage;
import utilities.BiologyPlanSearchpage;
import utilities.ChemicalsPage;
import utilities.HomePage;
import utilities.ProtocolIndexReportPage;
import utilities.ProtocolSearchPage;
import utilities.TechnicalObjectiveSearchPage;
import utilities.UserGroupsPage;
import utilities.ValueEditorsPage;
import utilities.VendorPlanReportpage;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

public class Tests extends BaseTest {
	@Test
	public void monitering() {
		driver.manage().deleteAllCookies();
	driver.manage().window().maximize();
	
	BasePage BP = new BasePage(driver);
	BP.Verifytitle("FTMS: Home");
	BP.Screenshot("Home Page");
	
	HomePage HP= new HomePage(driver);
	
	HP.ClickOnDropButton();
	HP.ClickOnPlans();
	HP.ClickOnBiologyPlan();
	BiologyPlanSearchpage BPSearch = new BiologyPlanSearchpage(driver); 
	BPSearch.BiologyPlanTable();
	BP.Verifytitle("FTMS: Biology Plan");
	BP.Screenshot("Biology Plan");
	
	HP.ClickOnDropButton();
	HP.ClickonTechnicalObjective();
	BP.ClearSearchfiled();
	TechnicalObjectiveSearchPage TOSearch = new TechnicalObjectiveSearchPage(driver);
	TOSearch.TechnicalObjectiveTable();
	BP.Verifytitle("FTMS: Technical Objectives");
	BP.Screenshot("Technical Objective");
	
	HP.ClickOnDropButton();
	HP.ClickonProtocolsandTrials();
	HP.ClickonProtocol();
	ProtocolSearchPage PSearch = new ProtocolSearchPage(driver);
	PSearch.ProtocolSearchTable();
	BP.Verifytitle("FTMS: Protocols");
	BP.Screenshot("Protocols");
	
	HP.ClickOnDropButton();
	HP.ClickonAssignments();
	AssignmentSearchPage ASearch = new AssignmentSearchPage(driver);
	ASearch.AssignmentSearchTable();
	BP.Verifytitle("FTMS: Assignment");
	BP.Screenshot("Assignmnets");
	
	HP.ClickOnDropButton();
	HP.ClickonReports();
	HP.ClickonProtocolIndexReport();
	ProtocolIndexReportPage PIReport = new ProtocolIndexReportPage(driver);
	PIReport.ProtocolIndexReportTable();
	BP.Verifytitle("FTMS: Protocol Index Report");
	BP.Screenshot("ProtocolIndexReport");
	
	HP.ClickOnDropButton();
	HP.ClickonBiologyPlanReport();
	BiologyPlanReportPage BPReport = new BiologyPlanReportPage(driver);
	BPReport.BiologyPlanReportTable();
	BP.Screenshot("Biology Plan Report");
	BP.Verifytitle("FTMS: Biology Plan Report");
	
	HP.ClickOnDropButton();
	HP.ClickonVendorReport();
	VendorPlanReportpage VPReport = new VendorPlanReportpage(driver);
	VPReport.VendorPlanTable();
	BP.Screenshot("Vendor Report");
	BP.Verifytitle("FTMS: VEndor Report");
	
	HP.ClickOnDropButton();
	HP.ClickonAdmin();
	HP.ClickonValuesEditor();
	ValueEditorsPage VEPage = new ValueEditorsPage(driver);
	VEPage.ValueEditorsTable();
	BP.Screenshot("Value Editors");
	BP.Verifytitle("FTMS: Values Editor");
	
	HP.ClickOnDropButton();
	HP.ClickonUserGroups();
	UserGroupsPage UGPage = new UserGroupsPage(driver);
	UGPage.UserGroupsTable();
	BP.Screenshot("User Groups");
	BP.Verifytitle("FTMS: User Groups");
	
	HP.ClickOnDropButton();
	HP.ClickonRequest();
	HP.ClickonChemicals();
	ChemicalsPage CSearch = new ChemicalsPage(driver);
	CSearch.ChemicalTable();
	BP.Screenshot("Chemical");
	BP.Verifytitle("FTMS: Chemical");
	
	
	
		
	
	
	}

}
