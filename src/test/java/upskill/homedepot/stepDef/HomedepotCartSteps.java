package upskill.homedepot.stepDef;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import upskill.homedepot.pageAction.HomedepotCartActions;

public class HomedepotCartSteps {
	HomedepotCartActions HomedepotCartActionsObj=new HomedepotCartActions();
	@When("^add shipping preference$")
	public void add_shipping_preference() throws Throwable {
		HomedepotCartActionsObj.shipPreference();
	}

	@When("^add quantity$")
	public void add_quantity() throws Throwable {
		HomedepotCartActionsObj.txtqty();
	}

	@Then("^add to cart$")
	public void add_to_cart() throws Throwable {
		HomedepotCartActionsObj.cart();
	}


}
