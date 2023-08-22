package Package1;
import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;


public class Autosuggestion {

	public static void main(String[] args) throws InterruptedException 
	{
		
		ChromeDriver c1 = new ChromeDriver();
		c1.get("https://www.google.com/");
		WebElement search = c1.findElement(By.id("APjFqb"));
		search.sendKeys("ipl");
		Thread.sleep(2000);
		List<WebElement> auto = c1.findElements(By.xpath("//div[@class='AQZ9Vd']/div"));
		int count = auto.size();
		System.out.println(count);
		Thread.sleep(3000);
		auto.get(3).click();
	}

}

