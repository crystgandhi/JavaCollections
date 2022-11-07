package seleniumAdvanced;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDOwn {

	public static void main(String[] args) {
				
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/table.xhtml");
		driver.manage().window().maximize();
		
		List <WebElement> elements=driver.findElements(By.xpath(null));
				
		WebElement fromElement=elements.get(4);
		WebElement toElement=elements.get(0);
		
		Actions action=new Actions(driver);
		action.clickAndHold(fromElement);
		action.moveToElement(toElement);
		action.release(toElement);
		
	}
	

}
