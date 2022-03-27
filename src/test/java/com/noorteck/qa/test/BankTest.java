package com.noorteck.qa.test;

import com.noorteck.qa.utils.CommonUI;
import com.noorteck.qa.utils.ObjInitialize;

public class BankTest extends ObjInitialize {

	public static void main(String[] args) {
		String url = "https://usdemo.vee24.com/#/transactions";
	ObjInitialize obj = new ObjInitialize();
	CommonUI.openBrowser("chrome");
	CommonUI.navigate(url);
	initializeClassObj();
	//homePageTest();
	TransferPageTest();
	CommonUI.quitBrowser();
	}
public static void homePageTest() {
	homeObj.clickTransfer();
	homeObj.clickLoan();
	homeObj.clickLogOut();
}
public static void TransferPageTest() {
	transferObj.clickTransfer();
	transferObj.clickPersonalInfo();
	transferObj.clickPersonalAndClick();
	transferObj.clickDestinationInfo();
	transferObj.clickDestinationAndClick();
	transferObj.enterAmount("5000");
	transferObj.enterSocialNumber("392889423");
	transferObj.enterATMNumber("2478");
	transferObj.clickTransferButton();
}
public static void loansPageTest() {
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