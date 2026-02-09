package uipages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utility.BrowserUtility;

public class LoginPage extends BrowserUtility {
	private final By EMAIL_TEXT_BOX_LOCATOR = By.id("email");
	private final By PASSWORD_TEXT_BOX_LOCATOR = By.id("passwd"); 
	private final By SIGN_IN_BUTTON_LOCATOR = By.id("SubmitLogin");

	public LoginPage(WebDriver driver) {
		super(driver);
		
	}
	
	

	public void  doLoginWith(String emailAddress, String password) {
		
		enterText(EMAIL_TEXT_BOX_LOCATOR,emailAddress);

		enterText(PASSWORD_TEXT_BOX_LOCATOR,password);
		
		clickOn(SIGN_IN_BUTTON_LOCATOR);
		
		
		
	}

}
