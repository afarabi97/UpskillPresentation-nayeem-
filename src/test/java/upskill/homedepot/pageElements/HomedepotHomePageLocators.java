package upskill.homedepot.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomedepotHomePageLocators {
	@FindBy(xpath="//button[@id='headerSearchButton']//*[name()='svg']")
	public WebElement btnSearch;
	
	@FindBy(xpath="//input[@id='headerSearch']")
	public WebElement txtbxSearch;
	
	
}
