package homeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://en-gb.facebook.com/");
	driver.findElement(By.id("email")).sendKeys("Vishal@123");
	Thread.sleep(3000);
	driver.findElement(By.id("pass")).sendKeys("123456");
	
	driver.findElement(By.xpath("//button[@name='login']")).click();
	Thread.sleep(3000);
	driver.close();
}
}
