package seleniumAdvanced;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksExtendedExamples {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://www.leafground.com/link.xhtml");
		driver.manage().window().maximize();
		
		WebElement dashboardLink=driver.findElement(By.linkText("Go to Dashboard"));
		dashboardLink.click();
		driver.navigate().back();
		
		WebElement whereToGo=driver.findElement(By.partialLinkText("Find the URL"));
		String where=whereToGo.getAttribute("href");
		System.out.println("This link is for: "+where);
		
		WebElement brokenLink=driver.findElement(By.linkText("Broken?"));
		brokenLink.click();
		String title= driver.getTitle();
		if(title.contains("404"))
			System.out.println("link is broken");
		
         driver.navigate().back();
         
         WebElement dashboardLink1=driver.findElement(By.linkText("Go to Dashboard"));
 		dashboardLink1.click();
        
 		driver.navigate().back();
	
		List <WebElement> totalLinks=driver.findElements(By.tagName("a"));
		int linkcount=totalLinks.size();
		System.out.println("linkcount:"+ linkcount);
//		
//		
		
		
		
	}

}
