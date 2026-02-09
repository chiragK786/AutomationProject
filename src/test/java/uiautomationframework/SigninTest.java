package uiautomationframework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import utility.BrowserUtility;

public class SigninTest {

	public static void main(String[] args) {
		
		WebDriver webDriver = new ChromeDriver();
		
		BrowserUtility browserUtility = new BrowserUtility(webDriver);
		browserUtility.goToWebsite("https://automationpractice.techwithjatin.com/");
		browserUtility.maximizeWindow();
		
		By signInLocator = By.xpath("//a[@class='login']");
		browserUtility.clickOn(signInLocator);
		
		By emailTextBoxLocator = By.id("email");
		

		

		browserUtility.enterText(emailTextBoxLocator, "febipom691@icubik.com");

		By passwordTextBoxLocator = By.id("passwd");

		
		browserUtility.enterText(passwordTextBoxLocator, "Password@123");
		
		By signInButtonLocator = By.id("SubmitLogin");
		
		browserUtility.clickOn(signInButtonLocator);
	}

}
