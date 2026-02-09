package uiautomationframework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import uipages.HomePage;
import uipages.LoginPage;

public class SigninTest2 {

	public static void main(String[] args) {
		
		WebDriver Webdriver = new ChromeDriver();
		HomePage homePage = new HomePage(Webdriver);
		LoginPage loginPage = homePage.goToLoginPage();
		loginPage.doLoginWith("febipom691@icubik.com", "Password@123");
	}

}
