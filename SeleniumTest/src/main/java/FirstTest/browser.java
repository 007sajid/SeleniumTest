package FirstTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.Assertion;
import org.testng.asserts.SoftAssert;
public class browser {
	
	
	public void message() {
		System.out.println("Hello");
		
	}
	
	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		newClass b = new newClass();
		browser a = new browser();
		b.message();
		a.message();
		b.chromeProp();  
		  WebDriver driver = new ChromeDriver();
		  
		  
		  driver.manage().window().maximize();

		  // Open Amazon
		  driver.get("https://www.amazon.in/");

		  // Click on Hamburger menu
		  driver.findElement(By.id("nav-hamburger-menu")).click();
		  Thread.sleep(2000);
		  // Click on Television menu
		  driver.findElement(By.xpath("//a[@data-menu-id='9']")).click();
		  Thread.sleep(2000);

		  // Click on Televisions
		  driver.findElement(By.xpath("//a[contains(text(),'Televisions')]")).click();
		  Thread.sleep(6000);
		  
		  // Click on Samsung brand checkbox
		 driver.findElement(By.xpath("//ul/li[2]/span/a/span[contains(text(),'Samsung')]")).click();
		 
		  
		 // driver.findElement(By.xpath("//div[@id='brandsRefinements']")).click();
		  
		  
		  
		  Thread.sleep(6000);
		  driver.findElement(By.className("a-dropdown-container")).click();
		  driver.findElement(By.xpath("//a[contains(text(),'Price: High to Low')]")).click();
		  
		 Thread.sleep(6000);
		  List<WebElement> price=driver.findElements(By.xpath("//span[@class='a-price-whole']"));

		 
		  price.get(1).click();
		 // String winHandleBefore = driver.getWindowHandle();

		// Perform the click operation that opens new window

		// Switch to new window opened
		for(String winHandle : driver.getWindowHandles()){
		    driver.switchTo().window(winHandle);
		}
		  Thread.sleep(4000);
		  System.out.println(driver.getTitle());

		  
		// driver.findElement(By.xpath("//div[contains(text(),'About this item')]"));
		 
		  boolean about= driver.findElement(By.xpath("//h1[contains(text(),'About this item')]")).isDisplayed();
		 
		 Assert.assertEquals(about, true);
		 driver.findElement(By.id("feature-bullets")).getText();
		 
		 
		 System.out.println(driver.findElement(By.id("feature-bullets")).getText());
	//	  driver.findElement(price.get(1)).click() ;
		  System.out.println("found");
		  
		  try {
		  Thread.sleep(5000);
		  } catch (InterruptedException e) {
		  // TODO Auto-generated catch block
		  e.printStackTrace();
		  }

		  // Close Test
		  driver.close();
		 }

}
