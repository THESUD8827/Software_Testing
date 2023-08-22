//Assignment 66: Program to launch Chrome browser
package Package1;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeLaunch 
{

	public static void main(String[] args) 
	{
		ChromeDriver c1 = new ChromeDriver();
		c1.get("https://www.google.com/");
			
	}

}
