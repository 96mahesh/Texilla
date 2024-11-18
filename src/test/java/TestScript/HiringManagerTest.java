package TestScript;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.texila.Page.HiringNManagerLoginPage;
import com.texila.Page.LoginPage;
import com.texila.utils.Browser;
import com.texila.utils.ExcellReader;

public class HiringManagerTest {

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
		Browser.closeBrowser();
	}
	
	@Test
	public void verifyTexillaHiringManagerLoginPageFunctionality() throws Exception {	
		LoginPage logn = new LoginPage(driver);
		HiringNManagerLoginPage hrManager = new HiringNManagerLoginPage(driver);
	    imegename = "verifyLoginPageFunctionality"+count++;
		System.out.println(imegename);
		String emailkeys = ExcellReader.getData("config", "HiringManagerUserName");
		logn.emailTextBox(emailkeys);
		String passkeyskeys = ExcellReader.getData("config", "HiringManagerPassword");
		logn.passwordTextBox(passkeyskeys);
		logn.clickOnLogin();
		logn.clickOnHrProcess();
		logn.verifyHrmLogo();
		hrManager.clickOnShedulingInterView();
		hrManager.clickOnHrmanagerTableIcon();
		hrManager.clickOnHrManagerViewLInk();
		hrManager.selectInterViewStatusDropDown();
		hrManager.selectCondidateInterviewStatusDropDown();
		hrManager.enterRoleBasedfeedbackTestBox();
		hrManager.entergenaralfeedbackTestBox();
		hrManager.enterCompatancyremarkTestBox();
		hrManager.clickOninterviewStatusSubBtn();
//		logn.clickOnRecutorBtn();
//		logn.logOutBtn();
	}
}
