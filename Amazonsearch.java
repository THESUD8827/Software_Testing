package Package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Amazonsearch {

	public static void main(String[] args) {
		ChromeDriver d1 = new ChromeDriver();
		d1.get("https://www.amazon.in/ref=nav_logo");
		WebElement search = d1.findElement(By.name("field-keywords"));
		search.sendKeys("mens lower");
		WebElement searchtab = d1.findElement(By.id("nav-search-submit-button"));
		searchtab.click();
		WebElement select = d1.findElement(By.xpath("(//a/div/img)[5]"));
		select.click();
		WebElement buy = d1.findElement(By.xpath("//div//input[@id='buy-now-button']"));
		buy.click();

	}

}
