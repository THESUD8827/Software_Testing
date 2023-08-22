//Assignment 80: Launch amazon.in, from all dropdown select furniture using keys functions
package Package1;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AmaSign 
{

	public static void main(String[] args) throws IOException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googinhydr1-21&ref=pd_sl_4b3e4wrxds_b&adgrpid=60639568242&hvpone=&hvptwo=&hvadid=617721280315&hvpos=&hvnetw=g&hvrand=10501093027374121840&hvqmt=b&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9299451&hvtargid=kwd-311187680635&hydadcr=5841_2362028");
		WebElement Hover = driver.findElement(By.xpath("(//div//span)[15]"));
		Actions s1 = new Actions(driver);
		s1.moveToElement(Hover).perform();
		WebElement SingIn = driver.findElement(By.xpath("(//div//a//span[@class=\"nav-action-inner\"])[1]"));
		SingIn.click();
		WebElement Username = driver.findElement(By.xpath("(//div//input)[7]"));
		Username.sendKeys("9179790457");
		WebElement Continue = driver.findElement(By.xpath("//div//span//input"));
		Continue.click();
		WebElement Password = driver.findElement(By.xpath("(//div//input)[9]"));
		Password.sendKeys("Thesud@8827");
		WebElement SignIN = driver.findElement(By.xpath("(//div//input)[11]"));
		SignIN.click();
		
		TakesScreenshot ts = driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\Sudhanshu singh\\eclipse-workspace\\Selenium\\Screenshot\\sud.png");
		FileUtils.copyFile(source, destination);
	}

}
