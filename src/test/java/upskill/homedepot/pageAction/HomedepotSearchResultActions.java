package upskill.homedepot.pageAction;

import org.openqa.selenium.support.PageFactory;

import junit.framework.Assert;
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
public void filterBrand(String brand) throws Exception{
	if(brand.equals("Whirlpool")){
		HomedepotSearchResultLocatorsObj.cbxBrandWhirlpool.click();
	}else if(brand.equals("Sika")){
		HomedepotSearchResultLocatorsObj.cbxBrandSika.click();		
	}
	else{
		System.out.println("Brand not found");
	}
	Thread.sleep(2000);
}
public void VerifyBrandItems(String brand){
	if(brand.equals("Whirlpool")){
		Assert.assertTrue(HomedepotSearchResultLocatorsObj.txtfridge.isDisplayed());	
	}	else if(brand.equals("Sika")){
		Assert.assertTrue(HomedepotSearchResultLocatorsObj.txtCement.isDisplayed());	
	}else{
		System.out.println("Brand not found");
	}
}
public void verifyingFridgeItems() throws Exception{
	//Option 1
//	Assert.assertEquals("Fridge
//	", HomedepotSearchResultLocatorsobj.txtfridge.getText());
	
	//Option 2
	Thread.sleep(5000);
	Assert.assertTrue(HomedepotSearchResultLocatorsObj.txtfridge.isDisplayed());
	
	//Option 3
//	HomedepotSearchResultLocatorsobj.txtfridge.isDisplayed();
	
}
public void verifyfurnitureItems() throws Exception{
	
	
	//Option 3
	HomedepotSearchResultLocatorsObj.txtfurniture.isDisplayed();
}


}


