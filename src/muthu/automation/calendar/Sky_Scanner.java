package calendar;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sky_Scanner {

	public static WebDriver driver;
	
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.expedia.ca/");
		
		driver.findElement(By.id("d1-btn")).click(); 
		new WebDriverWait(driver, 10)
		.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("div.uitk-date-picker-menu-container.uitk-date-picker-menu-container-double.uitk-menu-container.uitk-menu-open.uitk-menu-pos-left.uitk-menu-container-autoposition.uitk-menu-container-text-nowrap")));
		
		String monthYear = driver.findElement(By.cssSelector("h2.uitk-date-picker-month-name.uitk-type-medium")).getText();
		System.out.println(monthYear);
		
		List<WebElement> totalFrames = driver.findElements(By.tagName("iframe"));
		System.out.println(totalFrames.size());
		
		String month = monthYear.split(" ")[0].trim();
		String year = monthYear.split(" ")[1].trim();
		
		while(!(month.equals("July") && year.equals("2024"))) {
			driver.findElement(By.cssSelector("h2.uitk-date-picker-month-name.uitk-type-medium")).click();
//			monthYear = driver.findElement(By.id("depart-calendar__bpk_calendar_nav_select")).getText();
//			month = monthYear.split(" ")[0].trim();
//			year = monthYear.split(" ")[1].trim();
		}
//		
//		System.out.println(monthYear);
//		driver.findElement(By.xpath("//span[text() = '19']")).click();
//		System.out.println(driver.findElement(By.id("depart-calendar__bpk_calendar_nav_select")).getText());

	}

}
