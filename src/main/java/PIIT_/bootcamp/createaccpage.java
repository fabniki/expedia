package PIIT_.bootcamp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class createaccpage {
	public WebDriver driver;

	@FindBy(className = "account-type-card")
	WebElement personal;

	@FindBy(className = "bttn__content")
	WebElement select;
	
	public createaccpage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	public void personalacc() {
		personal.click();
		
	}
	public void selectcontinue() {
		select.click();
	}

}
