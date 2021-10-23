package TH_23_10;

import org.openqa.selenium.By;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;

@Listeners(TH_23_10.ListenerTest.class)
public class Exercise1 extends Astractclass {

	public static void main(String[] args) {		
										
		
		String expectedTitle = "Welcome: Mercury Tours";
		String actualTitle = "";		
		actualTitle = driver.getTitle();
		
		if (actualTitle.contentEquals(expectedTitle)) {
			System.out.println("Test Passed!");
		} else {
			System.out.println("Test Failed");
		}
				
		//driver.close();
	}
	@Test(priority = 1)
	public static void verifyTitleRegister() {
		driver.findElement(By.linkText("REGISTER")).click();
		String expectedTitle = "Register: Mercury Tours";
		String actualTitle = "";		
		actualTitle = driver.getTitle();
		
		if (actualTitle.contentEquals(expectedTitle)) {
			System.out.println("Test Passed!");
		} else {
			System.out.println("Test Failed");
		}
	}
	@Test(priority = 2)
	public static void verifyTitleBackhome() {
		driver.findElement(By.linkText("Home")).click();
		String expectedTitle = "Welcome: Mercury Tours";
		String actualTitle = "";		
		actualTitle = driver.getTitle();
		
		if (actualTitle.contentEquals(expectedTitle)) {
			System.out.println("Test Passed!");
		} else {
			System.out.println("Test Failed");
		}
		
	}
	@Test(priority = 3)
	public static void verifyTitleSupport() {
		driver.findElement(By.linkText("SUPPORT")).click();
		String expectedTitle = "Under Construction: Mercury Tours";
		String actualTitle = "";		
		actualTitle = driver.getTitle();
		
		if (actualTitle.contentEquals(expectedTitle)) {
			System.out.println("Test Passed!");
		} else {
			System.out.println("Test Failed");
		}
	}
	@Test(priority = 4)
	public static void verifyTitleBackhome1() {
		driver.findElement(By.linkText("Home")).click();
		String expectedTitle = "Welcome: Mercury Tours";
		String actualTitle = "";		
		actualTitle = driver.getTitle();
		
		if (actualTitle.contentEquals(expectedTitle)) {
			System.out.println("Test Passed!");
		} else {
			System.out.println("Test Failed");
		}
		
	}
			

}
