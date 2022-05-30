package window_handles;

import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class New_Tab_Handling {
	
	public static WebDriver driver;
	public static Actions action;
	public static Alert alert;

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		
		action = new Actions(driver);
		action.sendKeys(Keys.PAGE_DOWN).build().perform();
		
		String parentWindowHandle = driver.getWindowHandle();
		System.out.println("Parent Window Handle: " + parentWindowHandle);
		
		driver.findElement(By.id("newTabBtn")).click();
		
		Set<String> handles = driver.getWindowHandles();
		for(String handle:handles) {
			System.out.println("Window Handles: " + handle);
			
			if(!handle.equals(parentWindowHandle)) {
				driver.switchTo().window(handle);
				driver.manage().window().maximize();
				driver.findElement(By.id("alertBox")).click();
				
				alert = driver.switchTo().alert();
				Thread.sleep(2000);
				System.out.println(alert.getText());
				alert.accept();
				driver.findElement(By.id("promptBox")).click();
				alert = driver.switchTo().alert();
				System.out.println(alert.getText());
				alert.sendKeys("Hello");
				Thread.sleep(2000);
				alert.accept();
				driver.close();	
			}
			
		}
		
		driver.switchTo().window(parentWindowHandle);
		driver.findElement(By.id("name")).sendKeys("My name");

	}

}
