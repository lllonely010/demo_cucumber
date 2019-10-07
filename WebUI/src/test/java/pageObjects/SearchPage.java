package pageObjects;

import org.openqa.selenium.WebElement;
import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class SearchPage extends BasePage {
	
	public SearchPage(WebDriver driver) {
		super(driver);
	}
	
    @FindBy (id="address_input")
	WebElement input_address;    
    
    @FindBy (xpath ="//*[@class = 'pac-item']")
	WebElement div_address; 

    @FindBy (id="noi")
	WebElement input_income;

    @FindBy (name ="occupancy")
	WebElement input_occupancy;
    
    @FindBy (name = "number_of_units")
    WebElement input_number_of_units;
    
    @FindBy (name = "year_built")
    WebElement input_year_built;
    
    @FindBy (name = "year_renovated")
    WebElement input_year_renovated;
    
    @FindBy (id = "introjsRunValuationButton")
    WebElement button_RunValuation;
    
    public void input_Search_Condition(String address, String income, String units, String yearbuilt, String year_renovated, String occupancy) {
    	input_address.sendKeys(address);
    	div_address.click();
    	input_income.sendKeys(income);    	
    	input_number_of_units.sendKeys(units);
    	input_year_built.sendKeys(yearbuilt);    	
    	input_year_renovated.sendKeys(year_renovated);  
    	input_occupancy.sendKeys(occupancy);
    }
    
    public void validate_RunValuation() {    	
    	assertTrue(button_RunValuation.isEnabled());   	   	
    }
    
    public void run_Search() {
    	button_RunValuation.click();  
    }
    
}
