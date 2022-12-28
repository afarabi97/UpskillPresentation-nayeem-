package upskill.homedepot.pageAction;

import org.openqa.selenium.support.PageFactory;

import upskill.homedepot.pageElements.HomedepotSearchResultLocators;
import upskill.utilities.SetupDrivers;

public class HomedepotSearchResultActions {
	HomedepotSearchResultLocators HomedepotSearchResultLocatorsObj;
	public HomedepotSearchResultActions(){
		HomedepotSearchResultLocatorsObj= new HomedepotSearchResultLocators();
		PageFactory.initElements(SetupDrivers.driver, HomedepotSearchResultLocatorsObj);
	}
public void selectCoals ()throws Exception{
	Thread.sleep(2000);
	HomedepotSearchResultLocatorsObj.linkCoals.click();
	Thread.sleep(2000);
}
}
