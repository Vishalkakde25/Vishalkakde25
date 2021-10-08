package xPtahLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathUsingAxes {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.navigate().to("https://www.flipkart.com");
	driver.findElement(By.xpath("//button[text()='✕']")).click();
	driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Samsung");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
	Thread.sleep(3000);
	String a = driver.findElement(By.xpath("//div[text()='SAMSUNG Galaxy F12 (Sky Blue, 64 GB)']/ancestor::div[@class='_3pLy-c row']/descendant::div[@class='_30jeq3 _1_WHN1']")).getText();
	Thread.sleep(3000);
	System.out.println(a);
	Thread.sleep(3000);
	//driver.navigate().back();
	//driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Keyboard");
	//driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
	//String b = driver.findElement(By.xpath("//a[text()='ZEBRONICS Zeb-K20 Wired USB Desktop Keyboard']/ancestor::div[@class='_4ddWXP']/descendant::div[@class='_30jeq3']")).getText();
	//System.out.println(b);
}
}
