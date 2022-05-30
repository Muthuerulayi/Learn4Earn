package testngxml_understanding;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParallelCode {
	
	public static WebDriver driver;
	
	@Test(threadPoolSize = 2, invocationCount = 2)
	@Parameters({"url", "signinlink", "usernamebox", "username", "passwordbox", "password", "signinbutton", "logout", "rediffhome"})
	public void rediffFlowChrome(String url, String signinlink, String usernamebox, String username, String passwordbox, String password, String signinbutton, String logout, String rediffhome) {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		
		driver.findElement(By.xpath(signinlink)).click();
		driver.findElement(By.xpath(usernamebox)).sendKeys(username);
		driver.findElement(By.xpath(passwordbox)).sendKeys(password);
		driver.findElement(By.xpath(signinbutton)).click();
		driver.findElement(By.xpath(logout)).click();
		driver.findElement(By.xpath(rediffhome)).click();
		
	}
	
	@Test(threadPoolSize = 2, invocationCount = 2)
	@Parameters({"url", "signinlink", "usernamebox", "username", "passwordbox", "password", "signinbutton", "logout", "rediffhome"})
	public void rediffFlowFirefox(String url, String signinlink, String usernamebox, String username, String passwordbox, String password, String signinbutton, String logout, String rediffhome) {
		
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get(url);
		
		driver.findElement(By.xpath(signinlink)).click();
		driver.findElement(By.xpath(usernamebox)).sendKeys(username);
		driver.findElement(By.xpath(passwordbox)).sendKeys(password);
		driver.findElement(By.xpath(signinbutton)).click();
		driver.findElement(By.xpath(logout)).click();
		driver.findElement(By.xpath(rediffhome)).click();
		
	}

}
