package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignUp {
	
	public WebDriver driver;
	
	By signup = By.xpath("//ul[@class='nav navbar-nav navbar-right hidden-sm go-left']//ul[@class='nav navbar-nav navbar-side navbar-right sidebar go-left user_menu']//li[@id='li_myaccount']//ul[@class='dropdown-menu']//li//a[@class='go-text-right'][contains(text(),'Sign Up')]");
	By firstname = By.xpath("//input[@placeholder='First Name']");
	By lastname = By.xpath("//input[@placeholder='Last Name']");
	By mobilenumber = By.xpath("//input[@placeholder='Mobile Number']");
	By email = By.xpath("//input[@placeholder='Email']");
	By password = By.xpath("//input[@placeholder='Password']");
	By confirm = By.xpath("//input[@placeholder='Confirm Password']");
	By signin = By.xpath(" //button[@class='signupbtn btn_full btn btn-action btn-block btn-lg']");
		
	public SignUp(WebDriver driver) {
		this.driver=driver;
	}
	
	public WebElement signup() {
		
		return driver.findElement(signup);
	}
	
	public WebElement ProvideFirstName() {
		
		return driver.findElement(firstname);
	
}
	
	public WebElement ProvideLastName() {
		
		return driver.findElement(lastname);
	
}
	
	public WebElement ProvideMobileNumber() {
		
		return driver.findElement(mobilenumber);
	
}
	
	public WebElement ProvideEmail() {
		
		return driver.findElement(email);
	
}
	
	public WebElement ProvidePassword() {
		
		return driver.findElement(password);
	
}
	
	public WebElement ProvideConfirmation() {
		
		return driver.findElement(confirm);
	
}
	public WebElement SignIn() {
	
	return driver.findElement(signin);

}
	
}
	
	
	
	
	
	
