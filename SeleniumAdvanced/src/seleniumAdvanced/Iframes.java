package seleniumAdvanced;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframes {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://www.leafground.com/frame.xhtml");
		driver.manage().window().maximize();
		driver.switchTo().frame(0);
		WebElement button1=driver.findElement(By.id("Click"));
		button1.click();
		
		String txt=driver.findElement(By.id("Click")).getText();
		System.out.println(txt);
		
		driver.switchTo().defaultContent();
		driver.switchTo().frame(1);
		driver.switchTo().frame(2);
		WebElement button2=driver.findElement(By.id("Click1"));
		button2.click();
	}

}
