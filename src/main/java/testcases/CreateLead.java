package testcases;



import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.CRMSFAHomePage;
import pages.CreateLeadPage;
import pages.HomePage;
import pages.LeadsHomePage;
import pages.LoginPage;
import wdMethods.ProjectMethods;

public class CreateLead extends ProjectMethods {
	
	@BeforeTest
	public void setData() {
		testCaseName="TC002_CreateLead";
		testDescription="Create a Lead for Automation";
		testNodes="Leads";
		category="Smoke";
		authors="Guna";
		browserName="chrome";
		dataSheetName="CreateLeadData";
		sheetIndex=0;
	}
		
	
	@Test(dataProvider="fetchData")
	public void creatingANewLead(String uName,String pwd,String companyName,String firstNmae,String lastName,String email,String ph,String title) throws InterruptedException {
		
		new LoginPage()
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogIn()
		.clickCRMSFA()
		.clickLeads()
		.clickCreateLead()		
		.enterCompanyName(companyName)
		.enterFirstName(firstNmae)
		.enterLastName(lastName)
		.enterEmail(email)
		.enterPhone(ph)
		.clickCreateLead()
		.verifyTile(title);		
		
	}

}
