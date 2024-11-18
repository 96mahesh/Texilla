package TestScript;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.texila.Page.FunctionHeadLoginPage;
import com.texila.Page.LoginPage;
import com.texila.Page.TaManagerLoginPage;
import com.texila.utils.Browser;
import com.texila.utils.ExcellReader;
import com.texila.utils.ExtentReportManager;

public class FunctionalHeadLoginTest {

	WebDriver driver;
	@BeforeMethod
	public void setUp() throws Exception {
		driver = Browser.lanchBrowser("chrome");
		String url = ExcellReader.getData("config", "url");
		driver.get(url);
		ExtentReportManager.startTest(url, url, url);
	}
	@AfterMethod
	public void tearDown() {
		Browser.closeBrowser();
	}
	
	@Test
	public void verifyTexillaFunctionalHeadLoginPageFunctionalityOfValidManPowerData() throws Exception {	
		LoginPage logn = new LoginPage(driver);
		FunctionHeadLoginPage funlog = new FunctionHeadLoginPage(driver);
		TaManagerLoginPage  tamanager = new TaManagerLoginPage(driver);
		String emailkeys = ExcellReader.getData("config", "FunctionalHeadusername");
		logn.emailTextBox(emailkeys);
		String passkeyskeys = ExcellReader.getData("config", "FunctionalHeadPassword");
		logn.passwordTextBox(passkeyskeys);
		logn.clickOnLogin();
		logn.clickOnHrProcess();
		logn.verifyHrmLogo();
		funlog.clickOnDepartMentManPower();
		funlog.clickOnFunctionalHeadTableIconBtn();
		funlog.clickOnFunctionHeadViewLinkBtn();
		tamanager.clickOnRoleTable();
		funlog.clickOnviewAndNewPlanBtn();
		funlog.scrollTheDisplyElement();
		funlog.clickOnFunctiolHead();
		funlog.clickOnUpdateManpowerBtn();
		Thread.sleep(2000);
		funlog.clearFealds();
		Thread.sleep(1000);
		funlog.enterfulltimeManpowervalues();
		funlog.enterparttimeManpowervalues();
		funlog.clickOnFunSunBtn();
		funlog.verifyManPowerMessage();
		Thread.sleep(1000);
		funlog.clickOFunftionalHeadQManpowerTwoBtn();
		funlog.clickOnFunftionalHeaduptmanpowerTwoBtn();
		Thread.sleep(2000);
		funlog.clearmnpFealds();
		funlog.enterfulltimeManpowervaluesTwoBox();
		funlog.enterparttimeManpowervaluesTwoBox();
		funlog.clickOnFunSunBtn();
		funlog.verifyManPowerMessage();
		funlog.clickOnFunctionalHeadBtn();
		logn.logOutBtn();
	}
	
	
	@Test
	public void verifyTexillaFunctionalHeadLoginPageFunctionalityOfInValidManPowerData() throws Exception {	
		LoginPage logn = new LoginPage(driver);
		FunctionHeadLoginPage funlog = new FunctionHeadLoginPage(driver);
		TaManagerLoginPage  tamanager = new TaManagerLoginPage(driver);
		String emailkeys = ExcellReader.getData("config", "FunctionalHeadusername");
		logn.emailTextBox(emailkeys);
		String passkeyskeys = ExcellReader.getData("config", "FunctionalHeadPassword");
		logn.passwordTextBox(passkeyskeys);
		logn.clickOnLogin();
		logn.clickOnHrProcess();
		logn.verifyHrmLogo();
		funlog.clickOnDepartMentManPower();
		funlog.clickOnFunctionalHeadTableIconBtn();
		funlog.clickOnFunctionHeadViewLinkBtn();
		tamanager.clickOnRoleTable();
		funlog.clickOnviewAndNewPlanBtn();
		funlog.scrollTheDisplyElement();
		funlog.clickOnFunctiolHead();
		funlog.clickOnUpdateManpowerBtn();
		Thread.sleep(2000);
		funlog.clearFealds();
		Thread.sleep(1000);
		funlog.enterfulltimeManpowervalues();
		funlog.enterInvalidparttimeManpowervalues();
		funlog.clickOnFunSunBtn();
		funlog.verifyNegitiveManPowerValue();
		funlog.clickOnClosebutton();
		Thread.sleep(1000);
		funlog.clickOFunftionalHeadQManpowerTwoBtn();
		funlog.clickOnFunftionalHeaduptmanpowerTwoBtn();
		Thread.sleep(2000);
		funlog.clearmnpFealds();
		funlog.enterfulltimeManpowervaluesTwoBox();
		funlog.enterInvalidparttimeManpowervaluesTwoBox();
		funlog.clickOnFunSunBtn();
		funlog.verifyNegitiveManPowerValue();
		funlog.clickOnClosebutton();
		funlog.clickOnFunctionalHeadBtn();
		logn.logOutBtn();
	}
	
	
}
