package Package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload 
{

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com/registration/");
		WebElement upload = driver.findElement(By.xpath("(//div/p/span/input)[6]"));
		upload.sendKeys("C:\\Users\\Sudhanshu singh\\Desktop");
	}

}
