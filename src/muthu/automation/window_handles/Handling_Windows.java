package window_handles;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Handling_Windows {

	public static WebDriver driver;
	public static Actions a;
	
	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		
		a = new Actions(driver);
		a.sendKeys(Keys.PAGE_DOWN).build().perform();
		
		String parentWindowHandle = driver.getWindowHandle();
		System.out.println("Parent Window Handle: " + parentWindowHandle);
		Thread.sleep(2000);
		driver.findElement(By.id("newWindowBtn")).click();
		
		Set<String> handles = driver.getWindowHandles();
		for(String handle:handles) {
			System.out.println("Window Handles: " + handle);
			
			if(!handle.equals(parentWindowHandle)) {
				driver.switchTo().window(handle);
				driver.manage().window().maximize();
				driver.findElement(By.id("firstName")).sendKeys("Chitra");
				driver.findElement(By.id("lastName")).sendKeys("Ilaiaraja");
				driver.close();	
			}
			
		}
		
		driver.switchTo().window(parentWindowHandle);
		driver.findElement(By.id("name")).sendKeys("My name");

	}

}
