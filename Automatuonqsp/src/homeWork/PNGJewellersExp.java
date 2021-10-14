package homeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PNGJewellersExp {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver=new  ChromeDriver();
	driver.navigate().to("https://www.pngadgil.com/");
	WebDriverWait we=new WebDriverWait(driver, 30);
	we.until(ExpectedConditions.titleContains("Welcome To Online Jewellery Shopping Store | PNG Jewellers"));
	
	
	driver.findElement(By.xpath("//a[.='Wishlist']")).click();
	we.until(ExpectedConditions.titleContains("Login"));
	driver.findElement(By.xpath("//a[.='New User? Register']")).click();
	we.until(ExpectedConditions.titleContains("UserRegistration"));
	driver.findElement(By.xpath("//span[.='Diamond']")).click();
	driver.close();
	
}
}
