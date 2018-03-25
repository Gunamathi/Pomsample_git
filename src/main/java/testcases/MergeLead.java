package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class MergeLead extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName="TC005_MergeLead";
		testDescription="Merge the Lead";
		testNodes="Leads";
		category="Smoke";
		authors="Guna";
		browserName="chrome";
		dataSheetName="CreateLeadData";
		sheetIndex=4;
	}

	@Test(dataProvider="fetchData")	
	public void mergeLead(String uName,String pwd,String fromLead,String toLead) throws InterruptedException {
		
		new LoginPage()
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogIn()
		.clickCRMSFA()
		.clickLeads()
		.clickMergeLead()	
		.clickFromLeadIcon()
		.enterLeadID(fromLead)
		.clickFindLeadButton()
		.clickLeadLink()
		.clickToLeadIcon()
		.enterLeadID(toLead)
		.clickFindLeadButton()
		.clickLeadLink()
		.clickMerge();
				
	}

}
