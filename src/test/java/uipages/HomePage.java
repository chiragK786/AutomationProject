package uipages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utility.BrowserUtility;

public class HomePage extends BrowserUtility {
 public HomePage(WebDriver driver) {
		super(driver);
		goToWebsite("https://automationpractice.techwithjatin.com/");
	}

 private static final 	By SIGN_IN_LOCATOR = By.xpath("//a[@class='login']");
 
 public LoginPage goToLoginPage() {
	 
	 clickOn(SIGN_IN_LOCATOR);
	 
	 LoginPage loginPage = new LoginPage(getDriver());
	 return loginPage;
	 
	 
 }
}
  