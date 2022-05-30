package com.learn4earn.classwork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UploadFile {

	public static WebDriver driver;
	
	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/upload/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[starts-with(@id,'uploadfile_')]")).sendKeys("C:\\Users\\muthu\\Desktop\\Muthuerulayi Ilaiaraja_CV.doc");
		
	}

}
