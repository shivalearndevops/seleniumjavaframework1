package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.GoogleSearchPage;

public class Test1_GoogleSearch {
	
	private static WebDriver driver = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		googleSearch();

	}
	public static void googleSearch() {
		
	 driver = new ChromeDriver();
		
		//goto google.com
		
		driver.get("https://www.google.com");
		
		//enter text in the search  text box
		
		//WebElement m = driver.findElement(By.id("input"));
		
		GoogleSearchPage.textbox_search(driver).sendKeys("shiva");
		
		//m.sendKeys("Shiva");
		
		//click on the enter button
		
		//m.sendKeys(Keys.ENTER);
		
		//close the browser
		driver.close();
		
		System.out.println("Test completed succesfully");
		
		
		
	}

}
