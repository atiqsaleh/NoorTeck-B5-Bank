package com.noorteck.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.noorteck.qa.utils.CommonUI;

public class TransferPage extends CommonUI {
	@FindBy(css = "body > app-root > mat-sidenav-container > mat-sidenav-content > mat-toolbar > div:nth-child(4) > ul > li:nth-child(2) > a > span")
	WebElement clickTransferButton;

	@FindBy(xpath = "//*[@id=\"mat-select-0\"]/div/div[1]/span")
	WebElement clickPersonalInfo;

	@FindBy(xpath = "//*[@id=\"mat-option-2\"]/span")
	WebElement clickTextField;

	@FindBy(xpath = "//*[@id=\"mat-select-1\"]/div/div[1]/span")
	WebElement clickDistinationField;
	
	@FindBy(xpath = "//*[@id=\"mat-option-8\"]/span")
	WebElement clickInvestingtext;
	
	@FindBy(xpath = "//*[@id=\"mat-input-0\"]")
	WebElement enterAmount;


	@FindBy(xpath = "//*[@id=\"mat-input-1\"]")
	WebElement enterSocialField;

	@FindBy(xpath = "//*[@id=\"mat-input-2\"]")
	WebElement enterATMPIN;

	@FindBy(xpath = "//span[text()='Transfer Funds']")
	WebElement clickTransferField;

	public TransferPage() {
		PageFactory.initElements(driver, this);
	}

	public void clickTransfer() {

		click(clickTransferButton);
	}

	public void clickPersonalInfo() {

		click(clickPersonalInfo);
	}

	public void clickPersonalAndClick() {
		moveToElementAndClick(clickTextField);
		

	}
	public void clickDestinationInfo() {

		click(clickDistinationField);

	}
	public void clickDestinationAndClick() {

		moveToElementAndClick(clickInvestingtext);
	}

	public void enterAmount(String amount) {
		enter(enterAmount, amount);
	}

	public void enterSocialNumber(String social) {
		enter(enterSocialField, social);

	}

	public void enterATMNumber(String ATM) {
		enter(enterATMPIN, ATM);
	}

	public void clickTransferButton() {
		click(clickTransferField);
	}
}
