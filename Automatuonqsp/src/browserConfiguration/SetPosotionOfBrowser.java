package browserConfiguration;

import java.awt.Dimension;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetPosotionOfBrowser {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.google.com");
	 Thread.sleep(3000);
	Point a = new Point(90, 900);
	driver.manage().window().setPosition(a);
	
	org.openqa.selenium.Dimension b = new org.openqa.selenium.Dimension(900, 90);
	driver.manage().window().setSize(b);
	
}
}
