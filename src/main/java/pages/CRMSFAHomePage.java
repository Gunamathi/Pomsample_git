package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class CRMSFAHomePage extends ProjectMethods {
	
	public CRMSFAHomePage() {
		
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(how=How.LINK_TEXT,using="Leads")
	private WebElement clickingLeadsButton;
	public LeadsHomePage clickLeads() {
		
		click(clickingLeadsButton);
		return new LeadsHomePage();
		
	}

}
