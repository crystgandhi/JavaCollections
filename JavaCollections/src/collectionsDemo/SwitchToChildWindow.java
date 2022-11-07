package collectionsDemo;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToChildWindow {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		System.out.println(driver.getWindowHandle());
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.cssSelector(".blinkingText")).click();
		driver.findElement(By.cssSelector(".im-para.red")).getText();
		System.out.println(driver.findElement(By.cssSelector(".im-para.red")).getText());
		String emaiId=driver.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1].trim().split(" ")[0];
		System.out.println(emaiId);
		
		Set<String>	 windowNames=driver.getWindowHandles();
		System.out.println(windowNames.size());
		Iterator<String> it =windowNames.iterator();
		
		String parentWindowId=it.next();
		System.out.println(parentWindowId);
		
		driver.navigate().back();
		
	}

}
