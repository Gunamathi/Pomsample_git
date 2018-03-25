package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class DuplicateLead extends ProjectMethods{
	
	@BeforeTest
	public void setData() {
		testCaseName="TC003_DuplicateLead";
		testDescription="Duplicate the Lead";
		testNodes="Leads";
		category="Smoke";
		authors="Guna";
		browserName="chrome";
		dataSheetName="CreateLeadData";
		sheetIndex=2;
	}
	
	@Test(dataProvider="fetchData")	
	public void duplicateLead(String uName,String pwd,String ph) throws InterruptedException
	{
		new LoginPage()
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogIn()
		.clickCRMSFA()
		.clickLeads()
		.clickFindLead()
		.clickPhoneTab()
		.enterPhoneNum(ph)
		.clickFindLeadButton()		
		.clickFirstResultedLeadLink()
		.duplicateLead()
		.clickCreateLeadButton();

	}

}
