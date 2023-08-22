//Assignment 70:Launch Amazon.in and navigate to  Bestsellers using link text
package Package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linktext 
{
	public static void main(String[] args) 
	{
		ChromeDriver a1 = new ChromeDriver();
		a1.get("https://www.amazon.in/ref=nav_logo");
		WebElement Bestseller = a1.findElement(By.linkText("Best Sellers"));
		Bestseller.click();
	}

}
