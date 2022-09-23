package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserUtill {
	private WebDriver driver;

	/**
	 * this method is used to initialize the driver on the basis of browser name
	 * 
	 * @param browser
	 */

	public WebDriver launchBrowser(String browser) {
		System.out.println("browser name is :" + browser);
		switch (browser.toLowerCase()) {
		case "chrome":
//			System.setProperty("webdriver.chrome.driver",
//					"C:\\Users\\nitya\\Downloads\\chromedriver\\chromedriver.exe");
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;

		case "firefox":
//			System.setProperty("webdriver.gecko.driver", "C:\\Users\\nitya\\Downloads\\geckodriver\\geckodriver.exe");
			WebDriverManager.chromedriver().setup();
			driver = new FirefoxDriver();
			break;

		default:
			System.out.println("plz pass ghe right browser.....");
			break;
		}
		return driver;
	}

	public void validateUrl(String url) throws Exception {
		if (url.length() == 0) {
			System.out.println("blank url");
			throw new Exception("urlisblank");
		}
		driver.get(url);
	}

	public String getPageTitle() {
		String title = driver.getTitle();
		System.out.println("page title:" + title);
		if (title != null) {
			return title;
		} else {
			System.out.println("getting null title...");
		}
		return null;
	}

	public String getPageUrl() {
		String url = driver.getCurrentUrl();
		System.out.println("page title:" + url);
		if (url != null) {
			return url;
		} else {
			System.out.println("getting null title...");
			return null;
		}
	}

	public void closeBrowser() {
		if (driver != null) {
			driver.close();
			System.out.println("browser is closed.....");
		}
	}

	public void quitBrowser() {
		if (driver != null) {
			driver.quit();
			System.out.println("browser is closed.....");

//		}
		}

	}
}