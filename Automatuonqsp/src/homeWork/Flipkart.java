package homeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.flipkart.com");
	driver.findElement(By.xpath("//button[text()='✕']")).click();
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("laptop");
	driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//div[text()='Core i5']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//div[text()='Brand']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//div[text()='HP']")).click();
	driver.findElement(By.xpath("//div[text()='Operating System']")).click();
	driver.findElement(By.xpath("//div[text()='Windows 10']")).click();
	
}
}
