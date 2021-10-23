package TH_23_10;


import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

@Listeners(TH_23_10.ListenerTest.class)
public class Exercise2 extends Astractclass {
			
	@Test(priority = 1)
	public void verifyRegister() {
	    WebElement rg = driver.findElement(By.xpath("//*[@style= 'margin-left:20px;']/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[2]/a"));
	    rg.click();

	    List<WebElement> childElements = driver.findElements(By.xpath("//*[@style='font-family:Arial, Helvetica;font-size:13px;color:#000;padding:5px;']/input"));
	    for(int i = 0; i<childElements.size(); i++) {
	    	childElements.get(0).sendKeys("Thu");
	        childElements.get(1).sendKeys("Nguyen");
	        childElements.get(2).sendKeys("038927478");
	        childElements.get(3).sendKeys("xuanthu800@gmail.com");
	        childElements.get(4).sendKeys("Ngo Quyen");
	        childElements.get(5).sendKeys("Dong Nai");
	        childElements.get(6).sendKeys("Long Khanh");
	        childElements.get(7).sendKeys("375");
	        childElements.get(8).sendKeys("xuanthu1");
	        childElements.get(9).sendKeys("xuanthu12");
	        childElements.get(10).sendKeys("xuanthu12");
	        break;
	    }

	    WebElement submit = driver.findElement(By.xpath("//*[@name='submit']"));
	    submit.click();
	    System.out.println("Create Successful!");
	    }
	@Test(priority = 2)
	public void verifyLogin() {
		WebElement lg = driver.findElement(By.xpath("//*[@face='Arial, Helvetica, sans-serif']/a"));
        lg.click();
        List<WebElement> childElements1 = driver.findElements(By.xpath("//*[@style='font-family:Arial, Helvetica;font-size:13px;color:#000;padding:5px;']/input"));
        for(int i = 0; i<childElements1.size(); i++) {
            childElements1.get(0).sendKeys("xuanthu1");
            childElements1.get(1).sendKeys("xuanthu12");
            break;
        }

        WebElement submit = driver.findElement(By.xpath("//*[@name='submit']"));
        submit.click();
	}

}
