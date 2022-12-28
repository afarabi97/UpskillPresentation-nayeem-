package upskill.homedepot.stepDef;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import upskill.homedepot.pageAction.HomedepotLoginActions;

public class HomedepotLoginSteps {
HomedepotLoginActions  HomedepotLoginActionsObj= new HomedepotLoginActions();

@Given("^open Home Depot login page$")
public void open_Home_Depot_login_page() throws Throwable {
    
}
@When("^insert the wrong credentials$")
public void insert_the_wrong_credentials() throws Throwable {
    HomedepotLoginActionsObj.loginHomedepot();
}
@When("^click on continue button$")
public void click_on_continue_button() throws Throwable {
	HomedepotLoginActionsObj.Continuebutton();
}
}
