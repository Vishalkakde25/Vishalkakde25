package handllingMultiSelectDropdown;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectByValueMethod {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
	driver.navigate().to("file:///C:/Users/Pravin%20kakde/OneDrive/Desktop/HTML/muti%20select%20Dropdown.html");
	WebElement Element = driver.findElement(By.id("menu"));
	Select sel=new Select(Element);
	Thread.sleep(3000);
	sel.selectByValue("6");
	Thread.sleep(3000);
	sel.deselectByValue("6");
	}
}
