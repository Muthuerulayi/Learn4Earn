package datahandling_properties;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Rediff_Config {
	
	public static WebDriver driver;
	public static Properties prop;
	public static FileInputStream ip;
	public static SoftAssert softAssert;
	
	@Test(priority = 1)
	public void launchUrl() throws Exception {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		softAssert = new SoftAssert();
		
		prop = new Properties();
		String path = System.getProperty("user.dir") + "\\src\\muthu\\testng\\datahandling_properties\\config.properties";
		ip = new FileInputStream(path);
		prop.load(ip);
		driver.get(prop.getProperty("url"));
		
		softAssert.assertEquals(driver.getTitle(), prop.getProperty("title"));
		softAssert.assertAll();
		
	}
	
	@Test(priority = 2, dependsOnMethods = {"launchUrl"})
	public void signIn() throws Exception {
		
		WebElement signInLink = driver.findElement(By.xpath(prop.getProperty("xpathSigninLink")));
		softAssert.assertTrue(signInLink.isDisplayed() && signInLink.isEnabled());
		signInLink.click();
		
		Thread.sleep(2000);
		
		WebElement userNameTextbox = driver.findElement(By.xpath(prop.getProperty("xpathUsernameTextbox")));
		softAssert.assertTrue(userNameTextbox.isDisplayed() && userNameTextbox.isEnabled());
		userNameTextbox.sendKeys(prop.getProperty("username"));
		
		WebElement passwordTextbox = driver.findElement(By.xpath(prop.getProperty("xpathPasswordTextbox")));
		softAssert.assertTrue(passwordTextbox.isDisplayed() && passwordTextbox.isEnabled());
		passwordTextbox.sendKeys(prop.getProperty("password"));
		
		Thread.sleep(2000);
		
		WebElement signInButton = driver.findElement(By.xpath(prop.getProperty("xpathSigninButton")));
		softAssert.assertTrue(signInButton.isDisplayed() && signInButton.isEnabled());
		signInButton.click();
		
		Thread.sleep(2000);
		
		softAssert.assertAll();
	}
	
	@Test(priority = 3, dependsOnMethods = {"signIn"})
	public void logOut() throws Exception {
		
		WebElement logOutLink = driver.findElement(By.xpath(prop.getProperty("xpathLogoutLink")));
		softAssert.assertTrue(logOutLink.isDisplayed() && logOutLink.isEnabled());
		logOutLink.click();
		
		Thread.sleep(2000);
		
		//softAssert.assertAll();
		
	}
	
	@Test(priority = 4, dependsOnMethods = {"logOut"})
	public void rediffHome() throws Exception {
		
		WebElement rediffHomeLink = driver.findElement(By.xpath(prop.getProperty("xpathRediffHomeLink")));
		softAssert.assertTrue(rediffHomeLink.isDisplayed() && rediffHomeLink.isEnabled());
		rediffHomeLink.click();
	
		//softAssert.assertAll();
	}

}
