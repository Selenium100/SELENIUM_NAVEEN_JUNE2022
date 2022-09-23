package seleniumsessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TotalNumImages {
	static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.amazon.com");
//		List<WebElement> imagesList = driver.findElements(By.tagName("img"));
//		
//		System.out.println("total images:"   +imagesList.size());
//		for (WebElement e:imagesList) {
//
//			String  srcval=e.getAttribute("src");
//			String altval=e.getAttribute("alt");
//			System.out.println(srcval + ":" +altval );
//		}
		By images = By.tagName("img");
		By links = By.tagName("a");
		int totalLinks = getElementsCount(links);
		System.out.println(totalLinks);
		if (totalLinks > 200) {
			System.out.println("pass");
		}
		int totalImages = getElementsCount(images);
		System.out.println(totalImages);
		 ArrayList<String> linksTextList=getERlementsTextList(links);
		System.out.println(linksTextList);
	}

	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}

	public static int getElementsCount(By locator) {
		return getElements(locator).size();
	}
	
	public static ArrayList<String> getERlementsTextList(By locator) {
		List<WebElement> eleList=getElements(locator);
		ArrayList<String>eleTextList=new ArrayList<String>();
		for(WebElement e: eleList) {
			String text=e.getText();
			if(text.length()!=0) {
			}
			eleTextList.add(text);
		}
		return eleTextList;
	}

	
	


}
