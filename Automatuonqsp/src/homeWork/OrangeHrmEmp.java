package homeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHrmEmp{
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		Thread.sleep(2000 );
		driver.findElement(By.xpath("//b[text()='PIM']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Add Employee']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Shrikants");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='middleName']")).sendKeys("Gajanan");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("Tiwari");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='employeeId']")).clear();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='employeeId']")).sendKeys("0123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='chkLogin']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='user_name']")).sendKeys("shrikants@123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='user_password']")).sendKeys("Shrikant@123");
		driver.findElement(By.xpath("//input[@id='re_password']")).sendKeys("Shrikant@123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='btnSave']")).click();
		driver.findElement(By.xpath("//input[@id='btnSave']")).click();
		driver.findElement(By.xpath("//input[@id='personal_txtLicenNo']")).sendKeys("123456789");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='personal_optGender_1']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='personal_chkSmokeFlag']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='btnSave']")).click();
		Thread.sleep(3000);

	}
}
