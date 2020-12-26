package PIIT_.bootcamp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class codes{

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:\\Users\\Owner\\eclipse-workspace\\bootcamp\\Drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://www.Homedepot.com");
	WebElement myaccount=driver.findElement(By.xpath("//a[@id='headerMyAccount']/div[1]"));
	myaccount.click();
	WebElement register=driver.findElement(By.xpath("//*[text()='Register']"));
	register.click();
	Thread.sleep(3000);
	WebElement personalac=driver.findElement(By.className("account-type-card"));
	personalac.click();
	WebElement selectcontinue=driver.findElement(By.className("bttn__content"));
	selectcontinue.click();
	Thread.sleep(4000);
	WebElement email=driver.findElement(By.name("email"));
	email.sendKeys("fabniki@gmail.com");
	WebElement password=driver.findElement(By.name("password"));
	password.sendKeys("Ryan12345");
	WebElement zipcode=driver.findElement(By.id("zipCode"));
	zipcode.sendKeys("20191");
	WebElement phone=driver.findElement(By.name("phone"));
	phone.sendKeys("7033090385");
	WebElement always=driver.findElement(By.xpath("//span[text()='Keep me signed in']"));
	always.click();
	WebElement verify=driver.findElement(By.xpath("//*[text()='Verify my mobile number via text message or phone call']"));
	verify.click();
	//driver.switchTo().frame(0);
	//WebElement robot=driver.findElement(By.id("recaptcha-anchor-label"));
//	robot.click();
	
	}

}
