package TestScript;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.texila.Page.LoginPage;
import com.texila.utils.Browser;
import com.texila.utils.ExcellReader;
import com.texila.utils.ExtentReportManager;



public class LoginPageTest {

	
	WebDriver driver;
	String imegename;
	int count = 0;
	@BeforeMethod
	public void setUp() throws Exception {
		String celldata = ExcellReader.getData("info", "Sheet1", 1, 0);
		driver = Browser.lanchBrowser(celldata);
		String url = ExcellReader.getData("info", "Sheet1",1,1);
		driver.get(url);
		ExtentReportManager.startTest(url, url, url);
	}
	//@AfterMethod
	public void tearDown() throws Exception {
		Browser.tackScreenShot("imegename");
		Browser.closeBrowser();
	}
	
	@Test
	public void verifyTexillaRecutorLoginPageFunctionality() throws Exception {	
		LoginPage logn = new LoginPage(driver);
	    imegename = "verifyLoginPageFunctionality"+count++;
		System.out.println(imegename);
		String emailkeys = ExcellReader.getData("config", "recurtorusername");
		logn.emailTextBox(emailkeys);
		String passkeyskeys = ExcellReader.getData("config", "recurtorpassword");
		logn.passwordTextBox(passkeyskeys);
		logn.clickOnLogin();
		logn.clickOnHrProcess();
		logn.verifyHrmLogo();
		logn.clickOnCondidates();
		logn.clickOnAddCustomer();
		String conName = ExcellReader.getData("config", "condidatename");
		logn.userEnterCondidateName(conName);
		logn.condiatesourceDropDown();
		logn.referelDropDown();
		logn.enterMobNo();
		logn.enterSecMobNo();
		logn.expYearTextBox();
		logn.expMonthTextBox();
		logn.enterEmailTextBox();
		logn.enterSecEmailTextBox();
		logn.conStatusDropDown();
		logn.codiDateJobTitle();
		logn.currentOrg();
		logn.clickOnCNC();
		logn.clickOnLwc();
		logn.noticrPeriodSearchBox();
		logn.releventExp();
		logn.currentCtc();
		logn.expectedCtc();
		logn.uploadFile();
		logn.uploadFileThrowAutoIt();
		logn.clickOnSubMit();
		logn.clickOnRecutorBtn();
		logn.logOutBtn();
	}
}
