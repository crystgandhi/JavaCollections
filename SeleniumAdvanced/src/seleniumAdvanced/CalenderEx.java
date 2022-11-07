package seleniumAdvanced;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CalenderEx {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/calendar.xhtml");
		driver.manage().window().maximize();

//		WebElement calenderElement = driver.findElement(By.xpath("//*[@id=\"j_idt87:schedule\"]/div[2]/div/table/tbody/tr/td/div/div/div/table/tbody/tr[5]/td[5]"));
//		calenderElement.click();
//		
//		WebElement calenderElement2 = driver.findElement(By.name("name=j_idt87:title"));
//		String name=calenderElement2.getTagName();
//		System.out.println(name);
		
		WebElement calenderElement3 = driver.findElement(By.xpath("//tbody/tr[4]/td[2]/div[1]"));
		
		calenderElement3.click();
		Boolean result=calenderElement3.isEnabled();
		System.out.println(result);
		String name=calenderElement3.getTagName();
		System.out.println(name);
		String txt=calenderElement3.getText();
		System.out.println(txt);
		
		
		Actions action=new Actions(driver);
		action.sendKeys(calenderElement3, "meeting" );
		action.build().perform();
		
		WebElement save=driver.findElement(By.xpath("//*[@id='j_idt87:addButton']/span[2]"));
		save.click();
		
		
	}

}
