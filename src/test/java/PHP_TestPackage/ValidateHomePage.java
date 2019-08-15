package PHP_TestPackage;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageObjects.HomePage;
import Resources.Base;

public class ValidateHomePage extends Base {
	
	@BeforeTest
	public void preConditions() throws IOException {
		driver = initializeDriver();
		driver.get(prop.getProperty("url"));
	}
	
	@Test
	public void ValidateHomePage() throws IOException {
	
	driver = initializeDriver();
	driver.get(prop.getProperty("url"));
	
	HomePage h = new HomePage(driver);
	AssertJUnit.assertTrue(h.ClickAccount().isDisplayed());
	AssertJUnit.assertEquals("HOTELS", h.VerifyHomePageText().getText());
	
}

	@AfterTest
	public void teardown() {
		driver.close();
	}
	
	
}
