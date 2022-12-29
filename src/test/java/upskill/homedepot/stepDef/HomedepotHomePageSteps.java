package upskill.homedepot.stepDef;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import upskill.homedepot.pageAction.HomedepotHomePageActions;

public class HomedepotHomePageSteps {
	
	HomedepotHomePageActions HomedepotHomePageActionsObj=new HomedepotHomePageActions();
	@Given("^open Home Page$")
	public void open_Home_Page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

@Given("^Search for coals$")
public void search_for_coals() throws Throwable {
	HomedepotHomePageActionsObj.searchCoals();
}
@Given("^Open Hopedepot Homepage$")
public void open_Hopedepot_Homepage() throws Throwable {

}

@When("^Search for the city$")
public void search_for_the_city() throws Throwable {
	HomedepotHomePageActionsObj.SearchLocation();
}

//@Then("^Item list should have only locations under the city name$")
//	public void item_list_should_have_only_locations_under_the_city_name() throws Throwable {
//	HomedepotHomePageActionsObj.verifylocationLIC();

@Given("^Search for \"([^\"]*)\"$")
public void search_for(String items) throws Throwable {
	HomedepotHomePageActionsObj.Searchitems(items);  
}

@When("^Search for Fridge$")
public void search_for_Fridge() throws Throwable {
	HomedepotHomePageActionsObj.SearchFridge();
}
@Given("^Open homedepot Homepage$")
public void open_homedepot_Homepage() throws Throwable {
    
}
@When("^Search for furniture$")
public void search_for_furniture() throws Throwable {
	HomedepotHomePageActionsObj.Searchfurniture();
}

}
