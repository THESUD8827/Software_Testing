//Assignment73.Launch Google.com and search your city with the help of className locator
package Package1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mycity 
{

	public static void main(String[] args) 
	{
		ChromeDriver c1 = new ChromeDriver();
		c1.get("https://www.google.com/");
		WebElement Search = c1.findElement(By.className("gLFyf"));
		Search.sendKeys("Rewa");
		Search.sendKeys(Keys.ENTER);

		
	}

}
