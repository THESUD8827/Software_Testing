//Assignment 69:Launch Google and navigate to gmail using linktext
package Package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail 
{

	public static void main(String[] args) 
	{
		ChromeDriver g1 = new ChromeDriver();
		g1.get("https://www.google.com/");
		WebElement gmail = g1.findElement(By.linkText("Gmail"));
		gmail.click();
	}

}
