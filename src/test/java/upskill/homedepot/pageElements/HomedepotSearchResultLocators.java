package upskill.homedepot.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomedepotSearchResultLocators {
	@FindBy(xpath="//span[contains(text(),'20 lbs. Original BBQ Smoker Charcoal Grilling Briq')]")
	public WebElement linkCoals;
	
	@FindBy (xpath="//span[@class='results-applied__label']")
    public WebElement txtfridge;
	
	
	//Checkbox Brand Whirlpool
	@FindBy (xpath="//a[@href='/b/Whirlpool/N-5yc1vZ4l4/Ntk-elasticplus/Ntt-Fridge?NCNI-5']")   
	public WebElement cbxBrandWhirlpool;
	
	
	
	//Search Text Box
	@FindBy (xpath="//h1[contains(text(),'Cement')]")
    public WebElement txtCement;
	
	//Checkbox Brand Sika
	@FindBy (xpath="//a[@href='/b/Sika/N-5yc1vZ74n/Ntk-elasticplus/Ntt-Cement?NCNI-5']")   
	public WebElement cbxBrandSika;
	
	//Validate furniture Items
	@FindBy(xpath="//span[contains(text(),'Featured Categories in Furniture')]")
	public WebElement txtfurniture2;
	//Validate furniture Items
			@FindBy(xpath="//span[contains(text(),'A Refresh for Every Room')]")
			public WebElement txtfurniture;
			
			// Checkbox Brand Honey well
			@FindBy(xpath="//label[@class = 'checkbox-btn__label' ]")
			public WebElement cbxBrandFan;
				
			// Checkbox Brand Lasko
			@FindBy(xpath="//h1[@class='results-header__keyword']")
			public WebElement cbxBrandHeater;
			
			// Checkbox Brand Black+Decker
			@FindBy(xpath="//h3[contains(text(),'BLACK+DECKER')]")
			public WebElement cbxBrandToasters;	
			
			// txtbx fan
			@FindBy(xpath="//span[contains(text(),'Brand: Honeywell')]")
			public WebElement txtbxfan;	
			
			
			// txtbx heater
			@FindBy(xpath=" //h1[@class='results-header__keyword'] ")
			public WebElement txtbxheater;	
			
			// txtbx toaster
			 @FindBy(xpath=" //h1[contains(text(),'toaster')] ")
			public WebElement txtbxtoaster;	
					
			
			
	}		



