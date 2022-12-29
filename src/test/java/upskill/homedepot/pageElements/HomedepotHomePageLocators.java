package upskill.homedepot.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomedepotHomePageLocators {
	@FindBy(xpath="//button[@id='headerSearchButton']//*[name()='svg']")
	public WebElement btnSearch;
	
	@FindBy(xpath="//input[@id='headerSearch']")
	public WebElement txtbxSearch;
	
	// Store Finder
		@FindBy(xpath = "//body/div[@id='header']/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/a[1]/span[1]/div[2]/*[1]")
		public WebElement locationBtn;

		// Find Other Stores button
		@FindBy(xpath = "//span[contains(text(),'Find Other Stores')]")
		public WebElement findOtherStoreBtn;

		// Find Other Stores text box
		@FindBy(xpath = "//input[@id='myStore-formInput']")
		public WebElement findOtherStoreTextbox;
		
		// search location btn
		@FindBy(xpath = "//body/div[@id='header']/div[@id='myStore-wrapper']/div[@id='myStore-overlay']/div[@id='myStore-overlayWrapper']/div[1]/div[2]/form[1]/button[1]/span[1]/img[1]")
		public WebElement searchLocationBtn;


}

