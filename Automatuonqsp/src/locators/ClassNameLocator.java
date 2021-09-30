package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ClassNameLocator {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.flipkart.com/account/login?ret=/offers/exchange-offers");
	driver.manage().window().maximize();
	Thread.sleep(3000);
	driver.findElement(By.className("_2IX_2- _3umUoc VJZDxU")).sendKeys("7507508663");
	driver.findElement(By.className("_2IX_2- _3umUoc _3mctLh VJZDxU")).sendKeys("1345");
	Thread.sleep(3000);
	driver.findElement(By.className("_2KpZ6l _2HKlqd _3AWRsL")).click();
}
}
