package User;

import org.testng.annotations.Test;

import common.AbstractTest;
import pageObjects.LoginPO;
import pageObjects.PageGeneratorManager;
import pageObjects.RegisterPO;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import java.io.File;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class Level_01_Register_Login extends AbstractTest{
	
	WebDriver driver;
	String fullName, preferredName, email,referralCode, mobileNumber, otp;

	@Parameters({"browser","url"})
	@BeforeClass
	public void beforeClass(String browser,String url) {
		driver = getBrowserDriver(browser,url);
		loginPage = PageGeneratorManager.getLoginPage(driver);
		
		fullName = "fullname"+getRandomNumber();
		preferredName = "preferredname"+getRandomNumber();
		email = "user"+getRandomNumber()+"@hotmail.com";
		referralCode = "abcd";
		mobileNumber = getRandomNumber()+""+getRandomNumber()+"";

		otp = "1234";
		
	}
	LoginPO loginPage; 
	RegisterPO registerPage;

	@Test
	public void TC_01_Register_Aspire_Email() {
		registerPage = loginPage.clickToRegisterLink();
		registerPage.inputToFullNameTextbox(fullName);
		registerPage.inputToPreferredName(preferredName);
		registerPage.inputToEmailTextbox(email);
		registerPage.inputToMobileTextbox(mobileNumber);
		registerPage.clickToSearchTextbox();
		registerPage.clickToFacebookOption();
		registerPage.clickToAgreeCheckbox();
		registerPage.clickToContinueButton();
		
		registerPage.inputToOTPTextbox1("1234");
		registerPage.clickToContinueButton1();
		
		registerPage.clickToEntrepreneurTex();


	}
	public int getRandomNumber()
	{
		Random random = new Random();
		return random.nextInt(9999);
	}


	@AfterClass
	public void afterClass() {
	}

}
