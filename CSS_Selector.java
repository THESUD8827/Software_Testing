package Package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS_Selector {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver f1 = new ChromeDriver();
		f1.get("https://www.facebook.com/login/");
		WebElement Username = f1.findElement(By.cssSelector("input#email"));
		Username.sendKeys("Thesud.world.8827@gmail.com");
		WebElement Password = f1.findElement(By.cssSelector("input#pass"));
		Password.sendKeys("Thesud@8827");
		Thread.sleep(2000);
		WebElement Loginbutton = f1.findElement(By.id("loginbutton"));
		Loginbutton.click();

	}

}
