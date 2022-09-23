package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultiElementConcept {

	public static void main(String[] args) {
WebDriverManager.chromedriver().setup();
WebDriver driver= new ChromeDriver();
driver.get("https://www.amazon.com");
List<WebElement> linksList = driver.findElements(By.tagName("a"));
	System.out.println("total links:" +linksList.size());	
//		for(int i=0;i<linksList.size();i++) {
//	String text=linksList.get(i).getText();
//	//System.out.println(text);
//	
//	if(text.length()!=0) {
//	System.out.println(text);	
//	}
//	
//		}
		
	for(WebElement e :linksList) {
	String text=e.getText();
	if(text.length()!=0) {
		System.out.println(text);	
	}
	String hrefval=e.getAttribute("href");
		System.out.println(hrefval);
	
	
	
	
	}
		
	}

}
