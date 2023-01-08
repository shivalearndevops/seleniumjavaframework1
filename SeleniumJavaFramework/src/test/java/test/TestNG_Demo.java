package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.GoogleSearchPage;

public class TestNG_Demo {
	private static WebDriver driver = null;
	
	
	@BeforeTest
	public void setUpTest() {
		
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chorme.driver", projectPath+"/drivers/chromedriver/chromedriver");
		driver = new ChromeDriver();
	}
	

@Test
	public void googleSearch() {
		
	 //driver = new ChromeDriver();
		
		//goto google.com
		
		driver.get("https://www.facebook.com");
		
		//enter text in the search  text box
		
		//WebElement m = driver.findElement(By.id("input"));
		
		GoogleSearchPage.textbox_search(driver).sendKeys("shiva");
		
		//m.sendKeys("Shiva");
		
		//click on the enter button
		
		//m.sendKeys(Keys.ENTER);
			
	}

@AfterTest
	
	public void tearDownTest() {
		
		//close browser
		driver.close();
		driver.quit();
		System.out.println("Test completed succesfully");
	}
	
	}

