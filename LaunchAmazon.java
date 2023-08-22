//Assignment 67:Program to launch Amazon.in let program sleep for 1second and close the tab (explore driver.close & driver.quite)
package Package1;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchAmazon 
{

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver a1 = new ChromeDriver();
		a1.get("https://www.amazon.in/ref=nav_logo");
		Thread.sleep(1000);
		a1.close();
		
	}

}
