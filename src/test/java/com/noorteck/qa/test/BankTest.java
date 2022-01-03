package com.noorteck.qa.test;

import com.noorteck.qa.utils.CommonUI;
import com.noorteck.qa.utils.ObjInitialize;

public class BankTest extends ObjInitialize {

	public static void main(String[] args) {
		String url = "https://usdemo.vee24.com/#/transactions";
	CommonUI commonUIObj = new CommonUI();
	ObjInitialize obj = new ObjInitialize();
	BankTest testObj = new BankTest();
	commonUIObj.openBrowser("chrome");
	commonUIObj.navigate(url);
	testObj.homePageTest();
	testObj.loansPageTest();
	testObj.TransferPageTest();
	
	
	}
public void homePageTest() {
	homeObj.clickTransfer();
	homeObj.clickLoan();
	homeObj.clickLogOut();
}
public void loansPageTest() {
	loanObj.enterName("Samer");
	loanObj.enterEmail("samersaleh@gmail.com");
	loanObj.enterRepayLoan("Deposit");
	loanObj.clickNextButton();
	loanObj.clickBacktButton();
	loanObj.clickNexttButton1();
	loanObj.clickConfirmButton();
	loanObj.clickBackSeconTime();
	loanObj.clickResetButton();
}
	public void TransferPageTest() {
		transferObj.enterAccountNumber("015234675");
		transferObj.enterDistanition("VA");
		transferObj.enterAmount("1200000");
		transferObj.enterSocialNumber("091-75-3211");
		transferObj.enterATM("22408");
		transferObj.clickTransferButton();
	

	
}
}
/**
		--------------------------------------	INSTRUCTIONS --------------------------------------------
			
			---> Create JAVA CLASS for each page of the application
			---> Inspect the elements and store the values 
			---> Create the class constructor
			---> Create the methods
		
			---> DONT FORGET ***** 	EACH PAGE CLASS SHOULD INHERIT CommonUI Class 				*******************
			---> DONT FORGET ***** 	DECLARE PAGE CLASS OBJECT in CONSTANTS CLASS 				*******************
			---> DONT FOGET  ***** 	INITIALIZE PAGE CLASS OBJECTS IN ObjInitialize JAVA ClASS 	*******************
			---> DONT FOGET  ***** 	CHANGE JAVA VERSION TO 1.8 									*******************
			
			
			
			---> For each test case create a method then call those methods from main method. 
			---> DONT FORGET *****	Refer to the INSTRUCTION PDF file for the test cases to automate **************
			
			---> ONCE FINISHED AUTOMATING Create Repository in GitHub and push to GitHub
			---> Once pushed add US to the project then send picture in MENTORS GROUP CHAT
						 Crystal: 		--> Koritzerc23@gmail.com
						 Helen: 		--> Hnbehining@gmail.com
						 Ahmad: 		--> a.stanikzai77@gmail.com
						 Fahim: 		--> NTKBatch5


*/