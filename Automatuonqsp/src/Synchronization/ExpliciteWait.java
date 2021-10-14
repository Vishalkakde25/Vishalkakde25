package Synchronization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExpliciteWait {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.get("http://127.0.0.1/login.do;jsessionid=2jts3hzm97vt");
	WebDriverWait we = new WebDriverWait(driver, 30);
	we.until(ExpectedConditions.titleContains("Login"));
	driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
	driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
	driver.findElement(By.xpath("//a[text()='Login']")).click();
	System.out.println("Login Test Case  Pass");
	we.until(ExpectedConditions.titleContains("Track"));
	System.out.println("Homepage Test Case  Pass");
}
}
