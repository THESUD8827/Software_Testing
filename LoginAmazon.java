//Assignment76:login to amazon account with the help of relative xpath
package Package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LoginAmazon 
{

	public static void main(String[] args) 
	{
		ChromeDriver A1 = new ChromeDriver();
		A1.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googinhydr1-21&ref=pd_sl_4b3e4wrxds_b&adgrpid=60639568242&hvpone=&hvptwo=&hvadid=617721280315&hvpos=&hvnetw=g&hvrand=10501093027374121840&hvqmt=b&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9299451&hvtargid=kwd-311187680635&hydadcr=5841_2362028");
		WebElement Hover = A1.findElement(By.xpath("(//div//span)[15]"));
		Actions s1 = new Actions(A1);
		s1.moveToElement(Hover).perform();
		WebElement SingIn = A1.findElement(By.xpath("(//div//a//span[@class=\"nav-action-inner\"])[1]"));
		SingIn.click();
		WebElement Username = A1.findElement(By.xpath("(//div//input)[7]"));
		Username.sendKeys("Thesud.world.8827@gmail.com");
		WebElement Continue = A1.findElement(By.xpath("//div//span//input"));
		Continue.click();
		WebElement Password = A1.findElement(By.xpath("(//div//input)[9]"));
		Password.sendKeys("Thesud@8827");
		WebElement SignIN = A1.findElement(By.xpath("(//div//input)[11]"));
		SignIN.click();
		
	}
}
