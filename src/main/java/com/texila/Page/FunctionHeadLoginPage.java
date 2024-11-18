package com.texila.Page;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.texila.utils.DataConfigConsTent;
import com.texila.utils.ExcellReader;

public class FunctionHeadLoginPage {


	WebDriver driver;	
	public FunctionHeadLoginPage(WebDriver driver) {
		 this.driver = driver;
		PageFactory.initElements(driver, this);	
	}
	
	@FindBy(xpath="//p[text()='Department Manpower (FH)']")WebElement DptManPower;
	@FindBy(xpath="((//div[@class='table-responsive']/table/tbody/tr[3]/td[3])//button)[1]") WebElement FunctionHeadTableIcon;
	@FindBy(xpath="//div[@class='table-responsive']//tbody//tr[3]//td[3]//a[text()=' View']") WebElement FunctionHeadViewLink;
	@FindBy(xpath="//div[@class='table-responsive']//tbody//tr[1]//td[2]//a[text()=' View / Add New Plan']") WebElement viewAndNewPlanBtn;
	@FindBy(xpath="(//div[@class='table-responsive']//tbody//tr[1]//td[2])[2]") WebElement FubHEadTable;
	@FindBy(xpath="(//div[@class='table-responsive']//tbody//tr[1]//td[2])[2]//a[text()=' Update Manpower']") WebElement updateManpowerBtn;
	@FindBy(xpath="//h3[normalize-space()='Manpower Plans']") WebElement scroll;
	@FindBy(xpath="(//input[@id='form_element.full_time_manpower'])[1]") WebElement fulltimeManpowerkeys;
	@FindBy(xpath="(//input[@id='form_element.part_time_manpower'])[1]") WebElement partTimeManpower;
	@FindBy(xpath="(//button[text()='Submit'])[1]") WebElement funsubBtn;
	@FindBy(xpath="//div[@class='table-responsive']//tbody//tr[2]//td[2]") WebElement FunftionalHeadQManpowerTwo;
	@FindBy(xpath="//div[@class='table-responsive']//tbody//tr[2]//td[2]//a[text()=' Update Manpower']") WebElement FunftionalHeaduptmanpowerTwo; 
	@FindBy(xpath="(//input[@id='form_element.full_time_manpower'])[1]") WebElement fulltimeManpowerkeysBox;
	@FindBy(xpath="(//input[@id='form_element.part_time_manpower'])[1]") WebElement partTimeManpowerBox;
	@FindBy(xpath="//h2[text()='Manpower Plans updated successfully.']") WebElement verifyManpowerSuccessmsgFh;
	@FindBy(xpath="//span[contains(text(),'PT + FT Manpower Total not matched')]") WebElement VerifyNegitiveManPower;
	@FindBy(xpath="//span[contains(text(),'Part Time Manpower must be an integer.')]") WebElement verifyPartTimeManPowerValidition;
	@FindBy(xpath="//span[text()='Functional Head']") WebElement FunctionalHead;
	@FindBy(xpath="(//button[@class='close'])[1]") WebElement closeBtn;
	
	public void clickOnFunctionalHeadTableIconBtn() {
		FunctionHeadTableIcon.click();
	}
	
	public void clickOnFunctionHeadViewLinkBtn() {
		FunctionHeadViewLink.click();
	}
	
	public void clickOnDepartMentManPower() {
		DptManPower.click();
	}
	
	public void clickOnviewAndNewPlanBtn() {
		viewAndNewPlanBtn.click();
	}
	
	public void scrollTheDisplyElement() {
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true)", scroll);
	}
	
	public void clickOnFunctiolHead() {
		FubHEadTable.click();
	}
	
	public void clickOnUpdateManpowerBtn() {
		updateManpowerBtn.click();
	}
	
	public void clearFealds() {
		fulltimeManpowerkeys.clear();
		partTimeManpower.clear();
	}
	
	public void enterfulltimeManpowervalues() throws Exception {
		Thread.sleep(5000);
		fulltimeManpowerkeys.sendKeys(ExcellReader.getData("config", "fullTimeManPower"));
	}
	
	public void enterparttimeManpowervalues() throws Exception {
		Thread.sleep(5000);
		partTimeManpower.sendKeys(ExcellReader.getData("config", "partTimeManPower"));
	}
	
	public void enterInvalidparttimeManpowervalues() throws Exception {
		Thread.sleep(5000);
		partTimeManpower.sendKeys(ExcellReader.getData("config", "negitivePartTimeManPower"));
	}
		
	public void clickOnFunSunBtn() {
		funsubBtn.click();
	}
	
	public void clickOFunftionalHeadQManpowerTwoBtn() throws Exception{
		Thread.sleep(3000);
	FunftionalHeadQManpowerTwo.click();
	}
	
	public void clickOnFunftionalHeaduptmanpowerTwoBtn() {
		FunftionalHeaduptmanpowerTwo.click();
	}
	
	public void clearmnpFealds() {
		fulltimeManpowerkeysBox.clear();
		partTimeManpowerBox.clear();
	}
	
	
	public void enterfulltimeManpowervaluesTwoBox() throws Exception {
		Thread.sleep(2000);
		fulltimeManpowerkeysBox.sendKeys(ExcellReader.getData("config", "fullTimeManPower"));
	}
	
	public void enterparttimeManpowervaluesTwoBox() throws Exception {
		Thread.sleep(2000);
		partTimeManpowerBox.sendKeys(ExcellReader.getData("config", "partTimeManPower"));
	}
	
	public void enterInvalidparttimeManpowervaluesTwoBox() throws Exception {
		Thread.sleep(2000);
		partTimeManpowerBox.sendKeys(ExcellReader.getData("config", "negitivePartTimeManPower"));
	}
	
	public void verifyManPowerMessage() {
		Assert.assertTrue(verifyManpowerSuccessmsgFh.isDisplayed(), "Test Script failed");
	}
	
	public void verifyNegitiveManPowerValue() {
		String invalidData = VerifyNegitiveManPower.getText();
		System.out.println(invalidData);
		Assert.assertEquals(invalidData, DataConfigConsTent.verifyFunctionalityManpowerNegitiveValue);
	}
	
	public void verifyPartTimeManPowerFealdValiDation() {
		String partManpowerData = verifyPartTimeManPowerValidition.getText();
		System.out.println(partManpowerData);
		Assert.assertEquals(partManpowerData, DataConfigConsTent.verifyPartTimeValidation);
	}
	
	public void clickOnFunctionalHeadBtn() throws Exception {
		//FunctionalHead.click();
		Thread.sleep(3000);
		Actions action = new Actions(driver);
		action.click(FunctionalHead).build().perform();
	}
	
	public void clickOnClosebutton() throws Exception{
		//Thread.sleep(3000);
		closeBtn.click();
	}
}
