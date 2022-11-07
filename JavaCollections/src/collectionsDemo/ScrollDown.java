package collectionsDemo;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class ScrollDown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		((JavascriptExecutor)driver).executeScript("window.scrollBy(0,500)");
		Thread.sleep(5000);
		((JavascriptExecutor)driver).executeScript("document.querySelector('.tableFixHead').scrollTop=5000");
		
		List<WebElement>Amount=driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));
		System.out.println(Amount.size());
	       int	sum=0;
		for(int i=0; i<Amount.size(); i++) {
			sum=sum+Integer.parseInt(Amount.get(i).getText());
		}
		System.out.println(sum);
		
		
		String total=driver.findElement(By.cssSelector(".totalAmount")).getText().split(":")[1].trim();
		int value=Integer.parseInt(total);
		Assert.assertEquals(sum, value);
		driver.close();
 	}

}
