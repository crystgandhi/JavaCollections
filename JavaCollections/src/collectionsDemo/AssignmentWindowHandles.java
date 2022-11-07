package collectionsDemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentWindowHandles {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.linkText("Multiple Windows")).click();
		
		
		driver.findElement(By.linkText("Click Here")).click();
		
		Set<String> windows = driver.getWindowHandles();
		/*
		 * System.out.println(windows.size()); Iterator<String> it = windows.iterator();
		 * String parentWindowId = it.next(); String childWindowId=it.next();
		 * System.out.println("parent   :"+parentWindowId);
		 * System.out.println("Child1   :"+childWindowId);
		 * 
		 * String textFromWindow1 =
		 * driver.findElement(By.cssSelector("div.example h3")).getText();
		 * System.out.println(textFromWindow1);
		 * 
		 * driver.switchTo().window(childWindowId); String textFromWindow2 =
		 * driver.findElement(By.cssSelector("div h3")).getText();
		 * System.out.println(textFromWindow2);
		 */	
		
		
		List<String>windowLists=new ArrayList(windows);
		
		for(String winId:windowLists) {
			String handle=driver.switchTo().window(winId).getWindowHandle();
			System.out.println(handle);
						
			String title=driver.switchTo().window(winId).getTitle();
			System.out.println(title);
			
		}
		
		
	}

}
