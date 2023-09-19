package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Tests extends BaseClass{
	WebDriver driver = new ChromeDriver();
	@Test
	public void dataDepletion() {
		this.driver.navigate().to("http://www.calculator.net/");
		//driver.get("https://google.com");
		System.out.println("It works");
		this.driver.quit();
	}

	@Test
	public void voiceDepletion() {
		this.driver.navigate().to("http://www.calculator.net/");
		//driver.get("https://google.com");
		System.out.println("It works");
		this.driver.quit();
	}
}
