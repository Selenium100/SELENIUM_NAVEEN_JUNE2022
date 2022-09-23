package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebElementClick {
	static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://app.hubspot.com/login");
//		driver.findElement(By.id("username")).sendKeys("rinky@gmailcom");
//		driver.findElement(By.id("password")).sendKeys("rinky@123");

//		driver.findElement(By.id("loginBtn")).click();
		By username=By.id("username");
		By pwd=By.id("password");
		By loginBtn=By.id("loginBtn");
		
	doSendkeys(username," rinky@gmailcom");	
	doSendkeys(pwd," rinky@123");	
	doClick(loginBtn);	
	}
public static WebElement getElement(By locator) {
	return driver.findElement(locator);
}
public static void doSendkeys(By locator,String value) {
	getElement(locator).sendKeys(value);
}
public static void doClick(By locator) {
	getElement(locator).click();
}
}
