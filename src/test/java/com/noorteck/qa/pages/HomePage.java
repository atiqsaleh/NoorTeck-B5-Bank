package com.noorteck.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.noorteck.qa.utils.CommonUI;

public class HomePage extends CommonUI{
	
	@FindBy(xpath = "//span[text()='Home']")
	WebElement transferButtonField;

	@FindBy(xpath = "//span[text()='Loans']")
	WebElement loanButtonField;
	
	@FindBy(xpath = "//span[text()='LogOut']")
	WebElement logOutButtonField;
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	public void clickTransfer() {
		clickTransfer();
	}
	public void clickLoan () {
		clickLoan();
	}
	public void clickLogOut () {
		clickLogOut();
		



	}
}
