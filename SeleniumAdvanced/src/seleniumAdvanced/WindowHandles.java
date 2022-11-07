package seleniumAdvanced;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://www.leafground.com/window.xhtml");
		driver.manage().window().maximize();
 
	  WebElement openWindow=driver.findElement(By.xpath("//*[@id=\'j_idt88:new\']/span"));
		openWindow.click();
		
//		 WebElement openWindow=driver.findElement(By.cssSelector("div button"));
//			openWindow.click();

		  // to open new window 
		  String oldWindow=driver.getWindowHandle(); 
		  System.out.println(oldWindow); 
	 
		  Set <String> handles=driver.getWindowHandles(); 
		  for(String newWindow:handles)
		  { 
		  driver.switchTo().window(newWindow); 
		  } 
		  String newWindow=driver.getWindowHandle(); 
		  System.out.println(newWindow); 
		  Thread.sleep(5000);
		  
		  // To open multiple windows
		  
		 WebElement multipleWindow =driver.findElement(By.xpath("//*[@id=\'j_idt88:j_idt91\']/span")); 
		  multipleWindow.click(); 
		  int numberOfWindows=driver.getWindowHandles().size(); //
		  System.out.println(numberOfWindows);
		  
		  String oldWindow2=driver.getWindowHandle();
		  
		  WebElement closeWindow = driver.findElement(By.xpath("//*[@id='j_idt88:j_idt93']/span[2]"));
		  closeWindow.click(); 
		  Set <String> newWindowHandles=driver.getWindowHandles();
		  for(String allwindows:newWindowHandles){ 
			  if(!allwindows.equals(oldWindow)){
		  driver.switchTo().window(allwindows); 
		  driver.close(); } }
		 
		

	}

}
