package seleniumAdvanced;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadFile {

	public static void main(String[] args) throws AWTException {
		
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://www.leafground.com/file.xhtml");
		driver.manage().window().maximize();
		
//		WebElement element=driver.findElement(By.xpath("//*[@id=\'j_idt93:j_idt95\']"));
//		Boolean result=element.isEnabled();
//		System.out.println(result);
//		String name=element.getTagName();
//		System.out.println(name);
//		element.click();
//		
		//*[@id="j_idt97:j_idt98_label"]
		
		driver.findElement(By.xpath("//*[@id='j_idt97:j_idt98_label']")).click();
		StringSelection selection=new StringSelection("C:\\Users\\Nikilkumaran\\image.jpg");
		
		Clipboard c=Toolkit.getDefaultToolkit().getSystemClipboard();
				c.setContents(selection, selection);
		
		
		Robot robot =new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
	}

}
