package homeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.seleniumhq.jetty9.util.Scanner;

public class AmazonUsingXpathDependentIndependent {
	public static void main(String[] args) {
		java.util.Scanner sc=new java.util.Scanner(System.in);
		System.out.println("Enter the Laptop Name");
		String LaptopName=sc.nextLine();
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.amazon.in/");
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys(LaptopName);
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		String priceOfGivenLappy = driver.findElement(By.xpath("//span[.='"+LaptopName+"']/ancestor::div[@class='a-section a-spacing-none']/descendant::span[@class='a-price-whole']")).getText();
	System.out.println(priceOfGivenLappy);
	}
}
