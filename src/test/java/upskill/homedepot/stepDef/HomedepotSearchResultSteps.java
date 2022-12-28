package upskill.homedepot.stepDef;

import cucumber.api.java.en.When;
import upskill.homedepot.pageAction.HomedepotSearchResultActions;

public class HomedepotSearchResultSteps {
	
	HomedepotSearchResultActions HomedepotSearchResultActionsObj=new HomedepotSearchResultActions();
	@When("^select the first coals option$")
	public void select_the_first_coals_option() throws Throwable {
		HomedepotSearchResultActionsObj.selectCoals();
	}
}
