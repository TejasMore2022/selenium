package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsClass4 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\91992\\OneDrive\\Desktop\\Drivers\\chromedriver_win32 (1)\\chromedriver.exe");	

		ChromeDriver chdriver = new ChromeDriver();
		
		chdriver.get("https://www.facebook.com/");
		
		By contactLocator = By.partialLinkText("uploading and non-");
		
		WebElement contactEmelement = chdriver.findElement(contactLocator);
		
		contactEmelement.click();
		
		//chdriver.findElement(By.linkText("Messenger")).click();
		
		

	}

}
