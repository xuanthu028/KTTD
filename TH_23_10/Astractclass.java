package TH_23_10;

import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;



public class Astractclass {
	public static String baseUrl = "http://demo.guru99.com/test/newtours/index.php";
	public static String driverPath = "D:\\\\New_folder\\\\chromedriver_win32\\\\chromedriver.exe";
	public static WebDriver driver;
	
	
		
	@BeforeTest
	public  void beforeTest() {
		
		int waitTime = 50;		
        System.setProperty("webdriver.chrome.driver", driverPath);
        driver = new ChromeDriver();
        driver.get(baseUrl);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(waitTime, TimeUnit.SECONDS);
		
	}
	
	@AfterTest
	public void tearDown() {
		driver.close();
	}
	@BeforeClass
	public void beforeClass() {
		System.out.println("Start Testing for Class");
	}
	@AfterClass
	public void afterClass() {
		System.out.println("End Testing for Class");
	}
	@BeforeSuite
	  public void beforeSuite() {
	}

	@AfterSuite
	  public void afterSuite() {
	}
	@BeforeMethod
	  public void beforeMethod() {
	}

	@AfterMethod
	  public void afterMethod() {
	}
			

}
