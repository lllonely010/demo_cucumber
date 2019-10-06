package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import io.cucumber.core.api.Scenario;
import helper.WebDriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class ServiceHook {
	
	public static WebDriver driver;
	
	@Before
    public void initializeTest() {
		System.out.println("Start the browser and Clear the cookies");
		System.out.println("-----------------Start of Scenario-----------------");
		launchbrowser();
    }
	
	@After
    public void afterScenarioFinish(Scenario scenario) {
        System.out.println("-----------------End of Scenario-----------------");
		System.out.println("Log out the user and close the browser");
		if (scenario.isFailed()) {
            try {
        		byte[] screenShot = ((TakesScreenshot) ServiceHook.driver).getScreenshotAs(OutputType.BYTES);
        	    scenario.embed(screenShot, "image/png");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        closeBrowser();
    }
	
	public void launchbrowser() {
		driver = WebDriverFactory.createWebDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	  
	public void closeBrowser() {
		driver.quit();
	}
}
