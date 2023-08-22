package Package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Loginfacebook {

	public static void main(String[] args) {
		ChromeDriver d1 = new ChromeDriver();
		d1.get("https://www.facebook.com/login/?privacy_mutation_token=eyJ0eXBlIjowLCJjcmVhdGlvbl90aW1lIjoxNjg1ODU3Mzk2LCJjYWxsc2l0ZV9pZCI6MjY5NTQ4NDUzMDcyMDk1MX0%3D");
		WebElement username = d1.findElement(By.id("email"));
		username.sendKeys("Thesud.world.8827@gmail.com");
		WebElement password = d1.findElement(By.id("pass"));
		password.sendKeys("Thesud8827");
		WebElement loginbutton = d1.findElement(By.id("loginbutton"));
		loginbutton.click(); b
		
	}

}
