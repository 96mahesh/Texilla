package com.texila.Page;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com.texila.utils.Browser;
import com.texila.utils.ExcellReader;

public class TaManagerLoginPage {

		WebDriver driver;	
		public TaManagerLoginPage(WebDriver driver) {
			 this.driver = driver;
			PageFactory.initElements(driver, this);	
		}
		
		@FindBy(xpath="//a[@title='Annual Manpower Plans']")WebElement annualPlan;
		@FindBy(xpath="//a[@title='Department Budget']") WebElement DepartMentBudget;
		@FindBy(xpath="//span[text()='Test Perform']") WebElement TestPerformerBtn;
		@FindBy(xpath="((//div[@class='table-responsive']/table/tbody/tr[10]/td[3])//button)[1]") WebElement TableIcon;
		@FindBy(xpath="//div[@class='table-responsive']//tbody//tr[10]//td[3]//a[text()=' View']") WebElement viewBtn;
		@FindBy(xpath="//div[@class='table-responsive']//tbody//tr[1]//td[2]//button") WebElement RoleTable;
		@FindBy(xpath="//div[@class='table-responsive']//tbody//tr[1]//td[2]//a[text()=' Update Plan']") WebElement updateplan;
		@FindBy(xpath="(//input[@id='form_element.planned_manpower'])[1]") WebElement manPower;
		@FindBy(xpath="(//input[@id='form_element.budget'])[2]") WebElement AnualBudget;
		@FindBy(xpath="(//input[@id='form_element.q1_manpower'])[1]") WebElement qoneManpower;
		@FindBy(xpath="(//input[@id='form_element.q2_manpower'])[1]") WebElement qTwoManpower;
		@FindBy(xpath="(//input[@id='form_element.q3_manpower'])[1]") WebElement qThreeManpower;
		@FindBy(xpath="(//input[@id='form_element.q4_manpower'])[1]") WebElement qFourManpower;
		@FindBy(xpath="(//button[text()='Submit'])[2]") WebElement upItemSubBtn;
		@FindBy(xpath="//p[text()='Manpower Plans']")WebElement manpowerLink;
        @FindBy(xpath="//div[@class='table-responsive']/table/tbody/tr[2]/td[3]//button")WebElement manpowerTableIcon;
        @FindBy(xpath="//div[@class='table-responsive']//tbody//tr[2]//td[3]//a[text()=' View']") WebElement manpowerTableViewLink;
        @FindBy(xpath="//a[normalize-space()='Initiate Hiring']") WebElement InitiateHiring;
        @FindBy(xpath="//a[normalize-space()='Assign Recruiter']") WebElement AssingRequter;
        @FindBy(xpath="(//select[@id='form_element.recruiter_id'])[1]") WebElement recruiterdropDown;
        @FindBy(xpath="(//input[@id='form_element.assigned_manpower'])[1]") WebElement manpowerToHired;
		@FindBy(xpath="(//button[@class='btn btn-success form_action_ele' and text()='Submit'])[1]") WebElement funSubBtn;
		@FindBy(xpath="(//select[@id='form_element.manpower_plan_status_id'])[2]") WebElement manpowerPlanStatusDropDown;
		@FindBy(xpath="(//button[@class='btn btn-success form_action_ele' and text()='Submit'])[2]") WebElement onHiringSubBtn;
		@FindBy(xpath="//textarea[@id='form_element.remarks']") WebElement OnHiringReamrk;
		@FindBy(xpath="//label[text()='Remarks']//following::button[text()='Submit']") WebElement remarkSubBtn;
		@FindBy(xpath="//button[@class='page-link' and text()='2']") WebElement nextPageBtn;
		@FindBy(xpath="//span[text()='TA Manager']") WebElement TaManagetL;
		
		
        
		 public void clickOnActualPlan() {
		    	annualPlan.click();
		    }
		 
		 public void clickOnDepartMentBudget() {
			 DepartMentBudget.click();
		 }
		 
		 public void clickOnTestPerForMErBtn() {
			 TestPerformerBtn.click();
		 }
		 
		 public void clickOnTableIcon()  {
			Actions action = new Actions(driver);
			action.click(TableIcon).build().perform();
		 }
		 
		 public void clickOnViewBtn() {
			 viewBtn.click();
		 }
		 
		 public void clickOnRoleTable()  {		
			 RoleTable.click();
		 }
		 
		 public void clickOnUpdatePlan() {
			 updateplan.click();
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
		 
		 public void enterQOneManPower() throws Exception {
			 qoneManpower.sendKeys(ExcellReader.getData("config", "QManpower"));
		 }		 
		 public void enterQTwoManPower() throws Exception {
			 qTwoManpower.sendKeys(ExcellReader.getData("config", "QManpower"));
		 }
		 
		 public void enterQThreeManPower() throws Exception {
			 qThreeManpower.sendKeys(ExcellReader.getData("config", "QMangerTwo"));
		 }
		 
		 public void enterQFourManPower() throws Exception {
			 qFourManpower.sendKeys(ExcellReader.getData("config", "QMangerTwo"));
		 }
		 
		 public void clickOnSumButtonupItem() {
			 upItemSubBtn.click();
		 }
		 
		 public void clickOnManpowerLink() {
			 manpowerLink.click();
		 }
		 
		 public void clickOnManPowerTableIcon() {
			 manpowerTableIcon.click();
		 }
		 
		 public void clickOnManPowerVewLInk() {
			 manpowerTableViewLink.click();
		 }
		 
		 public void clickOnAssingRequterBtn() {
			 AssingRequter.click();
		 }
		 
		 public void clickOnInitiateHiringBtn() throws Exception {
			 Thread.sleep(2000);
			 Actions action = new Actions(driver);
			 action.click(InitiateHiring).build().perform();
			 //InitiateHiring.click();
		 }
		 
		 public void selsctRecutordropDown() throws InterruptedException {
			 Thread.sleep(3000);
			 Browser.selectVisiblitiOfText(recruiterdropDown, "Recruiter");
		 }
		 
		 public void entemanpowerToHiredvalue() throws Exception {
			 manpowerToHired.sendKeys(ExcellReader.getData("config", "manpowerToHiredkeys"));
		 }
		
		 public void clickOnReuriterSubBTn() throws InterruptedException {
			
			 funSubBtn.click();
		 }
		 
		 public void selectManPowerStatusDropDown() {
			 Browser.selectVisiblitiOfText(manpowerPlanStatusDropDown, "On Hiring");
		 }
		 
		 public void clickOnonHiringSubBtn() {
			 onHiringSubBtn.click();
		 }
		 
		 public void enterOnHiringReamrktextBox() throws Exception {
			 //((JavascriptExecutor) driver).executeScript("argument[0].scrollIntoView()", "OnHiringReamrk");
			 OnHiringReamrk.sendKeys(ExcellReader.getData("config", "OnHiringReamrkkeys"));
		 }
		 
		 public void clickOnremarkSubBtn() {
			 remarkSubBtn.click();
		 }
		 
		 public void clickOnNextPage() {
//			 nextPageBtn.click();
			 Actions action = new Actions(driver);
			 action.click(nextPageBtn).build().perform();
		 }
		 
		 public void clickOnTamanaherLink() {
//			 TaManagetL.click();
			 Actions action = new Actions(driver);
			 action.click(TaManagetL).build().perform();
		 }
		 
		 public void refressthePage() {
			 driver.navigate().refresh();
		 }
			 
}

   