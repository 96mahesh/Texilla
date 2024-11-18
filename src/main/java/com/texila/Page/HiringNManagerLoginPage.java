package com.texila.Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.texila.utils.Browser;
import com.texila.utils.ExcellReader;

public class HiringNManagerLoginPage {

	WebDriver driver;
	
	public HiringNManagerLoginPage(WebDriver driver) {
			this.driver = driver;
			PageFactory.initElements(driver, this);	
	}
	
	@FindBy(xpath="//p[text()='Scheduled Interviews (HM)']") WebElement shedulingInterView;
	@FindBy(xpath="//div[@class='table-responsive']//tbody//tr[1]//td[3]//button") WebElement HrmanagerTableIcon;
	@FindBy(xpath="//div[@class='table-responsive']//tbody//tr[1]//td[3]//a[text()=' View']") WebElement hrManagerViewLink;
	@FindBy(xpath="//select[@id='form_element.interview_status_id']") WebElement interViewStatusDropDown;
	@FindBy(xpath="//select[@id='form_element.candidate_interview_status_id']") WebElement CondidateInterviewStatusDropDown;
	@FindBy(xpath="//textarea[@id='form_element.role_based_questions_feedback']") WebElement roleBasedfeedback;
	@FindBy(xpath="//textarea[@id='form_element.general_feedback']") WebElement genaralFeedback;
	@FindBy(xpath="//textarea[@id='form_element.competency_remarks']") WebElement compatancyRemark;
	@FindBy(xpath="(//h3[normalize-space()='Interview Remarks']//following::button[text()='Submit'])[1]") WebElement interviewStatusSubBtn;


	public void clickOnShedulingInterView() {
		shedulingInterView.click();
	}
	
	public void clickOnHrmanagerTableIcon() {
		HrmanagerTableIcon.click();
	}
	
	public void clickOnHrManagerViewLInk() {
		hrManagerViewLink.click();
	}
	
	public void selectInterViewStatusDropDown() {
		Browser.selectVisiblitiOfText(interViewStatusDropDown, "Completed");
	}
	
	public void selectCondidateInterviewStatusDropDown() {
		Browser.selectVisiblitiOfText(CondidateInterviewStatusDropDown, "Shortlisted");
	}
	
	public void enterRoleBasedfeedbackTestBox() throws Exception {
		Thread.sleep(3000);
		roleBasedfeedback.clear();
		Thread.sleep(2000);
		roleBasedfeedback.sendKeys(ExcellReader.getData("config", "FeedbacksKeyValues"));
	}
	
	public void entergenaralfeedbackTestBox() throws Exception {
		Thread.sleep(3000);
		genaralFeedback.clear();
		Thread.sleep(2000);
		genaralFeedback.sendKeys(ExcellReader.getData("config", "FeedbacksKeyValues"));
	}
	
	public void enterCompatancyremarkTestBox() throws Exception {
		Thread.sleep(3000);
		compatancyRemark.sendKeys(ExcellReader.getData("config", "FeedbacksKeyValues"));
	}
	
	public void clickOninterviewStatusSubBtn() {
		interviewStatusSubBtn.click();
	}
}
