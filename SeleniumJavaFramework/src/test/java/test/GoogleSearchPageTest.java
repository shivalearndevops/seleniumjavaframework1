package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.GoogleSearchPageObjects;

public class GoogleSearchPageTest {
	
	private static WebDriver driver = null;
	
	public static void main(String[] args) {
		
		googleSearchTest();
		
		
	}

	public static void googleSearchTest() {
		
		driver = new ChromeDriver();
		
		GoogleSearchPageObjects gspo = new GoogleSearchPageObjects(driver);
		
		driver.get("https://google.com");
		
		driver.findElement(By.name("No thanks")).click();
		
		gspo.setTextInSearchBox("shiva");
		
		gspo.clickSearchButton();
		
		driver.close();
	}
}
