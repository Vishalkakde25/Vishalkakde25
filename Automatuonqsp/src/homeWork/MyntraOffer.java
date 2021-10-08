package homeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyntraOffer{

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.navigate().to("https://www.myntra.com/");
		driver.findElement(By.xpath("//input[@class='desktop-searchBar']")).sendKeys("shirts");
		driver.findElement(By.xpath("//a[@class='desktop-submit']")).click();
		driver.findElement(By.xpath("(//label[@class='common-customRadio gender-label'])[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//label[@class='vertical-filters-label common-customCheckbox'])[5]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//label[@class='common-customCheckbox vertical-filters-label']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//label[@class='common-customCheckbox'])[5]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//label[@class='common-customRadio vertical-filters-label' ])[3]")).click();
		Thread.sleep(3000);
		String a = driver.findElement(By.xpath("(//h3[@class='product-brand']/ancestor::a[@target='_blank']/descendant::span[@class='product-discountPercentage'])[1]")).getText();
		System.out.println("Offer are present"+a);
		Thread.sleep(3000);
		driver.close();


	}

}
