package upskill.homedepot.pageAction;

import org.openqa.selenium.support.PageFactory;

import upskill.homedepot.pageElements.HomedepotCartLocators;
import upskill.utilities.SetupDrivers;

public class HomedepotCartActions {
	HomedepotCartLocators HomedepotCartLocatorsObj;
	
	public HomedepotCartActions(){
		 HomedepotCartLocatorsObj=new HomedepotCartLocators();
		 PageFactory.initElements(SetupDrivers.driver,HomedepotCartLocatorsObj);
	}
public void shipPreference()throws Exception{
	Thread.sleep(2000);
	HomedepotCartLocatorsObj.ship.click();
	
}
public void txtqty()throws Exception{
	Thread.sleep(2000);
	HomedepotCartLocatorsObj.qty.click();
	
}

public void cart()throws Exception{
	Thread.sleep(2000);
	HomedepotCartLocatorsObj.crt.click();
	Thread.sleep(2000);
}
}