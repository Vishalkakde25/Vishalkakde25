package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagNameLocator {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.get("file:///C:/Users/Pravin%20kakde/OneDrive/Desktop/SelinumDoc/link.html");
	 Thread.sleep(3000);
     driver.findElement(By.tagName("a")).click();
     Thread.sleep(3000);
     
     driver.get("C:/Users/Pravin%20kakde/OneDrive/Documents/Link.html");
     driver.findElement(By.tagName("a")).click();
}
}
