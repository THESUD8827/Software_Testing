//Assignment no:75 Launch google.com and search country name india using absolute xpath
package Package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Country 
{
	public static void main(String[] args)
	{
		ChromeDriver c1 = new ChromeDriver();
		c1.get("https://www.google.com/");
		WebElement Search = c1.findElement(By.className("gLFyf"));
		//Search.sendKeys("Rewa");
	}

}
