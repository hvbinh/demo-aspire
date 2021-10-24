package pageObjects;

import org.openqa.selenium.WebDriver;

public class PageGeneratorManager {
	public static LoginPO getLoginPage(WebDriver driver)
	{
		return new LoginPO(driver);
	}
	public static RegisterPO getRegisterPage(WebDriver driver)
	{
		return new RegisterPO(driver);
	}


}
