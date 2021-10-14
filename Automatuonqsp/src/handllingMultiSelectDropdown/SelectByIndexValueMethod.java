package handllingMultiSelectDropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectByIndexValueMethod {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.navigate().to("file:///C:/Users/Pravin%20kakde/OneDrive/Desktop/HTML/muti%20select%20Dropdown.html");
	WebElement Element = driver.findElement(By.id("menu"));
	Select sel=new Select(Element);
	Thread.sleep(3000);
	sel.selectByIndex(5);
	Thread.sleep(3000);
	sel.deselectByIndex(5);
	}
}
