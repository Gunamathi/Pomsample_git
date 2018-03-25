package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import testcases.EditLead;
import wdMethods.ProjectMethods;

public class ViewLeadPage extends ProjectMethods {
	 
	public ViewLeadPage()
	{
		PageFactory.initElements(driver,this);
	}
	
	/*@FindBy(how=How.CLASS_NAME,using="decorativeSubmit")
	private WebElement eleLogOut;*/
	
	public ViewLeadPage verifyTile(String data) {
		//WebElement eleLogin = locateElement("class","decorativeSubmit");
		//Thread.sleep(3000);
		verifyTitle(data);
		return this;		
	}
	
	@FindBy(how=How.LINK_TEXT,using="Edit")
	private WebElement editButton;		
	
	public EditLeadPage editLead() {
		//WebElement eleLogin = locateElement("class","decorativeSubmit");
		click(editButton);
		return new EditLeadPage();		
	}

	
	@FindBy(how=How.XPATH,using="//a[text()='Delete']")
	private WebElement deleteButton;	
	
	
	public LeadsHomePage deleteLead() {
		//WebElement eleLogin = locateElement("class","decorativeSubmit");
		click(deleteButton);
		return new LeadsHomePage();		
	}
	
	////a[text()='Duplicate Lead']
	
	
	@FindBy(how=How.XPATH,using="//a[text()='Duplicate Lead']")
	private WebElement duplicateButton;	
	
	
	public DuplicateLeadPage duplicateLead() {
		//WebElement eleLogin = locateElement("class","decorativeSubmit");
		click(duplicateButton);
		return new DuplicateLeadPage();		
	}
}
