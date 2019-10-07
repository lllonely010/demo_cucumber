package stepDefinitions;

import static org.junit.Assert.assertTrue;

import io.cucumber.java.en.*;
import pageObjects.*;

public class Steps {
	
   LoginPage logP;
   SearchPage seaP;
   ReportPage reportP;
   
   public Steps() {
	   logP = new LoginPage(ServiceHook.driver);	
	   seaP = new SearchPage(ServiceHook.driver);	
	   reportP = new ReportPage(ServiceHook.driver);
   }
	
  @Given("^I navigate to the Login Page$")
  public void navigateTo_LoginPage() throws Throwable {
	  logP.navigateTo_LoginPage();
  }

  @When("^I login the system with \"([^\"]*)\" and \"([^\"]*)\"$")
  public void perform_Login(String username, String password) throws Throwable {	  
	  logP.perform_Login(username, password);
  }

  @Then("^I logged in successfully$")
  private void validate_LogIn() {
      assertTrue(logP.get_Logout_Link().isDisplayed());     
	}
  
  @Then("^There is an error message as \"([^\"]*)\"$")
  public void verify_ErrorMessage(String alert) throws Throwable {
	  logP.verify_ErrorMessage(alert);   
  }
  
  @Given("^user is on Search Page$")
  public void validate_Search_Page() throws Throwable {
  	  String locationHref = seaP.getLocationHref();
      assertTrue(locationHref.contains(SearchPage.SEARCH_LINK));
  }

  @When("^I search property with \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
  public void search_Property(String address, String noi,  String units, String year_built,String year_renovation, String occupancy) throws Throwable {	  
	  seaP.input_Search_Condition(address, noi, units, year_built, year_renovation,occupancy);	  
  }

  @And("^I check and run valuation$")
  public void validate_Run_Search() {
	  seaP.validate_RunValuation();
	  seaP.run_Search();	  
  }
  
  @Then("^user is on Report page$")
  public void validate_Report_Page() {
	  reportP.wait_Report_Page();
  	  String locationHref = seaP.getLocationHref();
      assertTrue(locationHref.contains(ReportPage.REPORT_LINK));	  
  }
  
  
}
