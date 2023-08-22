package Package1;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebElement;

public class Keysf {

	public static void main(String[] args) {
		
		ChromeDriver d1 = new ChromeDriver();
		d1.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_96612yg6jw_e&adgrpid=60571832564&hvpone=&hvptwo=&hvadid=610644605478&hvpos=&hvnetw=g&hvrand=8966034071796469550&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9146603&hvtargid=kwd-296458795081&hydadcr=14452_2316413");
		WebElement All = d1.findElement(By.name("url"));
		All.sendKeys(Keys.ENTER);
		All.sendKeys(Keys.ARROW_DOWN);
		All.sendKeys(Keys.ARROW_DOWN);
		All.sendKeys(Keys.ARROW_DOWN);
		All.sendKeys(Keys.ARROW_DOWN);
		All.sendKeys(Keys.ARROW_DOWN);
		All.sendKeys(Keys.ARROW_DOWN);
		All.sendKeys(Keys.ARROW_DOWN);
		All.sendKeys(Keys.ARROW_DOWN);
		All.sendKeys(Keys.ARROW_DOWN);
		All.sendKeys(Keys.ARROW_DOWN);
		All.sendKeys(Keys.ARROW_DOWN);
		All.sendKeys(Keys.ARROW_DOWN);
		All.sendKeys(Keys.ARROW_DOWN);
		All.sendKeys(Keys.ARROW_DOWN);
		All.sendKeys(Keys.ARROW_DOWN);
		WebElement search = d1.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("chair");
		search.sendKeys(Keys.ENTER);
		
	}

}
