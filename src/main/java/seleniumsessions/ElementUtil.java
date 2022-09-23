package seleniumsessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElementUtil {
	private WebDriver driver;
	public ElementUtil(WebDriver driver) {
		this.driver=driver;
	}
	public void doSendkeys(By locator,String value) {
		getElemet(locator).sendKeys(value);	
	}
		
	
public WebElement getElemet(By locator) {
	return driver.findElement(locator);
}
public void doClick(By locator) {
	getElemet(locator).click();
}
public  String DogetText(By locator) {
	return getElemet(locator).getText();
}
public ArrayList<String> getERlementsTextList(By locator) {
	TotalNumImages.getElements(locator);
	List<WebElement>eleList=getElements(locator);
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
