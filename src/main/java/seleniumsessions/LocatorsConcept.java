package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorsConcept {
	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");

		// 1-id
		// 2-name
//		driver.findElement(By.name("email")).sendKeys("test@gmail.com");
//		driver.findElement(By.name("password")).sendKeys("test@123");
//  	3-ClassNAme-class can be duplicate most of the time for different element 
//		driver.findElement(By.className("form-control")).sendKeys("rinky");
//	    4-Link Test-only for links 
//		hmtltag-<a>
//      <a>---anchor tag		
//		driver.findElement(By.linkText("Login")).click();
//		5----partialLinkTest:only for links
//		risks----forgotten username,forgotten password
//		driver.findElement(By.partialLinkText("Forgotten")).click();
//		6---xpath:adress of webelement on the page (DOM)
//		xpath is not an attribute
//		driver.findElement(By.xpath("//*[@id=\"input-firstname\"]")).sendKeys("rinky");
//		driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input")).click();
//		7-----css selector
//		it is not an attribute
//		driver.findElement(By.cssSelector("#input-lastname")).sendKeys("testing");
//		8----tag  name:not an attribute
//		html tag
//		driver.findElement(By.tagName("input")).sendKeys("testing");
//	String header=	driver.findElement(By.tagName("h1")).getText();
//		System.out.println(header);	
		By header=By.tagName("h1");
		By recPayment=By.linkText("Recurring payments");
		By warnMsg=By.className("alert");
		By continuebtn=By.xpath("//*[@id=\"content\"]/form/div/div/input[2]");
		
		String actHeader=doGetText(header);
		if(actHeader.equals("Register Account")) {
		System.out.println("pass");
		}
		else {
			System.out.println("fail");
		}
		String recPaymentText=doGetText(recPayment);
		System.out.println(recPaymentText);
		
		doClick(continuebtn);
		
		String warnMsgValue=doGetText(warnMsg);
		System.out.println(warnMsgValue);
		
	}	
	public static String doGetText(By locator) {
		return getElemet(locator).getText();
	}
	
	public static void doClick(By locator) {
		getElemet(locator).click();
	}
	
	
	public static WebElement getElemet(By locator) {
		return driver.findElement(locator);
	}
	
	
	
	
	
	
	
	
	
	
	

}
