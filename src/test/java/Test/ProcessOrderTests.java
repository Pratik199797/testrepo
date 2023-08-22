package Test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import Pages.Codorder;
import Pages.Loginpage;
import Pages.Placeorderpage;
import Pages.ProcessOrderPage;

public class ProcessOrderTests {

	WebDriver driver;
	ProcessOrderTests processorder;
	ProcessOrderPage prp;
	Codorder cod;

	@BeforeSuite
	public void setup() {
		DriverSingleton ds_obj = DriverSingleton.getInstance();
		driver = ds_obj.getDriver();
	}

	@Test
	public void verifyProcessOrderLaunches() throws InterruptedException {
		
		Placeorderpage placeorder_var = new Placeorderpage(driver);
		Loginpage loginpage_obj = new Loginpage(driver);
		placeorder_var.navigatetosellerdash();
		Thread.sleep(3000);
		loginpage_obj.enter_phonenumber("9436582726");
		loginpage_obj.click_sendotp();
		Thread.sleep(3000);
		loginpage_obj.enter_otp("0000");
		loginpage_obj.click_verifyotp();
		Thread.sleep(3000);
		prp = new ProcessOrderPage(driver);
		prp.navigateToProcessOrder();
		
	}

	@AfterSuite
	public void teardown() {
		driver.close();
	}
}
