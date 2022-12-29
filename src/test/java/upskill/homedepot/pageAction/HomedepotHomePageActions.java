package upskill.homedepot.pageAction;

import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.Given;
import upskill.homedepot.pageElements.HomedepotHomePageLocators;
import upskill.utilities.SetupDrivers;

public class HomedepotHomePageActions {
	HomedepotHomePageLocators HomedepotHomePageLocatorsObj;
	public HomedepotHomePageActions(){
		HomedepotHomePageLocatorsObj=new HomedepotHomePageLocators();
		PageFactory.initElements (SetupDrivers.driver,HomedepotHomePageLocatorsObj);
		
	}
	@Given("^Open Homedepot Homepage$")
	public void open_Homedepot_Homepage() throws Throwable {
	    
	}
	public void searchCoals(){
		HomedepotHomePageLocatorsObj.txtbxSearch.sendKeys("coals");
		HomedepotHomePageLocatorsObj.btnSearch.click();

	}
	public void SearchLocation() throws Exception {
		HomedepotHomePageLocatorsObj.locationBtn.click();
		Thread.sleep(5000);
		HomedepotHomePageLocatorsObj.findOtherStoreBtn.click();
		HomedepotHomePageLocatorsObj.findOtherStoreTextbox.sendKeys("11373");
		HomedepotHomePageLocatorsObj.searchLocationBtn.click();
}
	 public void Searchitems(String items){
	    	HomedepotHomePageLocatorsObj.txtbxSearch.sendKeys(items);
	    	HomedepotHomePageLocatorsObj.btnSearch.click();
	    }
	 public void SearchFridge(){
	    	HomedepotHomePageLocatorsObj.txtbxSearch.sendKeys("Fridge");
	    	HomedepotHomePageLocatorsObj.btnSearch.click();
	    }
		public void Searchfurniture(){
			HomedepotHomePageLocatorsObj.txtbxSearch.sendKeys("Furniture");
			HomedepotHomePageLocatorsObj.btnSearch.click();
		}
}
