package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class MergeLeadPage extends ProjectMethods{
	
	public MergeLeadPage() {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(how=How.XPATH,using="//img[@alt='Lookup']")
	private WebElement fromLeadIcon;
	
	public FindLeadPage clickFromLeadIcon() {
		//WebElement eleUserName = locateElement("usernama");
		click(fromLeadIcon);
		switchToWindow(1);
		return new FindLeadPage();
		
	}
	

	@FindBy(how=How.XPATH,using="(//img[@alt='Lookup'])[2]")
	private WebElement toLeadIcon;
	public FindLeadPage clickToLeadIcon() {
		//WebElement eleUserName = locateElement("usernama");
		switchToWindow(0);
		click(toLeadIcon);
		switchToWindow(1);
		return new FindLeadPage();
		
	}
	
	@FindBy(how=How.CLASS_NAME,using="buttonDangerous")
	private WebElement mergeButton;
	public FindLeadPage clickMerge() {
		//WebElement eleUserName = locateElement("usernama");
		switchToWindow(0);
		click(mergeButton);
	//	switchToWindow(1);
		return new FindLeadPage();
		
	}
	
	
	public ViewLeadPage acceptAlertinMerge() {
		//WebElement eleUserName = locateElement("usernama");
		acceptAlert();
	//	switchToWindow(1);
		return new ViewLeadPage();
		
	}
	
	
	

}
