package upskill.homedepot.stepDef;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import upskill.homedepot.pageAction.HomedepotSearchResultActions;

public class HomedepotSearchResultSteps {
	
	HomedepotSearchResultActions HomedepotSearchResultActionsObj=new HomedepotSearchResultActions();
	@When("^select the first coals option$")
	public void select_the_first_coals_option() throws Throwable {
		HomedepotSearchResultActionsObj.selectCoals();
	}
	@When("^Filter by \"([^\"]*)\"$")
	public void filter_by(String brand) throws Throwable {
		HomedepotSearchResultActionsObj.filterBrand(brand);
	}

	@Then("^Item list should have products of \"([^\"]*)\"$")
	public void item_list_should_have_products_of(String brand) throws Throwable {
		Thread.sleep(2000);
		HomedepotSearchResultActionsObj.VerifyBrandItems(brand);
	}
	@Then("^Item list should have only fridges related products$")
	public void item_list_should_have_only_fridges_related_products() throws Throwable {
		Thread.sleep(2000);
		HomedepotSearchResultActionsObj.verifyingFridgeItems();
		
	}
	@Then("^Item list should have only furniture related product$")
	public void item_list_should_have_only_furniture_related_product() throws Throwable {
		Thread.sleep(3000);
		HomedepotSearchResultActionsObj.verifyfurnitureItems();
		Thread.sleep(3000);
	}
	
}

