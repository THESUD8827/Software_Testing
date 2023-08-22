package Package1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Four {
	
	@Test
	public void testcase4()
	{
		ChromeDriver c1 = new ChromeDriver();
		c1.get("https://www.google.com/");
		c1.close();
	}

}
