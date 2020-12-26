package PIIT_.bootcamp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

 
public class Webdriver {
	public static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Driver("Chrome","http://www.Homedepot.com");
	}

	public static void Driver(String browser,String URI) {
		if(browser.equalsIgnoreCase("chrome")) {
System.setProperty("webdriver.chrome.driver","C:\\Users\\fabni\\eclipse-workspace\\bootcamp\\Drivers\\chromedriver.exe");
	 driver = new ChromeDriver();
	 driver.get(URI);
		}else if(browser.equalsIgnoreCase("Firefox")) {
			System.setProperty("webdriver.Firefox.driver","C:\\Users\\fabni\\eclipse-workspace\\bootcamp\\Drivers\\geckodriver.exe");
				driver=new FirefoxDriver();
		driver.get(URI);
			
		}
	}

}
