//Assignment 74:Perform the action on each component on JSAM application with absolute xpath (except Religion)
package Package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSAM 
{

	public static void main(String[] args)
	{
		ChromeDriver J1 = new ChromeDriver();
		J1.get("file:///C:/Users/Sudhanshu%20singh/Desktop/dsa/learningHTML1.html");
		WebElement Username = J1.findElement(By.xpath("/html/body/input[1]"));
		Username.sendKeys("Thesud.world.8827");
		WebElement Hint = J1.findElement(By.xpath("/html/body/input[2]"));
		Hint.sendKeys("Hints");
		WebElement Password = J1.findElement(By.xpath("/html/body/input[3]"));
		Password.sendKeys("Thesud");
		WebElement firstname = J1.findElement(By.xpath("(/html/body/form/input)[1]"));
		firstname.sendKeys("Sudhanshu");
		//WebElement lastname = J1.findElement(By.xpath("(/html/body/form/input)[2]"));
		//lastname.sendKeys("Singh");
		WebElement submit = J1.findElement(By.xpath("(/html/body/form/input)[3]"));
		submit.click();
		WebElement Checkbox = J1.findElement(By.xpath("(/html/body/form/input)[6]"));
		Checkbox.click();

	}

}
