package Package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

	public static void main(String[] args) 
	{
		ChromeDriver c1 = new ChromeDriver();
		c1.get("https://www.flipkart.com/");
		c1.manage().window().maximize();
		WebElement Close = c1.findElement(By.xpath("(//div//button)[2]"));
		Close.click();
		WebElement Search = c1.findElement(By.className("_3704LK"));
		Search.sendKeys("Shoe");
	}

}
