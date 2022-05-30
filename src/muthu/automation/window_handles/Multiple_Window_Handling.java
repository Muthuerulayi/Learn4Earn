package window_handles;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Multiple_Window_Handling {
	
	public static WebDriver driver;
	//public static Actions action;

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		driver.findElement(By.id("newWindowsBtn")).click();
		
		String parentWindowHandle = driver.getWindowHandle();
		System.out.println("Parent Window: " + parentWindowHandle);
		
		Set<String> handles = driver.getWindowHandles();
		for(String handle:handles) {
			if(!handle.equals(parentWindowHandle)) {
				driver.switchTo().window(handle);
				System.out.println(handle);
				System.out.println(driver.getCurrentUrl());
				
			}
			
		}

	}

}
