package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class DeleteLead extends ProjectMethods {
	
	@BeforeTest
	public void setData() {
		testCaseName="TC003_DeleteLead";
		testDescription="Delete the Lead";
		testNodes="Leads";
		category="Smoke";
		authors="Guna";
		browserName="chrome";
		dataSheetName="CreateLeadData";
		sheetIndex=3;
	}

	@Test(dataProvider="fetchData")	
	public void deleteLead(String uName,String pwd,String email) throws InterruptedException
	{
		new LoginPage()
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogIn()
		.clickCRMSFA()
		.clickLeads()
		.clickFindLead()
		.clickEmailTab()
		.enterEmail(email)
		.clickFindLeadButton()		
		.clickFirstResultedLeadLink()
		.deleteLead();
	}
}
