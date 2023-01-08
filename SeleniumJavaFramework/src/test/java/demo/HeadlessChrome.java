package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessChrome {
	
	public static void main(String[] args) {
		test();
	}
	
	public static void test() {
		
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("headless");
		
		WebDriver driver = new ChromeDriver(opt);
		
		driver.get("https://www.facebook.com");
		System.out.println(driver.getTitle());
		driver.findElement(By.id("email")).sendKeys("shiva");
		
		driver.findElement(By.name("login")).click();
		driver.close();
		driver.quit();
		
	}

}
