package TestScript;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.texila.Page.LoginPage;
import com.texila.Page.TaManagerLoginPage;
import com.texila.utils.Browser;
import com.texila.utils.ExcellReader;

public class TaManagerLoginTest2 {
	WebDriver driver;
	@BeforeMethod
	public void setUp() throws Exception {
		driver = Browser.lanchBrowser("chrome");
		String url = ExcellReader.getData("config", "url");
		driver.get(url);
	}
	//@AfterMethod
	public void tearDown() {
		Browser.closeBrowser();
	}
	
	@Test
	public void verifyTaManagerApprovalLoginPageFunctionality() throws Exception {	
		LoginPage logn = new LoginPage(driver);
		TaManagerLoginPage  tamanager = new TaManagerLoginPage(driver);
		String emailkeys = ExcellReader.getData("config", "taManagerusername");
		logn.emailTextBox(emailkeys);
		String passkeyskeys = ExcellReader.getData("config", "taManagerPassword");
		logn.passwordTextBox(passkeyskeys);
		logn.clickOnLogin();
		logn.clickOnHrProcess();
		logn.verifyHrmLogo();
		tamanager.clickOnActualPlan();
		tamanager.clickOnManpowerLink();
		Thread.sleep(2000);
		tamanager.clickOnNextPage();
		tamanager.clickOnManPowerTableIcon();
		tamanager.clickOnManPowerVewLInk();
		tamanager.clickOnAssingRequterBtn();
		tamanager.selsctRecutordropDown();
		tamanager.entemanpowerToHiredvalue();
		tamanager.clickOnReuriterSubBTn();
		tamanager.refressthePage();
		tamanager.clickOnInitiateHiringBtn();
		tamanager.selectManPowerStatusDropDown();
		tamanager.clickOnonHiringSubBtn();
		tamanager.enterOnHiringReamrktextBox();
		tamanager.clickOnremarkSubBtn();
		tamanager.clickOnTamanaherLink();
		logn.logOutBtn();
		
	}
}
