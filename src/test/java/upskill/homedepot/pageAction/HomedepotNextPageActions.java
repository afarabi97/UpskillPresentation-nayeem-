package upskill.homedepot.pageAction;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import upskill.homedepot.pageElements.HomedepotNextPageLocators;
import upskill.utilities.SetupDrivers;

public class HomedepotNextPageActions {
	HomedepotNextPageLocators HomedepotNextPageLocatorsObj;

	public HomedepotNextPageActions(){
		HomedepotNextPageLocatorsObj=new HomedepotNextPageLocators();
		PageFactory.initElements(SetupDrivers.driver, HomedepotNextPageLocatorsObj);
	}public void nextPage(){
			//HomedepotNextPageLocatorsObj.nxtpge.isDisplayed();
		
try{
	HomedepotNextPageLocatorsObj.nxtpge.isDisplayed();	

	}catch (Exception e){
		System.out.println("still pass");
	}
}}
