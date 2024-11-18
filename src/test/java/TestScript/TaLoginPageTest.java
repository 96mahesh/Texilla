package TestScript;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.texila.Page.LoginPage;
import com.texila.Page.TaLoginPage;
import com.texila.utils.Browser;
import com.texila.utils.ExcellReader;

public class TaLoginPageTest {
	WebDriver driver;
	@BeforeMethod
	public void setUp() throws Exception {
		driver = Browser.lanchBrowser("chrome");
		String url = ExcellReader.getData("config", "url");
		driver.get(url);
	}
	@AfterMethod
	public void tearDown() {
		Browser.closeBrowser();
	}
	
	@Test(priority=1)
	public void verifyLoginPageFunctionalityinvalidDeportMentData() throws Exception {	
		LoginPage logn = new LoginPage(driver);
		TaLoginPage talog = new TaLoginPage(driver);
		String emailkeys = ExcellReader.getData("config", "taManagerusername");
		logn.emailTextBox(emailkeys);
		String passkeyskeys = ExcellReader.getData("config", "taManagerPassword");
		logn.passwordTextBox(passkeyskeys);
		logn.clickOnLogin();
		logn.clickOnHrProcess();
		logn.verifyHrmLogo();
		talog.clickOnActualPlan();
		talog.clickOnDepartMentBudget();
		talog.clickOnAddBtn();
		talog.selectinvaliddeptFinacialDropDown();
		talog.selectBussinessUnit();
		talog.selectDepartMentBudget();
		talog.entervalidAnualSalaryTextBox();
		talog.selectCurrenceId();
		talog.clickOnSunmitButton();
		talog.verifyDeportMentFeeld();
		talog.clickOnTaManagerIcon();
		talog.clickOnLogOut();
		
	}
	
	@Test(priority=2)
	public void verifyLoginPageFunctionalityinvalidManPowerData() throws Exception {	
		LoginPage logn = new LoginPage(driver);
		TaLoginPage talog = new TaLoginPage(driver);
		String emailkeys = ExcellReader.getData("config", "taManagerusername");
		logn.emailTextBox(emailkeys);
		String passkeyskeys = ExcellReader.getData("config", "taManagerPassword");
		logn.passwordTextBox(passkeyskeys);
		logn.clickOnLogin();
		logn.clickOnHrProcess();
		logn.verifyHrmLogo();
		talog.clickOnActualPlan();
		talog.clickOnDepartMentBudget();
		talog.clickOnAddBtn();
		talog.selectinvalidmanpowerFinacialDropDown();
		talog.selectBussinessUnit();
		talog.selectDepartMentBudget();
		talog.entervalidAnualSalaryTextBox();
		talog.selectCurrenceId();
		talog.clickOnSunmitButton();
		talog.enterRemarkTextBox();
		talog.clickOnSunmitButton();
		talog.verifyPopMsg();
		talog.clickOnUpdateBudgetTableBtn();
		talog.clickOnUpDatePlanLink();
		Thread.sleep(5000);
		talog.clearFealds();
		Thread.sleep(2000);
		talog.enterManpowerValue();
		talog.enterAnualBudget();
		talog.enterQOneManPower();
		talog.enterQTwoManPower();
		talog.enterQinValidThreeManPower();
		talog.enterQFourManPower();
		talog.clickOnSumButtonupItem();
		talog.verifyManPowerInvalidMsg();
		talog.clickOnCloseButton();
		talog.clickOnTaManagerIcon();
		talog.clickOnLogOut();		
	}

	@Test(priority=3)
	public void verifyLoginPageFunctionalityOfvalidBudgetData() throws Exception {	
		LoginPage logn = new LoginPage(driver);
		TaLoginPage talog = new TaLoginPage(driver);
		String emailkeys = ExcellReader.getData("config", "taManagerusername");
		logn.emailTextBox(emailkeys);
		String passkeyskeys = ExcellReader.getData("config", "taManagerPassword");
		logn.passwordTextBox(passkeyskeys);
		logn.clickOnLogin();
		logn.clickOnHrProcess();
		logn.verifyHrmLogo();
		talog.clickOnActualPlan();
		talog.clickOnDepartMentBudget();
		talog.clickOnAddBtn();
		talog.selectvalidFinacialDropDown();
		talog.selectBussinessUnit();
		talog.selectDepartMentBudget();
		talog.entervalidAnualSalaryTextBox();
		talog.selectCurrenceId();
		talog.clickOnSunmitButton();
		talog.enterRemarkTextBox();
		talog.clickOnSunmitButton();
		talog.verifyPopMsg();
		talog.clickOnUpdateBudgetTableBtn();
		talog.clickOnUpDatePlanLink();
		Thread.sleep(5000);
		talog.clearFealds();
		Thread.sleep(2000);
		talog.enterManpowerValue();
		talog.enterAnualBudget();
		talog.enterQOneManPower();
		talog.enterQTwoManPower();
		talog.enterQThreeManPower();
		talog.enterQFourManPower();
		talog.clickOnSumButtonupItem();
		talog.verifyValidationOfBudGetSuccesMsg();
		talog.scrollingUP();
		talog.clickOnTaManagerIcon();
		talog.clickOnLogOut();
		
	}
	
	@Test(priority=4)
	
	public void verifyTamanagerLoginFunctionalityInvalidBudgetData() throws Exception {
		
		LoginPage logn = new LoginPage(driver);
		TaLoginPage talog = new TaLoginPage(driver);
		String emailkeys = ExcellReader.getData("config", "taManagerusername");
		logn.emailTextBox(emailkeys);
		String passkeyskeys = ExcellReader.getData("config", "taManagerPassword");
		logn.passwordTextBox(passkeyskeys);
		logn.clickOnLogin();
		logn.clickOnHrProcess();
		logn.verifyHrmLogo();
		talog.clickOnActualPlan();
		talog.clickOnDepartMentBudget();
		talog.clickOnAddBtn();
		talog.selectinvalidFinacialDropDown();
		talog.selectBussinessUnit();
		talog.selectDepartMentBudget();
		talog.entervalidAnualSalaryTextBox();
		talog.selectCurrenceId();
		talog.clickOnSunmitButton();
		talog.enterRemarkTextBox();
		talog.clickOnSunmitButton();
		talog.verifyPopMsg();
		talog.clickOnUpdateBudgetTableBtn();
		talog.clickOnUpDatePlanLink();
		Thread.sleep(5000);
		talog.clearFealds();
		Thread.sleep(2000);
		talog.enterManpowerValue();
		talog.enterInvalidAnualBudget();
		talog.enterQOneManPower();
		talog.enterQTwoManPower();
		talog.enterQThreeManPower();
		talog.enterQFourManPower();
		talog.clickOnSumButtonupItem();
		talog.verifyInvalidBudgetMsg();
		talog.clickOnCloseButton();
		talog.clickOnTaManagerIcon();
		talog.clickOnLogOut();
	}
}
