package stepDefinition;

import java.time.Duration;

import java.util.ResourceBundle;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

//import com.utilities.ReadConfig;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.*;
import pageObjects.HomePage;
import pageObjects.ProductDisplayPage;

public class searchSteps {
	WebDriver driver;
	HomePage homePage;
	ProductDisplayPage pdtDisplay;
	
	public Logger logger;
	public String br;
	public ResourceBundle rb;
	
	@Before
	public void setup() {
		
		 logger= LogManager.getLogger(this.getClass());
		 
	        //Reading config.properties (for browser)
	     //   rb=ResourceBundle.getBundle("config");
	     //   br=rb.getString("browser");

	}
	
	@After
	 public void tearDown(Scenario scenario) {
        System.out.println("Scenario status ======>"+scenario.getStatus());
        if(scenario.isFailed()) {
             byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png",scenario.getName());
            }
       driver.quit();
    }
	
	@Given("User Launch browser")
	public void user_launch_browser() {
		/*if(br.equals("chrome"))
        {
           driver=new ChromeDriver();
        }
        else if (br.equals("firefox")) {
            driver = new FirefoxDriver();
        }
        else if (br.equals("edge")) {
            driver = new EdgeDriver();
        }*/
		driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

	}

	@Given("Opens URL {string}")
	public void opens_url(String url) {
		 driver.get(url);
	     driver.manage().window().maximize();
	}


	@When("User enter the product as {string}")
	public void user_enter_the_product_as(String string) {
		homePage = new HomePage(driver);
		homePage.enetrProductName(string);
		logger.info("Product Entered");
		
	}

	@When("Click on Search button")
	public void click_on_search_button() {
		homePage.clickSubmit();
		logger.info("Click Search Button");
	}

	@Then("Selected product is displayed")
	public void selected_product_is_displayed() throws InterruptedException {
		//pdtDisplay.display();
		
		//pdtDisplay.isProductDisplayPageExists();
		logger.info("Product Displayed");
				   
	}



}
