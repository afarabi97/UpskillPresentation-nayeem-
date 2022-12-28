package upskill.homedepot.pageAction;

import org.openqa.selenium.support.PageFactory;

import upskill.homedepot.pageElements.HomedepotHomePageLocators;
import upskill.utilities.SetupDrivers;

public class HomedepotHomePageActions {
	HomedepotHomePageLocators HomedepotHomePageLocatorsObj;
	public HomedepotHomePageActions(){
		HomedepotHomePageLocatorsObj=new HomedepotHomePageLocators();
		PageFactory.initElements (SetupDrivers.driver,HomedepotHomePageLocatorsObj);
		
	}
	public void searchCoals(){
		HomedepotHomePageLocatorsObj.txtbxSearch.sendKeys("coals");
		HomedepotHomePageLocatorsObj.btnSearch.click();

	}
}
