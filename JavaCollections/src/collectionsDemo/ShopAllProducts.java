package collectionsDemo;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ShopAllProducts {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/shop");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		List<WebElement> products=driver.findElements(By.cssSelector(".card-footer .btn-info"));
		System.out.println(products.size());
		
		
		for(int i=0; i < products.size(); i++) {
		 products.get(i).click();
		}
		driver.findElement(By.cssSelector("a.nav-link.btn.btn-primary")).click();
		driver.findElement(By.cssSelector("button.btn.btn-success")).click();
		driver.findElement(By.id("country")).sendKeys("India");
		driver.findElement(By.cssSelector("div.suggestions ul:nth-child(1) li:nth-child(1) > a:nth-child(1)")).click();
		WebDriverWait wait=new WebDriverWait(driver,1);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.cssSelector("#checkbox2"))));
		driver.findElement(By.cssSelector("#checkbox2")).click();
		driver.findElement(By.cssSelector("input[value*='Purchase']")).click();
	}

}
