package xPtahLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathUsingContains {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/events/greatindianfestival?pf_rd_r=PE930NZ4H47S7CYE60AX&pf_rd_p=d153f17c-8877-4287-ad77-c072b8d7607e&pd_rd_r=e9af24d9-3abc-42f2-b881-d8020ca5fe54&pd_rd_w=m2RTV&pd_rd_wg=fTrI8&ref_=pd_gw_unk");
		driver.findElement(By.xpath("//input[contains(@id,'two')]")).sendKeys("watch");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[contains(@id,'nav')]")).click();

		driver.findElement(By.xpath("//span[contains(text(),'₹2,000 - ₹5,000')]")).click();
		
		driver.findElement(By.xpath("//span[contains(text(),'Top Br')]")).click();
		Thread.sleep(3000);
		driver.close();

	}
}
