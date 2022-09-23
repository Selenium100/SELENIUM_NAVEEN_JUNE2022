package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBasics {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\nitya\\Downloads\\chromedriver\\chromedriver.exe");	
   WebDriver driver= new ChromeDriver();
   driver.get("https://www.google.com");
   String title=driver.getTitle();
   System.out.println("page title:" +title );
   if(title.equals("Google")) {
   System.out.println("pass");
   
	}
   else {
	   System.out.println("fail");
   }
   String url=driver.getCurrentUrl();
   System.out.println(url);
   String source=driver.getPageSource();
//   System.out.println(source); 
   if(source.contains(" Copyright The Closure Library Authors.")) {
	   System.out.println("pass");
   }
   else {
	   System.out.println("fail");
   } 
   driver.quit();
}
}