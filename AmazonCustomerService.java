//Assignment 71:Launch Amazon.in and  click on costumer Service using partial link text
package Package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonCustomerService 
{

	public static void main(String[] args) 
	{
		ChromeDriver a1 = new ChromeDriver();
		a1.get("https://www.amazon.in/ref=nav_logo");
		WebElement gmail = a1.findElement(By.linkText("Help"));
		gmail.click();
	}

}
