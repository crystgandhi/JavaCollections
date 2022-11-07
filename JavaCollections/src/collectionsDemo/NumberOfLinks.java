package collectionsDemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NumberOfLinks {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println(driver.findElements(By.tagName("a")).size());
		WebElement footdriveVariables=driver.findElement(By.cssSelector("#gf-BIG"));
		System.out.println(footdriveVariables.findElements(By.tagName("a")).size());

		WebElement colDriver=footdriveVariables.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println(colDriver.findElements(By.tagName("a")).size());
		
		for(int i=1; i<colDriver.findElements(By.tagName("a")).size(); i++) {
			
			String clickOnLinkTab=Keys.chord(Keys.CONTROL, Keys.ENTER);
		colDriver.findElements(By.tagName("a")).get(i).sendKeys(clickOnLinkTab);
		
		}
		
		Set<String>handles=driver.getWindowHandles();
		List<String>handlesName=new ArrayList(handles);
		System.out.println(handlesName.size());
		Iterator<String>it=handlesName.iterator();
		while(it.hasNext()) {
			//System.out.println(it.next());
		System.out.println(driver.switchTo().window(it.next()).getTitle());
		}		
		
	}

}
