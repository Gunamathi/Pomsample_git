package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class CreateLeadPage extends ProjectMethods{

	public CreateLeadPage() {
		
		PageFactory.initElements(driver,this);
	}
	
	
	@FindBy(how=How.ID,using="createLeadForm_companyName")
	private WebElement companyName;
	public CreateLeadPage enterCompanyName(String data) {
		
		type(companyName, data);
		return this;
	}
	
	@FindBy(how=How.ID,using="createLeadForm_firstName")
	private WebElement firstName;
	public CreateLeadPage enterFirstName(String data) {
		
		type(firstName, data);
		return this;
	}
	
	@FindBy(how=How.ID,using="createLeadForm_lastName")
	private WebElement lastName;
	public CreateLeadPage enterLastName(String data) {
		
		type(lastName, data);
		return this;
	}
	
	@FindBy(how=How.ID,using="createLeadForm_primaryEmail")
	private WebElement eMail;
	public CreateLeadPage enterEmail(String data) {
		
		type(eMail, data);
		return this;
	}
	@FindBy(how=How.ID,using="createLeadForm_primaryPhoneNumber")
	private WebElement phoneNumber;
	public CreateLeadPage enterPhone(String data) {
		
		type(phoneNumber, data);
		return this;
	}
	
	@FindBy(how=How.NAME,using="submitButton")
	private WebElement createLeadButton;
	public ViewLeadPage clickCreateLead()  {
		
		click(createLeadButton);
		
		return new ViewLeadPage();
	}
	
	/*public ViewLeadPage verifyTile(String data) {
		//WebElement eleLogin = locateElement("class","decorativeSubmit");
		verifyTitle(data);
		return new ViewLeadPage();		
	}*/

}
