package wdMethods;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

import utils.DataInputProvider;

public class ProjectMethods extends SeMethods{

	public String browserName;
	public String dataSheetName;
	public int sheetIndex;

	@BeforeSuite
	public void beforeSuite(){
		startResult();
	}

	@BeforeClass
	public void beforeClass(){		
		startTestModule(testCaseName, testDescription);	
	}



	@BeforeMethod
	public void beforeMethod() throws MalformedURLException{
		test = startTestCase(testNodes);
		test.assignCategory(category);
		test.assignAuthor(authors);
		/*DesiredCapabilities dc = new DesiredCapabilities();
		dc.setBrowserName("chrome");
		dc.setPlatform(Platform.WINDOWS);		
		RemoteWebDriver driver = new RemoteWebDriver(
				new URL("http://192.168.0.11:4455/wd/hub"), dc);*/
		startApp(browserName,false);		
	}

	@AfterSuite
	public void afterSuite(){
		endResult();
	}

	@AfterTest
	public void afterTest(){
	}

	@AfterMethod
	public void afterMethod(){
		closeAllBrowsers();

	}

	@DataProvider(name="fetchData")
	public  Object[][] getData(){
		return DataInputProvider.getSheet(dataSheetName,sheetIndex);		
	}	

}
