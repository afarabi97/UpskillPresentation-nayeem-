package upskill.homedepot.stepDef;

import cucumber.api.java.en.Given;
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

}
