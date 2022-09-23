package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuitVsCloseSessionId {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nitya\\Downloads\\chromedriver\\chromedriver.exe");	
		   WebDriver driver= new ChromeDriver();
		   driver.get("https://www.google.com");
		   String title=driver.getTitle();
		   System.out.println("page title:" +title );
//		  driver.quit();
		   driver.close();
//		  System.out.println(driver.getTitle());
//	solving this problem
		   driver= new ChromeDriver();
		   driver.get("https://www.google.com");
		   System.out.println( driver.getTitle());	  	  
		  
	}

}
