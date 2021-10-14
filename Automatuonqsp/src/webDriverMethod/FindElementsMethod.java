package webDriverMethod;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsMethod {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("bike");
		Thread.sleep(3000);
		List<WebElement> suggestions = driver.findElements(By.xpath("//div[@class='pcTkSc']"));

		/* for( int n=0;n<suggestions.size();n++)
	    {
	    	WebElement suggestion = suggestions.get(n);
	    	 String we = suggestion.getText();
	    	System.out.println(we);
	    }*/

		for (WebElement we : suggestions) {
			System.out.println(we.getText());
		}
	}
}
