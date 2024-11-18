package TestScript;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.texila.Page.LoginPage;
import com.texila.utils.Browser;
import com.texila.utils.ExcellReader;
import com.texila.utils.ExtentReportManager;



public class LoginPageTest2 {

	
	WebDriver driver;
	String imegename;
	int count = 0;
	@BeforeMethod
	public void setUp() throws Exception {
		driver = Browser.lanchBrowser("chrome");
		String url = ExcellReader.getData("config", "url");
		driver.get(url);
	}
	//@AfterMethod
	public void tearDown() throws Exception {
		Browser.tackScreenShot("imegename");
		ExtentReportManager.stopReport();
		Browser.closeBrowser();
	}
	
	@Test
	public void verifyRecutorLoginPageFunctionality() throws Exception {	
		LoginPage logn = new LoginPage(driver);
	    imegename = "verifyLoginPageFunctionality"+count++;
		System.out.println(imegename);
		String emailkeys = ExcellReader.getData("config", "recurtorusername");
		logn.emailTextBox(emailkeys);
		String passkeyskeys = ExcellReader.getData("config", "recurtorpassword");
		logn.passwordTextBox(passkeyskeys);
		logn.clickOnLogin();
		logn.clickOnHrProcess();
		Browser.tackScreenShot("Image Name 1");
//		logn.verifyHrmLogo();
//		logn.clickOnHairingListLink();
//		logn.clickOnNextPageLink();
//		logn.clickOnmnpHiringListTableIcon();
//		logn.clickOnmnpHiringViewLink();
//		logn.handleAlert();
//		logn.clickOHiringCondidateLink();
//		logn.clickOnHiringCondidateAddLink();
//		logn.EnterCondidateRemarkTextBox();
//		logn.clickOncondidateSubBtn();
//		logn.clickOnRecutorBtn();
//		logn.logOutBtn();
//		logn.clickONHiringStatusTableBtn();
//		logn.clickOnHiringStatusViewLink();
	}
}
