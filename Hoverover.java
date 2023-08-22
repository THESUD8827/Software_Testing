package Package1;

import org.openqa.selenium.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Hoverover {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver c1 = new ChromeDriver();
		c1.get("https://www.flipkart.com/");
		c1.manage().window().maximize();
		WebElement close =  c1.findElement(By.xpath("//button[.=\"✕\"]"));
		close.click();
		Thread.sleep(3000);
		WebElement Login =  c1.findElement(By.className("_1_3w1N"));
		Actions a1 = new Actions(c1);
		a1.moveToElement(Login).perform();
		//WebElement Mens =  c1.findElement(By.linkText("Men's T-Shirts"));
		//Mens.click();
		
	}

}
