package demo;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Example3 {
	public static String browser = "chrome";
	public static WebDriver driver;
	public static String URL = "https://letcode.in/buttons";
	@Test
	public void main() throws IOException {

		if (browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browser.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else if (browser.equals("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		driver.manage().window().maximize();
		driver.get(URL);
		
		//find the Height and Width of the button
	      Rectangle rect = driver.findElement(By.id("property")).getRect();
		  Dimension dime = rect.getDimension();
		  System.out.println(dime);
		  System.out.println(dime.getWidth());
		  System.out.println(dime.getHeight());
		  
		  //or
		  Rectangle rect1 = driver.findElement(By.id("property")).getRect();
		  System.out.println(rect1.getWidth());
		  System.out.println(rect1.getHeight());
		  System.out.println(rect1.getPoint());
		  
		  
		  
	}
}
