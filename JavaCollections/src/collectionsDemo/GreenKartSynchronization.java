package collectionsDemo;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.bouncycastle.util.Selector;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class GreenKartSynchronization {

	public static void main(String[] args) throws InterruptedException {
		// Browser Setup
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().window().maximize();
	//	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
				
		String[] itemNames = {"Banana", "Cucumber", "Pomegranate", "Carrot"};  //items to be added to the cart
        addItmes(driver, itemNames);
	}
	public static void addItmes(WebDriver driver, String[] itemNames) {
		 WebDriverWait wait=new WebDriverWait(driver, 5);
	   // List of all vegetables
		List<WebElement> vegetables = driver.findElements(By.cssSelector("h4.product-name"));
		System.out.println(vegetables.size());
		int j = 0;
		//select one of the Product
		for (int i = 0; i < vegetables.size(); i++) {
		String[] vegeName = vegetables.get(i).getText().split("-");
		String formattedName = vegeName[0].trim();
		//array to arrayList (itemsNames)
		List<String> nameOfVegetables = Arrays.asList(itemNames);
		if (nameOfVegetables.contains(formattedName)) {
				j++;
		driver.findElements(By.xpath("//div[@class='product-action']")).get(i).click();
				if (j == itemNames.length) 
				{
					break;
				}
			}
		}
		//Cart/Check out/Proceed
		 driver.findElement(By.cssSelector(".cart-icon")).click();
		  driver.findElement(By.cssSelector(".action-block")).click();  
		  wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".promocode")));
		  driver.findElement(By.cssSelector(".promocode")).sendKeys("rahulshettyacademy");
		  driver.findElement(By.cssSelector("button.promoBtn")).click();
		  wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));
		  System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());
	      Assert.assertEquals(driver.findElement(By.cssSelector("span.promoInfo")).getText(), "Code applied ..!");
	}

}