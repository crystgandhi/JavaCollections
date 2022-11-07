package collectionsDemo;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
	List<WebElement>rows=	driver.findElements(By.cssSelector(".left-align tr "));
	int numberofRows=rows.size();
	System.out.println("numberofRows  :"+numberofRows);
	
	String content=driver.findElement(By.cssSelector(".left-align tr:nth-child(3)")).getText();
	System.out.println(content);
	
	List<WebElement>columns=	driver.findElements(By.cssSelector(".left-align tr th "));
	int numberofColumns=columns.size();
	System.out.println("numberofColumns  :"+numberofColumns);	
	}

}
