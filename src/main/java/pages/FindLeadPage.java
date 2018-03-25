package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class FindLeadPage extends ProjectMethods{
	public FindLeadPage()
	{
		PageFactory.initElements(driver,this);
	}

	@FindBy(how=How.XPATH,using="(//input[@name='firstName'])[3]")
	private WebElement firstName;

	public FindLeadPage enterFirstName(String data) {
		//WebElement eleLogin = locateElement("class","decorativeSubmit");
		type(firstName, data);
		return this;		
	}
	
	@FindBy(how=How.XPATH,using="//span[text()='Email']")
	private WebElement emailTab;

	public FindLeadPage clickEmailTab() {
		//WebElement eleLogin = locateElement("class","decorativeSubmit");
		click(emailTab);
		return this;		
	}
	
	@FindBy(how=How.NAME,using="emailAddress")
	private WebElement emailAddress;

	public FindLeadPage enterEmail(String data) 
	{
		//WebElement eleLogin = locateElement("class","decorativeSubmit");
		type(emailAddress, data);
		return this;		
	}


	@FindBy(how=How.XPATH,using="//button[text()='Find Leads']")
	private WebElement findLeadButton;

	public FindLeadPage clickFindLeadButton() throws InterruptedException {
		//WebElement eleLogin = locateElement("class","decorativeSubmit");
		click(findLeadButton);
		Thread.sleep(3000);
		return this;		
	}////span[text()='Phone']
	
	@FindBy(how=How.XPATH,using="//span[text()='Phone']")
	private WebElement phoneTab;

	public FindLeadPage clickPhoneTab() {
		//WebElement eleLogin = locateElement("class","decorativeSubmit");
		click(phoneTab);
		return this;		
	}

	@FindBy(how=How.NAME,using="phoneNumber")
	private WebElement phoneNumber;

	public FindLeadPage enterPhoneNum(String data) {
		//WebElement eleLogin = locateElement("class","decorativeSubmit");
		type(phoneNumber,data);
		return this;		
	}

	

	@FindBy(how=How.XPATH,using="(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)")
	private WebElement firstResultedLead;

	public ViewLeadPage clickFirstResultedLeadLink() {
		//WebElement eleLogin = locateElement("class","decorativeSubmit");
		click(firstResultedLead);
		//Thread.sleep(3000);
		return new ViewLeadPage();		
	}

	@FindBy(how=How.NAME,using="id")
	private WebElement leadID;
	
	public FindLeadPage enterLeadID(String data) {
		//WebElement eleUserName = locateElement("usernama");
		type(leadID,data);		
		//switchToWindow(1);
		return this;	////button[text()='Find Leads']	
	}
	
	
	@FindBy(how=How.XPATH,using="(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)")
	private WebElement leadToMerge;

	public MergeLeadPage clickLeadLink() {
		//WebElement eleLogin = locateElement("class","decorativeSubmit");
		click(leadToMerge);
		//Thread.sleep(3000);
		return new MergeLeadPage();		
	}
	
	
	
}
