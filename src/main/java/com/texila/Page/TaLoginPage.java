package com.texila.Page;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import com.texila.utils.Browser;
import com.texila.utils.DataConfigConsTent;
import com.texila.utils.ExcellReader;

public class TaLoginPage {

		WebDriver driver;	
		public TaLoginPage(WebDriver driver) {
			 this.driver = driver;
			PageFactory.initElements(driver, this);	
		}
		
		@FindBy(xpath="//a[@title='Annual Manpower Plans']")WebElement annualPlan;
		@FindBy(xpath="//a[@title='Department Budget']") WebElement DepartMentBudget;
		@FindBy(xpath="//a[@class='custom-cursor-pointer pl-2']") WebElement addBtn;
		@FindBy(xpath="//select[@id='form_element.financial_year_id']") WebElement finacialYear;
		@FindBy(xpath="//select[@id='form_element.businuss_unit_id']") WebElement bussinessUnit;
		@FindBy(xpath="//select[@id='form_element.department_id']") WebElement DeptBudget;
		@FindBy(xpath="//input[@id='form_element.budget']") WebElement anualSalary;
		@FindBy(xpath="//select[@id='form_element.currency_id']") WebElement currenceId;
		@FindBy(xpath="//button[text()='Submit']") WebElement subBtn;
		@FindBy(xpath="//textarea[@id='form_element.remarks']") WebElement remarks;
		@FindBy(xpath="//h2[text()='Department Manpower Budget updated successfully.']") WebElement verifyMsg;
		@FindBy(xpath="//div[@class='table-responsive']//tbody//tr//td[2]//button")WebElement updateBudgetTableIcon;
		@FindBy(xpath="//div[@class='table-responsive']//tbody//tr//td[2]//a[text()=' Update Plan']")WebElement updatePlanLink;
		@FindBy(xpath="//span[text()='TA Manager']")WebElement TaManacerBtn;
		@FindBy(xpath="(//input[@id='form_element.planned_manpower'])[1]") WebElement manPower;
		@FindBy(xpath="(//input[@id='form_element.budget'])[2]") WebElement AnualBudget;
		@FindBy(xpath="(//input[@id='form_element.q1_manpower'])[1]") WebElement qoneManpower;
		@FindBy(xpath="(//input[@id='form_element.q2_manpower'])[1]") WebElement qTwoManpower;
		@FindBy(xpath="(//input[@id='form_element.q3_manpower'])[1]") WebElement qThreeManpower;
		@FindBy(xpath="(//input[@id='form_element.q4_manpower'])[1]") WebElement qFourManpower;
		@FindBy(xpath="(//button[text()='Submit'])[2]") WebElement upItemSubBtn;
		@FindBy(xpath="//p[text()='Manpower Plans']")WebElement manpowerLink;
		@FindBy(xpath="//h2[text()='Role Manpower Budget updated successfully.']") WebElement VerifyBudgetSuccessMsg;
		@FindBy(xpath="//span[text()='Annual Budget may not be greater than 1250000.']") WebElement verifyInvalidBudgetmsg;
		@FindBy(xpath="//span[text()='Total Manpower as per Org Chart Count is Mismatch with Active MP + In NP + Q1 + Q2 + Q3 + Q4']") WebElement manPowerInvalidMsg;
		@FindBy(xpath="//span[text()='Department has already been taken.']") WebElement verifyBudgetMsg;
		@FindBy(xpath="(//button[@class='close'])[1]") WebElement closeBtn;
		@FindBy(xpath="//span[text()='Logout']") WebElement logout;
		@FindBy(xpath="//span[text()='Department has already been taken.']") WebElement invalidDepatMent;
		
		
		 public void clickOnActualPlan() {
		    	annualPlan.click();
		    }
		 
		 public void clickOnDepartMentBudget() {
			 DepartMentBudget.click();
		 }
		 
		 public void clickOnAddBtn() {
			 addBtn.click();			 
		 }
		 public void selectinvaliddeptFinacialDropDown() {
			 Browser.selectVisiblitiOfText(finacialYear, "2014");
		 }
		 
		 public void selectvalidFinacialDropDown() {
			 Browser.selectVisiblitiOfText(finacialYear, "2030");
		 }
		 
		 public void selectinvalidFinacialDropDown() {
			 Browser.selectVisiblitiOfText(finacialYear, "2028");
		 }
		 
		 public void selectinvalidmanpowerFinacialDropDown() {
			 Browser.selectVisiblitiOfText(finacialYear, "2029");
		 }
		 
		 
		 public void selectBussinessUnit() {
			 Browser.selectVisiblitiOfText(bussinessUnit, "Test Perform");
		 }
		 public void selectDepartMentBudget() {
			 Browser.selectVisiblitiOfText(DeptBudget, "Dinesh");
		 }
		 
