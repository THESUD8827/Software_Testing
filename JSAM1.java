//Assignment 78: Launch JSAM application and perform action on religion dropdown
package Package1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class JSAM1 
{

	public static void main(String[] args) 
	{
		ChromeDriver J1 = new ChromeDriver();
		J1.get("file:///C:/Users/Sudhanshu%20singh/Desktop/dsa/learningHTML1.html");
		WebElement Relegion = J1.findElement(By.id("Relegion"));
		Select s1 = new Select(Relegion);
		//s1.selectByIndex(2);
		//s1.selectByValue("1");
		s1.selectByVisibleText("Hindu");
		/*Relegion.click();
		Relegion.sendKeys(Keys.DOWN);
		Relegion.sendKeys(Keys.DOWN);
		Relegion.sendKeys(Keys.ENTER);*/
}
}
