package collectionsDemo;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestionDemo {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.name("q")).sendKeys("Java");

		List<WebElement> listOfWebElements = driver.findElements(By.cssSelector(".sbct")); // list class
		System.out.println(listOfWebElements.size());
		
		
		System.out.println(listOfWebElements.get(1).getText());

		for(WebElement ele:listOfWebElements) {
		//System.out.println(ele.getText());
		if (ele.getText().contains("Java Rock")) {
				ele.click();
				break;
			}
		}
		//driver.close();

	}
	
}
