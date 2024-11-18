package TestScript;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.texila.Page.CondidatePage;
import com.texila.Page.LoginPage;
import com.texila.utils.Browser;
import com.texila.utils.ExcellReader;
import com.texila.utils.ExtentReportManager;

public class CondidateTest {

	WebDriver driver;
	String imegename;
	int count = 0;
	@BeforeMethod
	public void setUp() throws Exception {
		driver = Browser.lanchBrowser("chrome");
		String url = ExcellReader.getData("config", "url");
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
		CondidatePage con = new CondidatePage(driver);
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
		con.clickOnCondidateTableIcon();
		con.clickOncondidateViewLink();
		con.selectBuildUnitDropDown();
		con.selectDeportmentDropDown();
		con.selectsubDeportMentDropDown();
		con.selectsuitableRoleDropDowntDropDown();
		con.clickOnSubMitBtn();
		con.enterCondidateInterViewRemark();
		con.clickOnremarhSubBtn();
		con.clickOnShedulingInterViewTableIcon();
		con.clickOnShedulingInterViewBtn();
		con.switchToChildWindow();
		con.clickOnAddBtn();
		con.selectInterViewTypeDropDown();
		con.selectInterViewLevelDropDown();
		con.enterInterViewDate();
		con.selectTimeDurationDropDown();
		con.selectInterViewrDropDown();
		con.clickOnInterViewSubBtn();
//		logn.clickOnRecutorBtn();
//		logn.logOutBtn();
		
		
		
	}
}
