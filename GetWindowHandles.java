package Package1;
//Program is about to move control from parent tab to child tab Using getwindowhandle() and getwindowhandles()
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandles 
{

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=23531&wExp=N&utm_source=google&utm_medium=cpc&utm_campaign=Brand&gad=1&gclid=CjwKCAjwtuOlBhBREiwA7agf1uw0SKf4x34gcYHhuYIVvne7eBhJR_eJGgClrqH9qvm4szEJIVbMNxoCt2EQAvD_BwE&gclsrc=aw.ds");
		WebElement GoogleClick = driver.findElement(By.className("google-text"));
		GoogleClick.click();
		String parent = driver.getWindowHandle();
		System.out.println(parent);
		Set<String> PandC = driver.getWindowHandles();
		System.out.println(PandC);
	
		Iterator <String> PC = PandC.iterator();
		String Ids = PC.next();
		String ChildID = PC.next();
		System.out.println(Ids);
		System.out.println(ChildID);
		driver.switchTo().window(ChildID);
		driver.close();
	}

}
