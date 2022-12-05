package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{

	public HomePage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(id= "twotabsearchtextbox")
	WebElement searchTxtBox;
	
	@FindBy(id = "nav-search-submit-button")
	WebElement searchButton;
	
	public void enetrProductName(String productName) {
		searchTxtBox.sendKeys(productName);
	}
	public void clickSubmit() {
		searchButton.click();
	}

}