		 public void entervalidAnualSalaryTextBox() throws Exception {
			 anualSalary.sendKeys(ExcellReader.getData("config", "AnualSalary"));
		 }
		 
		 public void selectCurrenceId() {
			 Browser.selectVisiblitiOfText(currenceId, "INR");
		 }
		 
		 public void clickOnSunmitButton() {
			 subBtn.click();
		 }
		 
		 public void enterRemarkTextBox() throws Exception {
			 remarks.sendKeys(ExcellReader.getData("config", "RemarksBoxKeys"));
		 }
		 
		 public void verifyPopMsg() {
			 String successMsg = verifyMsg.getText(); 
			 System.out.println("SUccess message Is : " + successMsg);
			 Assert.assertEquals(successMsg, DataConfigConsTent.confromMsg);
		 }
		 
		 public void clickOnUpdateBudgetTableBtn() {
			 updateBudgetTableIcon.click();
		 }
		 
		 public void clickOnUpDatePlanLink() {
			 updatePlanLink.click();
		 }
		 
		 public void clickOnTaManagerIcon() throws Exception {
//			 TaManacerBtn.click();
			 Thread.sleep(3000);
			 Actions action = new Actions(driver);
			 action.click(TaManacerBtn).build().perform();
		 }
		 
		 public void clearFealds() {
			 manPower.clear();
			 AnualBudget.clear();
			 qoneManpower.clear();
			 qTwoManpower.clear();
			 qThreeManpower.clear();
			 qFourManpower.clear();
		 }
		 
		 public void enterManpowerValue() throws Exception {
			 manPower.sendKeys(ExcellReader.getData("config", "TotalManPower"));
		 }
		 
		 public void enterAnualBudget() throws Exception {
			 AnualBudget.sendKeys(ExcellReader.getData("config", "AnualBudget"));
		 }
		 
		 public void enterInvalidAnualBudget() throws Exception {
			 AnualBudget.sendKeys(ExcellReader.getData("config", "InvalisAnualSalary"));
		 }
		 
		 public void enterQOneManPower() throws Exception {
			 qoneManpower.sendKeys(ExcellReader.getData("config", "QManpower"));
		 }		 
		 public void enterQTwoManPower() throws Exception {
			 qTwoManpower.sendKeys(ExcellReader.getData("config", "QManpower"));
		 }
		 
		 public void enterQThreeManPower() throws Exception {
			 qThreeManpower.sendKeys(ExcellReader.getData("config", "QMangerTwo"));
		 }
		 
		 public void enterQinValidThreeManPower() throws Exception {
			 qThreeManpower.sendKeys(ExcellReader.getData("config", "QManpower"));
		 }
		 
		 public void enterQFourManPower() throws Exception {
			 qFourManpower.sendKeys(ExcellReader.getData("config", "QMangerTwo"));
		 }
		 
		 public void clickOnSumButtonupItem() {
			 upItemSubBtn.click();
		 }
		 
		 public void verifyValidationOfBudGetSuccesMsg() {
			String textname =  VerifyBudgetSuccessMsg.getText();
			System.out.println(textname);
			Assert.assertEquals(textname, DataConfigConsTent.veriftBudgetSuccessmsg);
		 }
		 
		 public void verifyInvalidBudgetMsg() {
			 String invalidData = verifyInvalidBudgetmsg.getText();
			 System.out.println(invalidData);
			 Assert.assertEquals(invalidData, DataConfigConsTent.verifyInvalidbudgetmsg);
		 }
		 
		 public void verifyManPowerInvalidMsg() {
			 try {
			 String manpowerdata = manPowerInvalidMsg.getText();
			 System.out.println(manpowerdata);
			 Assert.assertEquals(manpowerdata, DataConfigConsTent.verifyinvalidManPower);
			 }catch(Exception e) {
				System.out.println(e); 
			 }
		 }
		  
		 public void verifyBudgetmsg() {
		 Assert.assertTrue(verifyBudgetMsg.isDisplayed(), "Test Script faild");
		 }
		 
		 public void clickOnCloseButton() {
			 closeBtn.click();
		 }
		 
		 public void clickOnLogOut() {
			 logout.click();
		 }
		 
		 public void verifyDeportMentFeeld() {
			 String depterrordata = invalidDepatMent.getText();
			 System.out.println(depterrordata);
			 Assert.assertEquals(depterrordata, DataConfigConsTent.deptErrormsg);
		 }
		 
		 public void scrollingUP() {
//			 JavascriptExecutor js = (JavascriptExecutor) driver;
//		     js.executeScript("window.scrollBy(0,-350)", "");
			 
			 Actions action = new Actions(driver);
			 action.sendKeys(Keys.PAGE_UP).build().perform();
		 }
		 
		 
		 
		 
		 
		 
		 
		 
			 
}

   