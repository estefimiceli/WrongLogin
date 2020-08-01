package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PageIndex {
	private WebDriver driver;
	private By signInLink;
	
	public PageIndex(WebDriver driver) {
		this.driver = driver;
		signInLink = By.linkText("Sign in");
	}
	
	public void clickOnSingInLink() {
		driver.findElement(signInLink).click();
	}
}
