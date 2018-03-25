package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class EditLeadPage extends ProjectMethods{
	public EditLeadPage()
	{
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(how=How.ID,using="updateLeadForm_firstName")
	private WebElement firstName;

	public EditLeadPage editFirstName(String data) {
		//WebElement eleLogin = locateElement("class","decorativeSubmit");
		type(firstName, data);
		return this;		
	}
	
	@FindBy(how=How.XPATH,using="//input[@value='Update']")
	private WebElement updateButton;

	public ViewLeadPage clickUpdateButton() {
		//WebElement eleLogin = locateElement("class","decorativeSubmit");
		click(updateButton);
		return new ViewLeadPage();		
	}

}
