package Package1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Count_Rows {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Sudhanshu%20singh/Desktop/dsa/learningHTML1%20(1).html");
		Thread.sleep(2000);
		List<WebElement> Rows = driver.findElements(By.xpath("//th"));
		System.out.println(Rows.size());
	}

}
