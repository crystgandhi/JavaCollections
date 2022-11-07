package collectionsDemo;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Examples {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.google.com");
		System.out.println(driver.manage().window().getSize());
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement newTab=driver.findElement(By.name("q"));
		
		Actions nwTb=new Actions(driver);
		nwTb.moveToElement(newTab).click().sendKeys(Keys.CONTROL+"n"+Keys.ENTER).build().perform();
	 System.out.println("Google");
		
		
//		System.out.println(driver.getWindowHandle());
//		System.out.println(driver.getTitle());
//		//System.out.println(driver.getClass());
//		driver.manage().window().maximize();
//		driver.findElement(By.name("q")).sendKeys("Java");
//		
//		List<WebElement> autosuggestedList=driver.findElements(By.cssSelector(".sbct"));
//		System.out.println(autosuggestedList.size());
//		
//		for(int i=0; i<autosuggestedList.size(); i++) {
//			System.out.println(autosuggestedList.get(i).getText());
//		}
//		
	
		
//		driver.navigate().forward();
//		driver.close();
// TODO Auto-generated method stub

	}

	

}
