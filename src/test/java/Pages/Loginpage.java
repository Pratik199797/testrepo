package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {

	WebDriver driver;

	@FindBy(xpath = "//div[@class = 'Input_input-group__c6y0f undefined rs-input-group']/input")
	WebElement input_phonenumber;

	@FindBy(xpath = "//button[text() = 'Generate OTP']")
	WebElement otp_button;

	@FindBy(xpath = "//div[@class = 'Input_input-group__c6y0f undefined rs-input-group']/input")
	WebElement input_otp;

	@FindBy(xpath = "//button[text() = 'Verify OTP']")
	WebElement verify_otpbutton;

	public Loginpage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void enter_phonenumber(String phonenumber) {

		try {
			input_phonenumber.sendKeys(phonenumber);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void enter_otp(String otp) {
		try {
			input_otp.sendKeys(otp);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void click_sendotp() {
		try {
			otp_button.click();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void click_verifyotp() {
		try {
			Thread.sleep(3000);
			verify_otpbutton.click();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
