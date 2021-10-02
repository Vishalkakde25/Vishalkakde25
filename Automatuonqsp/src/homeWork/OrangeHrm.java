package homeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHrm {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/");
   
    driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("Admin");
    driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("admin123");
    driver.findElement(By.xpath("//input[@name='Submit']")).click();
    Thread.sleep(3000);
    driver.findElement(By.xpath("//a[@id='welcome']")).click() ;
    driver.findElement(By.xpath("//a[text()='Logout']")).click();
   
    
    driver.close();
}
}
