package pageObjects;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductDisplayPage extends BasePage {

	public ProductDisplayPage(WebDriver driver) {
		super(driver);

	}
	
	@FindBy(xpath= "//*[@id='search']/span/div/h1/div/div[1]/div/div/span[3]")
	WebElement productNameDisplay;
	
	
	public void display() throws InterruptedException {
		
		System.out.println("Product displayed");
		/*if(productNameDisplay.equals("JBL Speaker")) {
			Assert.assertTrue(true);
		}else {
			Assert.assertTrue(false);
		}*/
	}
	public boolean isProductDisplayPageExists()   
	{
		try {
			return (productNameDisplay.isDisplayed());
		} catch (Exception e) {
			return (false);
		}
	}

}
