package xPtahLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathUsingMultipleAttribute {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.flipkart.com");
	driver.findElement(By.xpath("//button[text()='✕']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@name='q']")).sendKeys("laptop");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//div[@class='_3879cV' and text()='Core i5']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//div[@title='4★ & above']")).click();
	Thread.sleep(3000);
	driver.close();
}
}
