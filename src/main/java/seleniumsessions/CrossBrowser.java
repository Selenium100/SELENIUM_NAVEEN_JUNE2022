package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CrossBrowser {
	
	static WebDriver driver;
	public static void main(String[] args) {
		
//System.setProperty("webdriver.chrome.driver", "C:\\Users\\nitya\\Downloads\\chromedriver\\chromedriver.exe");
// WebDriver driver= new ChromeDriver();
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nitya\\Downloads\\chromedriver\\chromedriver.exe");
//WebDriver driver=new FirefoxDriver();
 String browser = "Chrome";
	
	switch (browser.toLowerCase()) {
	case "chrome":
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nitya\\Downloads\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		break;

	case "firefox":
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\nitya\\Downloads\\geckodriver\\geckodriver.exe");
		driver = new FirefoxDriver();
		break;
		
	default:
		System.out.println("plz pass ghe right browser.....");
		break;
	}
 
 
 
 
 
 
 
 
 
 
 
 
		
		   driver.get("https://www.google.com");
		   String title=driver.getTitle();
		   System.out.println("page title:" +title );
		  
		   String url=driver.getCurrentUrl();
		   System.out.println(url);
		//   System.out.println(source); 
		   driver.quit();

		   } 
	}


