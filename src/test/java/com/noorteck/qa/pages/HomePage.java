package com.noorteck.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.noorteck.qa.utils.CommonUI;

public class HomePage extends CommonUI{
	
	@FindBy(xpath ="/html/body/app-root/mat-sidenav-container/mat-sidenav-content/mat-toolbar/div[3]/ul/li[1]/a/span")
	WebElement transferButtonField;

	@FindBy(xpath ="/html/body/app-root/mat-sidenav-container/mat-sidenav-content/mat-toolbar/div[3]/ul/li[4]/a/span")
	WebElement loanButtonField;
	
	@FindBy(xpath ="/html/body/app-root/mat-sidenav-container/mat-sidenav-content/mat-toolbar/div[3]/ul/li[5]/a/span/html/body/app-root/mat-sidenav-container/mat-sidenav-content/mat-toolbar/div[3]/ul/li[5]/a/span")
	WebElement logOutButtonField;
	
	public   HomePage() {
		PageFactory.initElements(driver, this);
	}
	public  void clickTransfer() {
		clickTransfer();
	}
	public  void clickLoan () {
		clickLoan();
	}
	public  void clickLogOut () {
		clickLogOut();
		
		
		
		//// i have to push this to remote repository



	}
}
