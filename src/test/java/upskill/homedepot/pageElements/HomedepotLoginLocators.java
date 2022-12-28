package upskill.homedepot.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomedepotLoginLocators {
	@FindBy(xpath="//input[@type='email']")
	public WebElement txtbxinput;
	
	
	@FindBy (xpath="//*[contains(text(), 'Continue')]")
	public WebElement clkbtn;
}
