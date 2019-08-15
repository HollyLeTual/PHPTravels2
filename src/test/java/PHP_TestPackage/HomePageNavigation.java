package PHP_TestPackage;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import PageObjects.HomePage;
import PageObjects.SignUp;
import Resources.Base;

public class HomePageNavigation extends Base {
	
	@Test
	public void HomePageNavigation() throws IOException {
	
	driver = initializeDriver();
	driver.get(prop.getProperty("url"));
	Log1.info("Successfully Opened Home Page");
	
	HomePage h = new HomePage(driver);
	h.ClickAccount().click();
	
	SignUp s = new SignUp(driver);
	s.signup().click();
	s.ProvideFirstName().sendKeys("FirstName");
	s.ProvideLastName().sendKeys("LastName");
	s.ProvideMobileNumber().sendKeys("MobileNumber");
	s.ProvideEmail().sendKeys("test@email.com");
	s.ProvidePassword().sendKeys("Password1");
	s.ProvideConfirmation().sendKeys("Password1");
	s.SignIn().click();
	
	Log1.info("Successfully entered Sign Up information");
	
	}
	
	@AfterTest
	public void teardown() {
		driver.close();
	}
	
	/*@DataProvider
	
	public Object[][] getData() {
		
		Object[][] data = new Object[2][2];
		data[0][0] = "Test1FN";
		data[0][1] = "Test1LN";
		data[0][2] = "1-709-748-4894";
		
		return data;
				
	}*/
	
	
}

