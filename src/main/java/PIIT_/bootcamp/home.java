package PIIT_.bootcamp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class home {

	public WebDriver driver;

	@FindBy(xpath = "//a[@id='headerMyAccount']/div[1]")
	WebElement myaccount;

	@FindBy(xpath = "//*[text()='Register']")
	WebElement register;

	public home(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	public void myaccounttab() {
		myaccount.click();
	}
	public void registertab() {
		register.click();
	}

}
