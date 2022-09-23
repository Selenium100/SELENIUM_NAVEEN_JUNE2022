package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookLogin {

	static WebDriver driver;
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://facebook.com");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("nitya@gmail.com");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("wdcsw");
		driver.findElement(By.xpath("//button[@name='login']")).click();
		

	}

}
