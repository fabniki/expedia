package PIIT_.bootcamp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Form {
	public WebDriver driver;
	@FindBy(name = "email")
	WebElement email;

	@FindBy(name = "password")
	WebElement password;

	@FindBy(id = "zipCode")
	WebElement zip;

	@FindBy(name = "phone")
	WebElement phone;
	@FindBy(xpath="//span[text()='Keep me signed in']")
	WebElement keep;
	@FindBy(xpath="//*[text()='Verify my mobile number via text message or phone call']")
	WebElement verify;

	public Form(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void emailtab(String name) {
		email.sendKeys(name);
	}

	public void passwordtab(String field) {
	password.sendKeys(field);
	}
	public void phonenum(String number) {
	phone.sendKeys(number);
	}
	public void zipcode(String zipnum) {
		zip.sendKeys(zipnum);
	}
	public void keepme() {
		keep.click();
	}
	public void verifyme(){	
		verify.click();
					}
		}


