package collectionsDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionClassExample {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.Amazon.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Actions mouseMoveOver=new Actions(driver);
		WebElement signIn=driver.findElement(By.cssSelector("#nav-link-accountList"));
		mouseMoveOver.moveToElement(signIn).build().perform();
						
		mouseMoveOver.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT)
		.sendKeys("maxi").doubleClick().build().perform();
		
		mouseMoveOver.moveToElement(signIn).contextClick().build().perform();
		
		//System.out.println("done");
		
		
		
	}

}
