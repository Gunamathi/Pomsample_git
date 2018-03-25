package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class EditLead extends ProjectMethods{
	
	@BeforeTest
	public void setData() {
		testCaseName="TC003_EditLead";
		testDescription="Edit the Lead";
		testNodes="Leads";
		category="Smoke";
		authors="Guna";
		browserName="chrome";
		dataSheetName="CreateLeadData";
		sheetIndex=1;
	}
	
	@Test(dataProvider="fetchData")	

	public void editLead(String uName,String pwd,String firstName,String updateFirstName) throws InterruptedException
	{
		new LoginPage()
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogIn()
		.clickCRMSFA()
		.clickLeads()
		.clickFindLead()
		.enterFirstName(firstName)
		.clickFindLeadButton()		
		.clickFirstResultedLeadLink()
		.editLead()
		.editFirstName(updateFirstName)
		.clickUpdateButton();
	}

}
