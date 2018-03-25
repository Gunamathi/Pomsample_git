package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class LeadsHomePage extends ProjectMethods{
	
	public LeadsHomePage() {
		
		PageFactory.initElements(driver,this);
	}
	@FindBy(how=How.LINK_TEXT,using="Create Lead")
	private WebElement clickingCreateLeadButton;
	
	public CreateLeadPage clickCreateLead() {
		
		click(clickingCreateLeadButton);
		return new CreateLeadPage();
	}
	
	@FindBy(how=How.LINK_TEXT,using="Find Leads")
	private WebElement findLeadButton;
	
	public FindLeadPage clickFindLead() {
		
		click(findLeadButton);
		return new FindLeadPage();
	}
	
	@FindBy(how=How.LINK_TEXT,using="Merge Leads")
	private WebElement mergeLeadButton;
	
	public MergeLeadPage clickMergeLead() {
		
		click(mergeLeadButton);
		return new MergeLeadPage();
	}
}


