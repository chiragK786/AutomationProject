package utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public abstract class BrowserUtility {
	
	private WebDriver driver; //instance variable ->Heap (Non primitive data type)

	public BrowserUtility(WebDriver driver) {
		super();
		this.driver = driver; //initialise the instance variable driver !!!
		
	}
	
	public void goToWebsite(String url) {
		driver.get(url);
	}
	public WebDriver getDriver() {
		return driver;
	}

	

	public void maximizeWindow() {
		driver.manage().window().maximize();
	}
	
	public void clickOn(By Locator) {
		WebElement element = driver.findElement(Locator);
		element.click();
		
	}
	public void enterText(By locator, String textToEnter) {
		WebElement element = driver.findElement(locator);
		element.sendKeys(textToEnter);
	}

}
