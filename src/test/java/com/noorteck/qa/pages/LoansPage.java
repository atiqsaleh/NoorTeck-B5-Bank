package com.noorteck.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.noorteck.qa.utils.CommonUI;

public class LoansPage extends CommonUI {
	@FindBy(css = "#mat-input-26")
	WebElement enterNameField;

	@FindBy(xpath = "//*[@id='mat-input-27']")
	WebElement enterEmailField;
	@FindBy(css = ".mat-select-placeholder.ng-tns-c12-63.ng-star-inserted\r\n")
	WebElement enterLoanTypeField;

	@FindBy(css = "#mat-input-28")
	WebElement enterReapyLoanField;

	@FindBy(xpath = "//*[@id=\"cdk-step-content-4-0\"]/form/div/button/span")
	WebElement clickNextButton;

	@FindBy(css = "#mat-input-59")
	WebElement enterAccountNumber;

	@FindBy(xpath = "//*[@placeholder='Ex. Smith']")
	WebElement enterMadienName;

	@FindBy(xpath = "//*[@placeholder='Format: XXX-XX-XXXX']")
	WebElement enterSocialNumber;

	@FindBy(xpath = "//*[@id=\"cdk-step-content-4-1\"]/form/div/button[1]/span")
	WebElement clickBackButton;

	@FindBy(xpath = "//*[@id=\"cdk-step-content-4-1\"]/form/div/button[2]")
	WebElement clickNextButton1;

	@FindBy(xpath = "//span[text()='Confirm']")
	WebElement clickConfirmButton;

	@FindBy(xpath = "//*[@id=\"cdk-step-content-4-2\"]/div/button[2]/span")
	WebElement clickBackSecondTime;

	@FindBy(xpath = "//*[@id=\"cdk-step-content-4-2\"]/div/button[3]/span")
	WebElement clickResetButton;

	public  LoansPage() {
		PageFactory.initElements(driver, this);
	}

	public  void enterName(String name) {
		enter(enterNameField, name);
	}

	public  void enterEmail(String email) {
		enter(enterEmailField, email);
	}

	public  void enterRepayLoan(String repay) {
		enter(enterLoanTypeField, repay);
	}

	public  void clickNextButton() {
		click(clickNextButton);
	}

	public  void enterAccountNumber(String accountNumber) {
		enterAccountNumber(accountNumber);
	}

	public  void enterSocialNumber(String socialNumber) {
		enterSocialNumber(socialNumber);
	}
	
	public  void clickBacktButton() {
		click(clickBackButton);
	}
	
	public  void clickNexttButton1() {
		click(clickNextButton1);
	}
		
	public  void clickConfirmButton() {
		click(clickConfirmButton);
	}
	public  void clickBackSeconTime() {
		click(clickBackSecondTime);
	}
		public  void clickResetButton() {
			click(clickResetButton);
			
		
		
		
		
		
		
		
		
		
		
	}

}
