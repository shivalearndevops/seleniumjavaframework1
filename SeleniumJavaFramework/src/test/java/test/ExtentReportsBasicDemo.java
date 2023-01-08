package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportsBasicDemo {
	
	private static WebDriver driver = null;

	public static void main(String[] args) {
	
		ExtentSparkReporter  sparkreporter = new ExtentSparkReporter("extentReports.html");
		// TODO Auto-generated method stub

		ExtentReports extent = new ExtentReports();
		extent.attachReporter(sparkreporter);
		
		ExtentTest test1 = extent.createTest("Google Search Test One","this is a test to validate google search functionality");
		
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chorme.driver", projectPath+"/drivers/chromedriver/chromedriver");
		driver = new ChromeDriver();
		
		test1.log(Status.INFO, "starting test case");
		driver.get("https://www.facebook.com");
		
		test1.pass("Navigated to facebook.com");
		
		driver.findElement(By.id("email")).sendKeys("shiva");
		test1.pass("entered text in username");
		
		driver.findElement(By.name("login"));
		test1.pass("clicked on login button");
		
		driver.close();
		driver.quit();
		
		test1.pass("closed the browser");
		test1.info("test passed successfully");
	
		
		
ExtentTest test2 = extent.createTest("Google Search Test One","this is a test to validate google search functionality");
		
		System.setProperty("webdriver.chorme.driver", projectPath+"/drivers/chromedriver/chromedriver");
		driver = new ChromeDriver();
		
		test2.log(Status.INFO, "starting test case");
		driver.get("https://www.facebook.com");
		
		test2.pass("Navigated to facebook.com");
		
		driver.findElement(By.id("email")).sendKeys("shiva");
		test2.pass("entered text in username");
		
		driver.findElement(By.name("login"));
		test2.pass("clicked on login button");
		
		driver.close();
		driver.quit();
		
		test2.fail("closed the browser");
		test2.info("test passed successfully");
		
		
		//calling flush writes everything to the log file
		extent.flush();
		
	}

}
