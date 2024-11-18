package com.texila.Page;

import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import com.texila.utils.ExcellReader;
import com.texila.utils.ExtentReportManager;

public class LoginPage {

	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		 this.driver = driver;
		PageFactory.initElements(driver, this);	
	}
	
	@FindBy(xpath="//input[@placeholder='Email']")WebElement email;
	@FindBy(xpath="//input[@placeholder='Password']") WebElement pass;
	@FindBy(xpath="//button[@type='submit']")WebElement login;
	@FindBy(xpath="//h5[text()='HR Process']") WebElement hrProcess;
	@FindBy(xpath="//a[@class='brand-link logo-switch pb-3 pt-3']") WebElement hrfValidation;
	@FindBy(xpath="//p[text()='Candidates']") WebElement codidates;
	@FindBy(xpath="//a[@class='custom-cursor-pointer pl-2']") WebElement addCustomer;
	@FindBy(xpath="//input[@id='form_element.candidate_name']") WebElement condidatename;
	@FindBy(xpath="//select[@id='form_element.candidate_source_id']") WebElement condidatesource;
	@FindBy(xpath="//select[@id='form_element.referal_employee_id']") WebElement referelDropdown;
	@FindBy(xpath="//input[@id='form_element.mobile_1']") WebElement mobileno;
	@FindBy(xpath="//input[@id='form_element.mobile_2']") WebElement secMob;
	@FindBy(xpath="//input[@id='form_element.experience_in_years']") WebElement expyear;
	@FindBy(xpath="//input[@id='form_element.experience_in_months']") WebElement expmonth;
	@FindBy(xpath="//input[@id='form_element.email']") WebElement emailAddrss;
	@FindBy(xpath="//input[@id='form_element.secondary_email']") WebElement secemailAddrss;
	@FindBy(xpath="//select[@id='form_element.candidate_status_id']") WebElement condstatusDropdown;
	@FindBy(xpath="//input[@id='form_element.current_job_title']") WebElement jobTitle;
	@FindBy(xpath ="//input[@id='form_element.current_organization']") WebElement currentOrg;
	@FindBy(xpath ="//input[@id='form_element.currently_in_notice']") WebElement cnc;
	@FindBy(xpath ="//input[@id='form_element.last_working_day']") WebElement lastworkingDay; 
	@FindBy(xpath ="//input[@id='form_element.notice_period']") WebElement noticePeriod;
	@FindBy(xpath ="//input[@id='form_element.relevant_experience']") WebElement revExp;
	@FindBy(xpath ="//input[@id='form_element.current_ctcmonth']") WebElement currentctc;
	@FindBy(xpath ="//input[@id='form_element.expected_ctcmonth']") WebElement expectedCtc;
	@FindBy(xpath ="//input[@id='form_element.resume_filename']") WebElement uploadBtn;
	@FindBy(xpath ="//button[text()='Submit']") WebElement submitBtn;
	@FindBy(xpath="//p[text()='Hiring List  (Rec)']") WebElement HiringList;
	@FindBy(xpath="//div[@class='table-responsive']//tbody//tr[8]//td[3]//button") WebElement mnpHiringListTableIcon;
	@FindBy(xpath="//div[@class='table-responsive']//tbody//tr[8]//td[3]//a[text()=' View']") WebElement mnpHiringViewLink;
	@FindBy(xpath="(//div[@class='table-responsive']//tbody//tr[1]//td[3]//button)[1]") WebElement HiringCondidate;
	@FindBy(xpath="//div[@class='table-responsive']//tbody//tr[1]//td[3]//a[text()=' Add']") WebElement HiringCondidateAddLink;
	@FindBy(xpath="(//textarea[@id='form_element.remarks'])[1]") WebElement CondidateRemark;
	@FindBy(xpath="(//button[text()='Submit'])[1]") WebElement condidateSubBtn;
	@FindBy(xpath="//div[@class='table-responsive']//table[@id='1180404009']//tbody//tr//td[3]//button") WebElement HiringStatusTable;
	@FindBy(xpath="//div[@class='table-responsive']//table[@id='1180404009']//tbody//tr//td[3]//a[text()=' View']") WebElement HiringStatusViewLink;
	@FindBy(xpath="//span[text()='Recruiter']")WebElement recutorBtn; 
	@FindBy(xpath="//span[text()='Logout']")WebElement logout;
	@FindBy(xpath="//button[@class='page-link' and text()='8']") WebElement nextPageLink;
	
	public void emailTextBox(String keys) throws Exception {
		email.sendKeys(keys);
		ExtentReportManager.logInfo("Enter Email id pass");
	}
	
	public void passwordTextBox(String passkeys) {
		pass.sendKeys(passkeys);
		ExtentReportManager.logInfo("Enter Password id pass");
	}
	
	public void clickOnLogin() {
		login.click();
		ExtentReportManager.logInfo("ClickOnLogin");
	}
	
	public void clickOnHrProcess() {
		hrProcess.click();
	}
	
	public void verifyHrmLogo() {	 
	Assert.assertTrue(hrfValidation.isDisplayed(), "Test Script failed because logo not Visibled");
		
	}
	
	public void clickOnCondidates() {
		codidates.click();
	}
	
	public void clickOnAddCustomer() {
		addCustomer.click();
	}
	
	public void userEnterCondidateName(String conname) {
		condidatename.sendKeys(conname);
	}
	
	public void condiatesourceDropDown() {
		Select select = new Select(condidatesource);
		List<WebElement> alloptions =select.getOptions();
		List<String> weboptins = new ArrayList<String>();
		for (WebElement ele : alloptions) {
			String data = ele.getText();
			weboptins.add(data);
			System.out.println(data);
		}
		int size = weboptins.size();
		System.out.println(size);
		select.selectByVisibleText("Naukri");
	}
	
	
	public void referelDropDown() {
		Select select = new Select(referelDropdown);
		List<WebElement> alloptions =select.getOptions();
		List<String> weboptins = new ArrayList<String>();
		for (WebElement ele : alloptions) {
			String data = ele.getText();
			weboptins.add(data);
			System.out.println(data);
		}
		int size = weboptins.size();
		System.out.println(size);
		select.selectByVisibleText("Recruiter");
	}
	
	public void enterMobNo() throws Exception {
		String mobno = ExcellReader.getData("config", "codmno1");
		mobileno.sendKeys(mobno);
	}
	
	public void enterSecMobNo()throws Exception {
		String mobno = ExcellReader.getData("config", "codmno2");
		secMob.sendKeys(mobno);
	}
	
	public void expYearTextBox() throws Exception {
		expyear.sendKeys(ExcellReader.getData("config", "ExpYear"));
	}
	
	public void expMonthTextBox() throws Exception {
		expmonth.sendKeys(ExcellReader.getData("config", "expMonth"));
	}
	
	public void enterEmailTextBox() throws Exception {
		emailAddrss.sendKeys(ExcellReader.getData("config", "EmailAddress"));
	}
	
	public void enterSecEmailTextBox() throws Exception {
		secemailAddrss.sendKeys(ExcellReader.getData("config", "SecEmailAddress"));
	}
	
	public void conStatusDropDown() {
		Select select = new Select(condstatusDropdown);
		List<WebElement> alloptions =select.getOptions();
		List<String> weboptins = new ArrayList<String>();
		for (WebElement ele : alloptions) {
			String data = ele.getText();
			weboptins.add(data);
			System.out.println(data);
		}
		int size = weboptins.size();
		System.out.println(size);
		select.selectByVisibleText("Serving Notice Period");
	}
	
	public void codiDateJobTitle() throws Exception {
		jobTitle.sendKeys(ExcellReader.getData("config", "conJobTitle"));
	}
	
	public void currentOrg() throws Exception {
		currentOrg.sendKeys(ExcellReader.getData("config", "currentOrgnization"));
	}
	
	public void clickOnCNC() throws Exception {
		cnc.click();
	}
	
	public void clickOnLwc() throws Exception {
		lastworkingDay.sendKeys(ExcellReader.getData("config", "lastWorkinDay"));
	}
	
	public void noticrPeriodSearchBox() throws Exception {
		noticePeriod.sendKeys(ExcellReader.getData("config", "noticeperiod")); 
	}
	
	public void releventExp() throws Exception {
		revExp.sendKeys(ExcellReader.getData("config", "ReleventExp"));
	}
	
	public void currentCtc() throws Exception {
		currentctc.sendKeys(ExcellReader.getData("config", "CtcForMonth"));
	}
	
	public void expectedCtc() throws Exception {
		expectedCtc.sendKeys(ExcellReader.getData("config", "ExpectedCtc"));
	}
	
	public void uploadFile() throws Exception {
		Thread.sleep(2000);
		 Actions action = new Actions(driver);
		 action.click(uploadBtn).build().perform();		
	}
	
	public void uploadFileThrowAutoIt() throws Exception {
		Thread.sleep(2000);
		Runtime.getRuntime().exec("C:\\Users\\Admin\\Desktop\\AutoIt.exe");
	}
	
	public void clickOnSubMit() throws Exception  {
		submitBtn.click();
	}
	
	public void clickOnHairingListLink() {
		HiringList.click();
	}
	
	public void clickOnmnpHiringListTableIcon() {
		mnpHiringListTableIcon.click();
	}
	
	public void clickOnmnpHiringViewLink() {
		mnpHiringViewLink.click();
	}
	
	public void clickOHiringCondidateLink() {
		HiringCondidate.click();
	}
	
	public void clickOnHiringCondidateAddLink() {
		HiringCondidateAddLink.click();
	}
	
	public void EnterCondidateRemarkTextBox() throws Exception {
		Thread.sleep(2000);
		CondidateRemark.sendKeys(ExcellReader.getData("config", "CondidateRemarkKeys"));
	}
	
	public void clickOncondidateSubBtn() {
		condidateSubBtn.click();
	}
	
	public void clickONHiringStatusTableBtn() {
		HiringStatusTable.click();
	}
	
	public void clickOnHiringStatusViewLink() {
		HiringStatusViewLink.click();
	}
	
	public void clickOnRecutorBtn() throws Exception {
		Thread.sleep(5000);
		Actions action = new Actions(driver);
		action.click(recutorBtn).build().perform();
		//recutorBtn.click();
	}
	
	public void logOutBtn() {
		logout.click();
//		Actions action = new Actions(driver);
//		action.click(logout).build().perform();
	}
	
	public void clickOnNextPageLink()throws Exception{
		Thread.sleep(2000);
		nextPageLink.click();
	}
	
	public void handleAlert() throws Exception {
		Thread.sleep(1500);
		Alert alert = driver.switchTo().alert();
		Thread.sleep(1500);
		alert.sendKeys("1");
		Thread.sleep(1500);
		alert.accept();
	}
		
}
