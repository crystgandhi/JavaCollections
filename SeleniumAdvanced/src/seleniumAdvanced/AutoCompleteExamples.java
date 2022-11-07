package seleniumAdvanced;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AutoCompleteExamples {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/input.xhtml");
		driver.manage().window().maximize();

		Thread.sleep(5000);
		  List<WebElement>elements =
		  driver.findElements(By.xpath("//*[@id=\'j_idt106:auto-complete\']/ul/li"));
		  
		  int items = elements.size(); System.out.println(items);
		 
		
		WebElement element1=driver.findElement(By.xpath("//*[@id='j_idt106:auto-complete_input']"));
				 element1.sendKeys("Hello");
				 
				Select element11 =new Select(element1);
						element11.selectByIndex(2);
				/*
				 * List<WebElement>elements2=element11.getAllSelectedOptions();
				 * 
				 * for(WebElement num1:element11) { System.out.println(element11.getText()); }
				 */
	}

}

//*[@id="j_idt106:auto-complete"]/button
