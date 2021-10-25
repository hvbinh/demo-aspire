package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import common.AbstractPage;
import pageUI.RegisterPageUI;

public class RegisterPO extends AbstractPage{
	WebDriver driver;
	
	public RegisterPO(WebDriver driver) {
		this.driver = driver;
	}

	public void inputToFullNameTextbox(String fullName) {
		waitToElementVisible(driver, RegisterPageUI.FULLNAME_TEXTBOX);
		sendkeyToElement(driver, RegisterPageUI.FULLNAME_TEXTBOX, fullName);
	}

	public void inputToPreferredName(String preferredName) {
		waitToElementVisible(driver, RegisterPageUI.PREFERRED_NAME_TEXTBOX);
		sendkeyToElement(driver, RegisterPageUI.PREFERRED_NAME_TEXTBOX, preferredName);
	}

	public void inputToEmailTextbox(String email) {
		waitToElementVisible(driver, RegisterPageUI.EMAIL_TEXTBOX);
		sendkeyToElement(driver, RegisterPageUI.EMAIL_TEXTBOX, email);
		
	}

	public void inputToMobileTextbox(String mobileNumber) {
		waitToElementVisible(driver, RegisterPageUI.PHONE_TEXTBOX);
		sendkeyToElement(driver, RegisterPageUI.PHONE_TEXTBOX, mobileNumber);
		
	}

	public void clickToSearchTextbox() {
		waitToElementClickable(driver, RegisterPageUI.SEARCH_TEXTBOX);
		clickToElement(driver, RegisterPageUI.SEARCH_TEXTBOX);
	}

	public void clickToFacebookOption() {
		waitToElementClickable(driver, RegisterPageUI.FACEBOOK_SEARCH_OPTION);
		clickToElement(driver, RegisterPageUI.FACEBOOK_SEARCH_OPTION);
		
	}

	public void clickToAgreeCheckbox() {
		waitToElementClickable(driver, RegisterPageUI.AGREE_TEXT);
		clickToElement(driver, RegisterPageUI.AGREE_TEXT);
		
	}

	public void clickToContinueButton() {
		waitToElementClickable(driver, RegisterPageUI.CONTINUE_BUTTON);
		clickToElement(driver, RegisterPageUI.CONTINUE_BUTTON);
		
	}

	public void inputToOTPTextbox1(String otp) {

//		waitToElementVisible(driver, RegisterPageUI.OTP_TEXTBOX_1);
//		setInnerText(driver, RegisterPageUI.OTP_TEXTBOX_1, otp);
		inputOtp(driver,RegisterPageUI.OTP_TEXTBOX, otp);


	}
	public void inputToOTPTextbox2(String otp) {

		waitToElementVisible(driver, RegisterPageUI.OTP_TEXTBOX_2);
		setInnerText(driver, RegisterPageUI.OTP_TEXTBOX_2, otp);

	}
	public void inputToOTPTextbox3(String otp) {

		waitToElementVisible(driver, RegisterPageUI.OTP_TEXTBOX_3);
		setInnerText(driver, RegisterPageUI.OTP_TEXTBOX_3, otp);

	}
	public void inputToOTPTextbox4(String otp) {

		waitToElementVisible(driver, RegisterPageUI.OTP_TEXTBOX_4);
		setInnerText(driver, RegisterPageUI.OTP_TEXTBOX_4, otp);

	}

	public void clickToEntrepreneurTex() {
		waitToElementVisible(driver, RegisterPageUI.ENTREPRENEUR_TEXT);
		clickToElement(driver, RegisterPageUI.ENTREPRENEUR_TEXT);
		
	}

	public void clickToContinueButton1() {
		waitToElementVisible(driver, RegisterPageUI.CONTINUE1_BUTTON);
		clickToElement(driver, RegisterPageUI.CONTINUE1_BUTTON);
		
	}
}
