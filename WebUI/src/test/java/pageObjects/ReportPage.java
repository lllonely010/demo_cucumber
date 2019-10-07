package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ReportPage extends BasePage{

	public ReportPage(WebDriver driver) {
		super(driver);
	}
	
    @FindBy (id="property")
	WebElement section_Property;    
    
    @FindBy (id="sticky-header")
    WebElement header_sticky;
    
    @FindBy (id="propertyMap")
    WebElement div_Map;
    
    public void wait_Report_Page() {

    	this.waitForElementDisplay("property");
    }
    
}
