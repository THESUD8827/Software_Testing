package Package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.graphbuilder.curve.Point;

public class Scrolling_Down 
{

	public static void main(String[] args)
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/ref=nav_logo");
		WebElement Country = driver.findElement(By.linkText("Brazil"));
		Point p =  (Point) Country.getLocation();
		int x = p.getX();
	
	}

}
