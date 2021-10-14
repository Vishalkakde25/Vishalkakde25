package handllingSingleSelectDropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SingleSelectDropdown {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.navigate().to("file:///C:/Users/Pravin%20kakde/OneDrive/Desktop/HTML/Single%20select%20Dropdown.html");
	WebElement Element = driver.findElement(By.id("menu"));
	//Element.click();
    Select sel=new Select(Element);
    Thread.sleep(3000);
    //sel.selectByIndex(2);
    sel.selectByValue("2");
    Thread.sleep(3000);
    sel.selectByVisibleText("Samosa");
   
}
}
