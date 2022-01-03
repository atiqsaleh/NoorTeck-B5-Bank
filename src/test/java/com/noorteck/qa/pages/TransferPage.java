package com.noorteck.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.noorteck.qa.utils.CommonUI;

public class TransferPage extends CommonUI {
	
	@FindBy(css = ".mat-select-placeholder.ng-tns-c12-25.ng-star-inserted")
	WebElement enterAccoutnField;
	
	@FindBy(css = ".mat-select-placeholder.ng-tns-c12-27.ng-star-inserted")
	WebElement enterDistinationField;
	

	@FindBy(css = "#mat-input-11")
	WebElement enterAmountField;

	@FindBy(css = "#mat-input-12")
	WebElement enterSocialField;
	
	@FindBy(css = "#mat-input-13")
	WebElement enterATMField;
	
	@FindBy(xpath = "	//span[text()='Transfer Funds']")
	WebElement clickTransferField;
	public  TransferPage() {
		PageFactory.initElements(driver, this);
	}
public void enterAccountNumber(String account) {
	enter(enterAccoutnField, account);
}

public void enterDistanition(String distination) {
	enter(enterDistinationField, distination);
	
}
	public void enterAmount(String amount) {
		enter(enterAmountField, amount);
}
	public void enterSocialNumber(String social) {
		enter(enterSocialField, social);
		
	}
	public void enterATM(String ATM) {
		enter(enterATMField, ATM);
	}
	public void clickTransferButton() {
		click(clickTransferField);
	}
}

