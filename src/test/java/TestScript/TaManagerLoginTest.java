package TestScript;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.texila.Page.LoginPage;
import com.texila.Page.TaLoginPage;
import com.texila.Page.TaManagerLoginPage;
import com.texila.utils.Browser;
import com.texila.utils.ExcellReader;

public class TaManagerLoginTest {
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
	public void verifyTexillaTaManagerLoginPageFunctionality() throws Exception {	
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
		tamanager.clickOnDepartMentBudget();
		tamanager.clickOnTestPerForMErBtn();
		tamanager.clickOnTableIcon();
		tamanager.clickOnViewBtn();
		tamanager.clickOnRoleTable();		
		tamanager.clickOnUpdatePlan();
		Thread.sleep(5000);
		tamanager.clearFealds();
		Thread.sleep(2000);
		tamanager.enterManpowerValue();
		tamanager.enterAnualBudget();
		tamanager.enterQOneManPower();
		tamanager.enterQTwoManPower();
		tamanager.enterQThreeManPower();
		tamanager.enterQFourManPower();
		tamanager.clickOnSumButtonupItem();
//		logn.clickOnRecutorBtn();
//		logn.logOutBtn();
//		
		
		
	}
}
