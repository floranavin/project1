package jsExecutor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Test1 {
	 @Test
		public void tc1() {
			WebDriverManager.chromedriver().setup();
		    WebDriver driver = new ChromeDriver();
		    driver.manage().window().maximize();
			driver.get("https://www.amazon.com/");
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			WebElement ele = driver.findElement(By.xpath("//img[@alt='Laptops & Tablets shoppen']"));
			
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView(true);",ele);
			
			js.executeScript("arguments[0].click();",ele);
			
		    System.out.println(js.executeScript("return document.title"));
		    
		    System.out.println(js.executeScript("return document.URL"));
		    
		    js.executeScript("history.go(0)");
		    
		}

}
