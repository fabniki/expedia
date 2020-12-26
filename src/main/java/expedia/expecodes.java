package expedia;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class expecodes {

	//static String dir = System.getProperty("user.dir");
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//System.setProperty("webdriver.gecko.driver", dir +"\\Drivers\\geckodriver.exe");
		//WebDriver driver=new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Owner\\eclipse-workspace\\bootcamp\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		driver.get("https://www.expedia.com");
		driver.manage().timeouts().implicitlyWait(11, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"gc-custom-header-nav-bar-acct-menu\"]/button/div")).click();	
				
		
	
		
		WebElement flight=driver.findElement(By.xpath("//span[contains(text(),'Flights')]"));
				flight.click();
				
				
				
				
				WebElement depart=driver.findElement(By.xpath("//*[@aria-label='Leaving from']"));
				depart.sendKeys("was");
				driver.findElement(By.xpath("//*[text()='Washington (WAS - All Airports)']")).click();
				driver.findElement(By.xpath("//button[@aria-label='Going to']")).sendKeys("new");
				driver.findElement(By.xpath("//*[text()='New York (NYC - All Airports)']")).click();
                          		
                               
                           
                       driver.findElement(By.id("d1-btn")).click();  
                       Thread.sleep(2000);
                   	driver.findElement(By.xpath("(//*[@data-day='14'])[1]")).click();

    				driver.findElement(By.xpath("(//*[@data-day='19'])[1]")).click();
    				driver.findElement(By.xpath("(//*[text()='Done'])[2]")).click();
    				Thread.sleep(1000);
    				driver.findElement(By.xpath("//*[text()='Search']")).click();

    				Thread.sleep(5000);
    				driver.findElement(By.xpath("(//*[@data-test-id='select-link'])[1]")).click();
    				JavascriptExecutor js=(JavascriptExecutor)driver;
    				js.executeScript("window.scrollBy(0,1000)");
    				driver.findElement(By.xpath("//button[normalize-space()='Continue']")).click();
    				Thread.sleep(5000);
    				driver.findElement(By.xpath("(//*[@data-test-id='select-link'])[2]")).click();
    				driver.findElement(By.xpath("//button[normalize-space()='Continue']")).click();
    				String parentWindow = driver.getWindowHandle();
    				Set<String> multiplewindows=driver.getWindowHandles();

    				//This switch to the child or second window. 
    				for(String window: multiplewindows)
    				 {
    					System.out.println(window);
    				 driver.switchTo().window(window);
    				 }
    				driver.findElement(

    						By.xpath("//*[@id=\"app-layer-base\"]/div/div/div[2]/div/main/section[2]/div[1]/div/div[2]/button"))

    						.click();
	 }}		
	
			
	
	

