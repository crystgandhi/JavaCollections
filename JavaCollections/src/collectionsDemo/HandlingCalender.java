package collectionsDemo;

import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingCalender {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.path2usa.com/travel-companion/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.id("form-field-travel_from")).sendKeys("NewYork");
		driver.findElement(By.id("form-field-travel_to")).sendKeys("NewDelhi");
		
		WebElement airlinesName=driver.findElement(By.id("form-field-travel_comp_airline"));
		Select selectAirLine=new Select(airlinesName);
		selectAirLine.selectByIndex(2);
		
		WebElement languages=driver.findElement(By.id("form-field-travel_comp_language"));
		Select selectLanguage=new Select(languages);
		selectLanguage.selectByValue("Tamil");
		
		driver.findElement(By.id("form-field-travel_comp_date")).click();
		
		String month=driver.findElement(By.cssSelector(".flatpickr-current-month")).getText();
		System.out.println(month);
		while(!month.contains("November")) {
			driver.findElement(By.cssSelector(".flatpickr-next-month")).click();
		}
		  WebElement
		  duration=driver.findElement(By.id("form-field-travel_comp_date_between"));
		  Select selectDuration=new Select(duration); selectDuration.selectByIndex(3);
		  
		  driver.findElement(By.id("form-field-travel_comp_date")).click();
		  List<WebElement>dates=driver.findElements(By.cssSelector(".flatpickr-day "));
		  for(int i=1; i<dates.size();i++) { String date=dates.get(i).getText();
		  if(date.equals("16")) { dates.get(i).click(); break; } }  
		
		driver.findElement(By.cssSelector(".elementor-button.elementor-size-sm")).click();
	}

}
