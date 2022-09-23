package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebElementHandling {
	static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
//		no1
//		-----
//		driver.findElement(By.id("input-email")).sendKeys("test@gmailcom");
//		driver.findElement(By.id("input-password")).sendKeys("test@123");
//		no2
//		-----
		/*
		 * WebElement emailid =driver.findElement(By.id("input-email")); WebElement
		 * password =driver.findElement(By.id("input-password"));
		 * emailid.sendKeys("test@gmailcom"); password.sendKeys("test@123");
		 */
//		no3-by locator
//		-----
		/*
		 * By email=By.id("input-email"); By password=By.id("input-password");
		 * WebElement emailid=driver.findElement(By.id("input-email")); WebElement
		 * pwd=driver.findElement(By.id("input-password"));
		 * emailid.sendKeys("test@gmailcom"); pwd.sendKeys("test@123");
		 */
//		no4-by locator+generic function
//		-----
		/*
		 * By email=By.id("input-email"); By password=By.id("input-password");
		 * getElemet(email).sendKeys("test@gmail.com");
		 * getElemet(password).sendKeys("test@123");
		 */
//		no5-by locator=getElement+actions generic function
//		--------
		/*
		 * By email=By.id("input-email"); By password=By.id("input-password");
		 * doSendkeys(email, "test@gmail.com"); doSendkeys(password, "test@123");
		 */
//		no6=by locator+ElementUtil---->generic functions
//		-------
		By email = By.id("input-email");
		By password = By.id("input-password");
		By loginBtn=By.xpath("//*[@id=\\\"content\\\"]/div/div[2]/div/form/input");
		
		ElementUtil eleutil = new ElementUtil(driver);
		eleutil.doSendkeys(email, "test@gmail.com");
		eleutil.doSendkeys(password, "test@123");
		eleutil.doClick(loginBtn);
//		driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input")).click();

//		no7-locator+brutil+eleutil
//		--------

	}

	public static void doSendkeys(By locator, String value) {
		getElemet(locator).sendKeys(value);
	}

	public static WebElement getElemet(By locator) {
		return driver.findElement(locator);
	}

	public static void doClick(By locator) {
		getElemet(locator).click();
	}
}