package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageSignIn {
	private WebDriver driver;
	private By emailTextbox;
	private By passwordTextbox;
	private By signInButton;
	private By signInBanner;
	private WebDriverWait wait;
	
	public PageSignIn(WebDriver driver) {
		this.driver = driver;
		emailTextbox = By.id("email");
		passwordTextbox = By.id("passwd");
		signInButton = By.id("SubmitLogin");
		signInBanner = By.cssSelector("#center_column > div.alert.alert-danger > ol > li");
	}
	
	public void setEmail(String email) {
		driver.findElement(emailTextbox).sendKeys(email);
	}
	
	public void setPassword(String password) {
		driver.findElement(passwordTextbox).sendKeys(password);
	}
	
	public void clickOnSingInButton() {
		wait = new WebDriverWait(driver, 5);
		WebElement button = wait.until(ExpectedConditions.elementToBeClickable(signInButton));
		button.click();
	}
	
	public String getSignInBannerText() {
		return driver.findElement(signInBanner).getText();
	}
	
}
