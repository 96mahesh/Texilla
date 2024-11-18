package com.texila.Page;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.texila.utils.Browser;
import com.texila.utils.ExcellReader;

public class CondidatePage {

	WebDriver driver;
	
	public CondidatePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//div[@class='table-responsive']//tbody//tr[4]//td[2]//button") WebElement condidateTableIcon;
	@FindBy(xpath="//div[@class='table-responsive']//tbody//tr[4]//td[2]//a[text()=' Edit Candidate']")WebElement condidateViewLink;
	@FindBy(xpath="//select[@id='form_element.suitable_business_unit_id']") WebElement BuildUnitDropDown;
	@FindBy(xpath="//select[@id='form_element.suitable_department_id']") WebElement DeportMentDropDown;
	@FindBy(xpath="//select[@id='form_element.suitable_sub_department_id']") WebElement subDeportMentDropDown;
	@FindBy(xpath="(//select[@id='form_element.suitable_role_id'])[2]") WebElement suitableRoleDropDown;
	@FindBy(xpath="(//button[text()='Submit'])[2]") WebElement condidateSubBtn;
	@FindBy(xpath="//label[text()='Candidate Competency Remarks']//following::textarea[@id='form_element.candidate_competency_remarks']")WebElement CondidateInterViewRemark;
	@FindBy(xpath="(//button[text()='Submit'])[1]") WebElement remarkSubBtn;
	@FindBy(xpath="(//div[@class='table-responsive'])[2]//tbody//tr//td[2]//button") WebElement ShedulingInterViewTableIcon;
	@FindBy(xpath="(//div[@class='table-responsive'])[2]//tbody//tr//td[2]//a[text()=' Schedule Interview']") WebElement ShedulingInterViewBtn;
    @FindBy(xpath="//a[normalize-space()='Add']") WebElement AddBtn;
    @FindBy(xpath="(//select[@id='form_element.interview_type_id'])[1]") WebElement interviewTypeDropDown;
	@FindBy(xpath="(//select[@id='form_element.interview_level_id'])[1]")WebElement InterViewLevelDropDown;
	@FindBy(xpath="(//input[@id='form_element.from_interview_date'])[1]") WebElement InterViewdate;
	@FindBy(xpath="(//select[@id='form_element.time_duration_id'])[1]") WebElement TimeDurationDropDown;
	@FindBy(xpath="(//select[@id='form_element.interviewer_1_id'])[1]") WebElement InterViewrDropDown;
    @FindBy(xpath="(//button[text()='Submit'])[1]") WebElement interviewSubBtn;

	
	
	public void clickOnCondidateTableIcon() {
		condidateTableIcon.click();
	}
	
	public void clickOncondidateViewLink() {
		condidateViewLink.click();
	}
	
	public void selectBuildUnitDropDown() {
		Browser.selectVisiblitiOfText(BuildUnitDropDown, "Test Perform");
	}
	
	public void selectDeportmentDropDown() {
		Browser.selectVisiblitiOfText(DeportMentDropDown, "Test Perform_Department 1");
	}
	
	public void selectsubDeportMentDropDown() {
		Browser.selectVisiblitiOfText(subDeportMentDropDown, "Test Perform_Sub-Department 1");
	}
	
	public void selectsuitableRoleDropDowntDropDown() {
		Browser.selectVisiblitiOfText(suitableRoleDropDown, "QA TestPerform");
	}
	
	public void clickOnSubMitBtn() {
		condidateSubBtn.click();
	}
	
	public void enterCondidateInterViewRemark() throws Exception {
		Thread.sleep(2000);
		CondidateInterViewRemark.sendKeys(ExcellReader.getData("config", "CondidateSendKeys"));
	}
	
	public void clickOnremarhSubBtn() {
		remarkSubBtn.click();
	}
	
	public void clickOnShedulingInterViewTableIcon() {
		ShedulingInterViewTableIcon.click();
	}
	
	public void clickOnShedulingInterViewBtn() {
		ShedulingInterViewBtn.click();
	}
	
	public void switchToChildWindow() {
		Browser.switchToWindow();
	}
	
	public void clickOnAddBtn() throws InterruptedException {
		AddBtn.click();
	}
	
	public void selectInterViewTypeDropDown() throws Exception {
		Thread.sleep(2500);
		Browser.selectVisiblitiOfText(interviewTypeDropDown, "Panel Interview");
	}
	
	public void selectInterViewLevelDropDown() {
		Browser.selectVisiblitiOfText(InterViewLevelDropDown, "Level 1 Interview");
	}
	
	public void enterInterViewDate() throws Exception {
		InterViewdate.sendKeys(ExcellReader.getData("config", "InterViewData"));
	}
	public void selectTimeDurationDropDown() {
		Browser.selectVisiblitiOfText(TimeDurationDropDown, "45 Minutes");
	}
	public void selectInterViewrDropDown() {
		Browser.selectVisiblitiOfText(InterViewrDropDown, "Hiring Manager");
	}
	
	public void clickOnInterViewSubBtn() {
		interviewSubBtn.click();
	}
	
	
}
