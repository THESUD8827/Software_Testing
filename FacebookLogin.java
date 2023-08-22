//Assignment 68:Program to login a Facebook account
package Package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin 
{

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver f1 = new ChromeDriver();
		f1.get("https://www.facebook.com/login/?privacy_mutation_token=eyJ0eXBlIjowLCJjcmVhdGlvbl90aW1lIjoxNjg3MzI4NDkzLCJjYWxsc2l0ZV9pZCI6MjY5NTQ4NDUzMDcyMDk1MX0%3D");
		WebElement Username = f1.findElement(By.id("email"));
		Username.sendKeys("Thesud.world.8827@gmail.com");
		WebElement Password = f1.findElement(By.id("pass"));
		Password.sendKeys("Thesud@8827");
		Thread.sleep(2000);
		WebElement Loginbutton = f1.findElement(By.id("loginbutton"));
		Loginbutton.click();
	}

}
