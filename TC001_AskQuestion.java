package com.salesforce.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.framework.testng.api.base.ProjectSpecificMethods;
import com.leaftaps.pages.LoginPage;
import com.salesforce.pages.SalesLoginPage;

public class TC001_AskQuestion extends ProjectSpecificMethods{

	
	@BeforeTest
	public void setValues() {
		testcaseName = "Ask Question";
		testDescription ="Create a question from salesforce";
		authors="Gopi";
		category ="Smoke";
		excelFileName="SalesTest";
	}
	
	@Test(dataProvider = "fetchData")
	public void runLogin(String username, String password, String question, String details) {
		new SalesLoginPage().enterUsername1(username).enterPassword1(password)
		.clickLogin1()
		.clickMenu()
		.clickViewAll1()
		.searchText1()
		.clickContacts()
		.clickChatter()
		.verifyChatterPage()
		.clickQuestionTab()
		.enterQuestion(question)
		.enterDetails(details)
		.clickAsk()
		.verifyQuestion(question);
	}
}
