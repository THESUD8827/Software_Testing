package Package1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class One 
{
	
	@Test
	public void testcase1()
	{
		ChromeDriver c1 = new ChromeDriver();
		c1.get("https://www.google.com/");
		c1.close();
		
	}
	
	
}
