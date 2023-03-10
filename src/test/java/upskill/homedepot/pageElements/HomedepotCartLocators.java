package upskill.homedepot.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomedepotCartLocators {
	@FindBy(xpath="//div[contains(text(),'Store Pickup')]")
	public WebElement ship;
	
	@FindBy(xpath="//button[normalize-space()='+']")
	public WebElement qty;
	
	@FindBy (xpath="//button[@class='bttn bttn--primary']")
	public WebElement crt;
}
