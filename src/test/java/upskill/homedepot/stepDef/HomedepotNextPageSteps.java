package upskill.homedepot.stepDef;

import cucumber.api.java.en.Then;
import upskill.homedepot.pageAction.HomedepotNextPageActions;

public class HomedepotNextPageSteps {
	HomedepotNextPageActions HomedepotNextPageActionsObj=new HomedepotNextPageActions();
	

	@Then("^it should  take you to page next$")
	public void it_should_take_you_to_page_next() throws Throwable {
	   HomedepotNextPageActionsObj.nextPage();

}
	
	
	}
