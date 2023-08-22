//Assignment72:Launch  JSAM applicationn and click on click to know more about us with the help of tag name
package Package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tagname 
{

	public static void main(String[] args) 
	{
		ChromeDriver J1 = new ChromeDriver();
		J1.get("file:///C:/Users/Sudhanshu%20singh/Desktop/dsa/learningHTML1.html");
		WebElement gmail = J1.findElement(By.tagName("a"));
		gmail.click();

	}

}
