import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserTest {
	
	public static void main(String[] args) {
		
		
		String projectPath = System.getProperty("user.dir");
		System.out.println(projectPath);
		
		
		System.setProperty("webdriver.gecko.driver", projectPath+"/drivers/geckodriver/geckodriver");
		
		WebDriver driver = new FirefoxDriver();
		
		//System.setProperty("webdriver.chorme.driver", projectPath+"/drivers/chromedriver/chromedriver");
		
		//WebDriverManager.chromedriver().setup();
		//WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		//WebElement textBox = driver.findElement(By.id("input"));
		//textBox.sendKeys("shiva pics");
		
		List<WebElement> listOfInputElements = driver.findElements(By.xpath("//input"));
		int count = listOfInputElements.size();
		System.out.println("List of Input Elements : "+ count);
		
		driver.close();
		
		
		
	}

}
