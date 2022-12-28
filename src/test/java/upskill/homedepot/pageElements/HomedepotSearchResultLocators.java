package upskill.homedepot.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomedepotSearchResultLocators {
	@FindBy(xpath="//span[contains(text(),'20 lbs. Original BBQ Smoker Charcoal Grilling Briq')]")
	public WebElement linkCoals;
}
