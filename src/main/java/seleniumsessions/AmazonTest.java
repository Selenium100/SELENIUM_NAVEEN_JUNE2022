package seleniumsessions;

public class AmazonTest {

	public static void main(String[] args) throws Exception {
		String browser = "FireFox";
		BrowserUtill brUtil = new BrowserUtill();
		brUtil.launchBrowser("chrome");
		brUtil.validateUrl("http://www.amazon.com");
		String title = brUtil.getPageTitle();
		if (title.contains("Amazon")) {
			System.out.println("correct title-pass");
		} else {
			System.out.println("incorrect title-fail");
		}
		brUtil.getPageUrl();
		brUtil.closeBrowser();

	}

}
