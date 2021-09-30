package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkTextLocator {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/Pravin%20kakde/OneDrive/Desktop/SelinumDoc/link.html");
	driver.manage().window().maximize();
	driver.findElement(By.linkText("Google")).click();
	Thread.sleep(3000);
	driver.close();
	
}
}
