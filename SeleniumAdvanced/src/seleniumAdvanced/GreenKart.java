package seleniumAdvanced;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

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

public class GreenKart {

	public static void main(String[] args) throws InterruptedException {

		// Browser Setup
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().window().maximize();
		int j = 0;
		String[] itemNames = {"Banana", "Cucumber", "Pomegranate"};  //items to be added to the cart

		// List of all vegetables
		List<WebElement> vegetables = driver.findElements(By.cssSelector("h4.product-name"));
		System.out.println(vegetables.size());

		//select one of the Product
		for (int i = 0; i < vegetables.size(); i++) {
		String[] vegeName = vegetables.get(i).getText().split("-");
		String formattedName = vegeName[0].trim();
		
		//array to arrayList (itemsNames)
		List<String> nameOfVegetables = Arrays.asList(itemNames);
		if (nameOfVegetables.contains(formattedName)) {
				j++;
		driver.findElements(By.xpath("//div[@class='product-action']")).get(i).click();
				if (j == 3) {
					break;
				}
			}
		}

		//Cart/Check out/Proceed
		
		  driver.findElement(By.cssSelector(".cart-icon")).click();
		  driver.findElement(By.cssSelector(".action-block")).click();
		  Thread.sleep(5000); WebElement ele =
		  driver.findElement(By.xpath("//*[@id=\'root\']/div/div/div/div/button"));
		  ele.click();
		  
		  // DropDown country Name (select tag xpath) 
		  WebElement countryName =
		  driver.findElement(By.xpath("//*[@id=\'root\']/div/div/div/div/div/select"));
		  Select selectmyCountry = new Select(countryName);
		  selectmyCountry.selectByValue("India");
		  
		  //CheckBox/ 
		  driver.findElement(By.cssSelector(".chkAgree")).click();
		  driver.findElement(By.xpath("//*[@id=\'root\']/div/div/div/div/button")).
		  click(); Thread.sleep(5000);
		 

	}

}