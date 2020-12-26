package expedia;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class home {
	@FindBy(xpath = "//span[contains(text(),'Flights')]")
	WebElement flights;
	
	@FindBy(id="location-field-leg1-origin")
	WebElement leaving;
	@FindBy(className="uitk-faux-input")
	WebElement going;
	@FindBy(id="d1-btn")
	WebElement Departing;

	

}
