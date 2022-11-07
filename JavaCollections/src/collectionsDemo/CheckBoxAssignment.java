package collectionsDemo;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import junit.framework.Assert;

public class CheckBoxAssignment {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("checkBoxOption1")).click();
	    
		String txt=driver.findElement(By.xpath("//label[@for='bmw']")).getText();
			
		WebElement dropDown=driver.findElement(By.id("dropdown-class-example"));
		Select obj=new Select(dropDown);
		obj.selectByVisibleText(txt);
		
		driver.findElement(By.id("name")).sendKeys(txt);
		driver.findElement(By.id("alertbtn")).click();
		String mesg=driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
		Assert.assertTrue(mesg.contains(txt));

}
}