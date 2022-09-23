package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPageTest {

	
	public static void main(String[] args) throws Exception  {
		BrowserUtill brutil = new BrowserUtill();
		WebDriver driver= brutil.launchBrowser("chrome");
		brutil.validateUrl("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		System.out.println(brutil.getPageTitle());
		System.out.println(brutil.getPageUrl());
		By email=By.id("input-email");
		By password=By.id("input-password");
		ElementUtil eleutil=new ElementUtil(driver);
		eleutil.doSendkeys(email, "test@gmail.com");
		eleutil.doSendkeys(password, "test@123");
		brutil.quitBrowser();
		
	}

}
