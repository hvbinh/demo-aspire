package pageObjects;

import org.openqa.selenium.WebDriver;

import common.AbstractPage;
import pageUI.LoginPageUI;

public class LoginPO extends AbstractPage{
	WebDriver driver;
	
	
	public LoginPO(WebDriver driver) {
		this.driver = driver;
	}


	public RegisterPO clickToRegisterLink() {
		waitToElementClickable(driver, LoginPageUI.REGISTER_LINK);
		clickToElement(driver, LoginPageUI.REGISTER_LINK);
		return PageGeneratorManager.getRegisterPage(driver);
	}

}
