package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NameLocator {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fgp%2Fcss%2Fhomepage.html%2F%3Fie%3DUTF8%26from%3Dhz%26ref_%3Dnav_ya_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
	driver.manage().window().maximize();
	Thread.sleep(5000);
	driver.findElement(By.name("email")).sendKeys("vishalkakde25@gmail.com");
	Thread.sleep(3000);
	driver.findElement(By.id("continue")).click();
	driver.findElement(By.name("password")).sendKeys("admin123");
	Thread.sleep(3000);
	driver.findElement(By.id("signInSubmit")).click();
	Thread.sleep(3000);
	driver.close();
	
}
}
