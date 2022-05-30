package com.learn4earn.apr24assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateAccountCssSelector {

	public static WebDriver driver;
	public static Select select;
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://rediff.com");
		
		driver.findElement(By.cssSelector("p#signin_info>a:nth-of-type(2)")).click();
		driver.findElement(By.cssSelector("input[name^=name]")).sendKeys("Muthu Raja");
		driver.findElement(By.cssSelector("input[name^=login]")).sendKeys("muthutestid");
		driver.findElement(By.cssSelector("input.btn_checkavail")).click();
		driver.findElement(By.cssSelector("input[name^=passwd]")).sendKeys("Say123$Happy");
		driver.findElement(By.cssSelector("input[name^=confirm_passwd]")).sendKeys("Say123$Happy");
		//driver.findElement(By.cssSelector("input[name^=altemail]")).sendKeys("muthu@testmail.com");
		
		driver.findElement(By.cssSelector("input[class=nomargin]")).click();
		
		select = new Select(driver.findElement(By.cssSelector("select[name^=hintq]")));
		select.selectByValue("What is your exact time of birth?");
		
		driver.findElement(By.cssSelector("input[name*=hinta]")).sendKeys("9:31 AM");
		driver.findElement(By.cssSelector("input[name^=mothername]")).sendKeys("Susi");
		
		driver.findElement(By.cssSelector("input#mobno")).sendKeys("9876543210");
		
		select = new Select(driver.findElement(By.cssSelector("select[name^=DOB_Day]")));
		select.selectByVisibleText("16");
		
		select = new Select(driver.findElement(By.cssSelector("select[name^=DOB_Month]")));
		select.selectByVisibleText("APR");
		
		select = new Select(driver.findElement(By.cssSelector("select[name^=DOB_Year]")));
		select.selectByVisibleText("1987");
		
		driver.findElement(By.cssSelector("input[name^=gender]+input[value=f]")).click();
		
		select = new Select(driver.findElement(By.cssSelector("select[id=country]")));
		select.selectByIndex(0);
		
		select = new Select(driver.findElement(By.cssSelector("select[name^=city]")));
		select.selectByVisibleText("Madurai");
		
	}

}
