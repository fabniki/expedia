package homeDepotboot;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class Newbootusuability {
	public WebDriver driver;

	@Parameters({ "browser", "URI" })
	@BeforeClass
	public void Driver(String browser, String URI) {
		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Owner\\eclipse-workspace\\bootcamp\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get(URI);
		} else if (browser.equalsIgnoreCase("Firefox")) {
			System.setProperty("webdriver.gecko.driver",
					"C:\\Users\\Owner\\eclipse-workspace\\bootcamp\\Drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
			driver.get(URI);
		}

	}

}
