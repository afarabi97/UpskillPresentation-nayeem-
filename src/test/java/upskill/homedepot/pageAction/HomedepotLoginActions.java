package upskill.homedepot.pageAction;

import org.openqa.selenium.support.PageFactory;

import upskill.homedepot.pageElements.HomedepotLoginLocators;
import upskill.utilities.SetupDrivers;

public class HomedepotLoginActions {

	HomedepotLoginLocators HomedepotLoginLocatorsObj;
	public HomedepotLoginActions(){
		HomedepotLoginLocatorsObj=new HomedepotLoginLocators();
	PageFactory.initElements(SetupDrivers.driver, HomedepotLoginLocatorsObj);
}
	public void loginHomedepot(){
		HomedepotLoginLocatorsObj.txtbxinput.sendKeys("afarabi97@yahoo.com");
		
		
	}
	public void Continuebutton(){
		HomedepotLoginLocatorsObj.clkbtn.click();
	}
	
	}
	

