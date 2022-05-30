package com.learn4earn.apr24assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateAccountXpath {

	public static WebDriver driver;
	public static Select select;
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://rediff.com");
		
		driver.findElement(By.xpath("//p[@id='signin_info']/child::a[text()='Create Account']")).click();
		
		driver.findElement(By.xpath("//input[starts-with(@name,'name')]")).sendKeys("Muthu Raja");
		driver.findElement(By.xpath("//input[starts-with(@name,'login')]")).sendKeys("muthutestid");
		driver.findElement(By.xpath("//input[@class='btn_checkavail']")).click();
		driver.findElement(By.xpath("//input[starts-with(@name,'passwd')]")).sendKeys("Say123$Happy");
		driver.findElement(By.xpath("//input[starts-with(@name,'confirm_passwd')]")).sendKeys("Say123$Happy");
		//driver.findElement(By.xpath("//input[starts-with(@name,'altemail')]")).sendKeys("muthu@testmail.com");
		
		driver.findElement(By.xpath("//input[@class='nomargin']")).click();
		
		select = new Select(driver.findElement(By.xpath("//select[contains(@name,'hintq')]")));
		select.selectByVisibleText("What is your exact time of birth?");
		
		driver.findElement(By.xpath("//input[contains(@name,'hinta')]")).sendKeys("9:31 AM");
		driver.findElement(By.xpath("//input[starts-with(@name,'mothername')]")).sendKeys("Susi");
		driver.findElement(By.xpath("//input[@id='mobno']")).sendKeys("9876543210");
		
		select = new Select(driver.findElement(By.xpath("//select[contains(@name,'DOB_Day')]")));
		select.selectByVisibleText("16");
		
		select = new Select(driver.findElement(By.xpath("//select[contains(@name,'DOB_Month')]")));
		select.selectByVisibleText("APR");
		
		select = new Select(driver.findElement(By.xpath("//select[contains(@name,'DOB_Year')]")));
		select.selectByVisibleText("1987");
		
		driver.findElement(By.xpath("//input[contains(@name,'gender') and @value='f']")).click();
		
		select = new Select(driver.findElement(By.xpath("//select[@id='country']")));
		select.selectByVisibleText("India");
		
		select = new Select(driver.findElement(By.xpath("//select[contains(@name,'city')]")));
		select.selectByVisibleText("Madurai");

	}

}
