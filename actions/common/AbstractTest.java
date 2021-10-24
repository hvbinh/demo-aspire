package common;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AbstractTest {
	private WebDriver driver;
	private String projectFolder = System.getProperty("user.dir");

	protected WebDriver getBrowserDriver(String browserName, String url) {
		Browser browser = Browser.valueOf(browserName.toUpperCase());
		if (browser == Browser.CHROME_UI) {
			System.setProperty("webdriver.chrome.driver", projectFolder + File.separator + "browserDriver" + File.separator + "chromedriver.exe");
			driver = new ChromeDriver();
		} 
		else {
			throw new RuntimeException("please input valid browser name");
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(GlobalConstants.SHORT_TIME, TimeUnit.SECONDS);
		driver.get(url);
		return driver;
	}

	public WebDriver getDriver() {
		return driver;
	}

}
