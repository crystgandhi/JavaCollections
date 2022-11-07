package collectionsDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import junit.framework.Assert;

public class Practice {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();

		WebElement element = driver.findElement(By.cssSelector("input[value*='radio2']"));
		element.click();

		driver.findElement(By.cssSelector("input[placeholder*='Type to Select Countries']")).sendKeys("India");
		Thread.sleep(2000);
		List<WebElement> countries = driver.findElements(By.cssSelector("li div"));
		countries.get(1).click();

		WebElement staticDD = driver.findElement(By.cssSelector("select[id*='dropdown-class-example']"));
		Select DD = new Select(staticDD);
		DD.selectByIndex(3);

		driver.findElement(By.cssSelector("input[id*='checkBoxOption1']")).click();
		Thread.sleep(3000);
		Boolean findEnabled = driver.findElement(By.cssSelector("input[id*='checkBoxOption1']")).isSelected();
		System.out.println(findEnabled);
		driver.findElement(By.cssSelector("input[id*='checkBoxOption1']")).click();
		System.out.println(driver.findElement(By.cssSelector("input[id*='checkBoxOption1']")).isSelected());
		List<WebElement> numberOfCheckBox = driver.findElements(By.cssSelector("input[type*='checkbox']"));
		System.out.println(numberOfCheckBox.size());

		driver.findElement(By.cssSelector("button[id*='openwindow']")).click();
		driver.findElement(By.cssSelector("a[id*='opentab']")).click();
		
		driver.quit();

	}

}
