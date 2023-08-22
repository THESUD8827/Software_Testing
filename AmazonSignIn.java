//Assignment 68a:Program to sign in amazon.in
package Package1;

import java.awt.Desktop.Action;

import org.openqa.selenium.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AmazonSignIn 
{

	public static void main(String[] args) 
	{
		ChromeDriver A1 = new ChromeDriver();
		A1.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googinhydr1-21&ref=pd_sl_4b3e4wrxds_b&adgrpid=60639568242&hvpone=&hvptwo=&hvadid=617721280315&hvpos=&hvnetw=g&hvrand=10501093027374121840&hvqmt=b&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9299451&hvtargid=kwd-311187680635&hydadcr=5841_2362028");
		WebElement Hover = A1.findElement(By.id("nav-link-accountList-nav-line-1"));
		Actions s1 = new Actions(A1);
		s1.moveToElement(Hover).perform();
		WebElement SingIn = A1.findElement(By.xpath("(//div//a//span[@class=\"nav-action-inner\"])[1]"));
		SingIn.click();
		WebElement Username = A1.findElement(By.id("ap_email"));
		Username.sendKeys("Thesud.world.8827@gmail.com");
		WebElement Continue = A1.findElement(By.id("continue"));
		Continue.click();
		WebElement Password = A1.findElement(By.id("ap_password"));
		Password.sendKeys("Thesud@8827");
		WebElement SignIN = A1.findElement(By.id("auth-signin-button"));
		SignIN.click();


	}

}
