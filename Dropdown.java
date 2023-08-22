package Package1;

import org.openqa.selenium.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) 
	{
	ChromeDriver d1 = new ChromeDriver();
	d1.get("https://www.amazon.in/ref=nav_logo");
	WebElement dropdown = d1.findElement(By.xpath("//select[@name='url']"));
	
	Select s1 = new Select(dropdown);
	//s1.selectByValue("search-alias=alexa-skills");
	//s1.selectByVisibleText("Books");
	s1.selectByIndex(6);
		
		
	}

}
