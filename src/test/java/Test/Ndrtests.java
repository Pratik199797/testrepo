package Test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import Pages.Loginpage;
import Pages.Ndrpage;
import Pages.Placeorderpage;

public class Ndrtests {
	WebDriver driver;

	Ndrpage ndr;

	@BeforeSuite
	public void setup() {
		DriverSingleton ds_obj = DriverSingleton.getInstance();
		driver = ds_obj.getDriver();
	}

	@Test(priority = 0)
	public void verifyNdrPageOpens() throws InterruptedException {
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
		ndr = new Ndrpage(driver);
		ndr.navigateToNdr();
		Thread.sleep(3000);
		ndr.hoverNdr();
		Thread.sleep(3000);
		ndr.clickNdr();
		Thread.sleep(3000);

	}

	@Test(dependsOnMethods = { "verifyNdrPageOpens" })
	public void verifyReattemptRequestisClickable() throws InterruptedException {
		ndr.clickReattemptrequest();
	}

	@Test
	public void verifyDeliveredisClickable() throws InterruptedException {
		ndr.clickOnDelivered();
	}

	@Test
	public void verifyRtoRequestedisClickable() {
		ndr.clickOnRtoRequested();
	}

	@Test
	public void verifyMoreFiltersClickable() {
		ndr.clickOnMorefilters();
	}

	@Test
	public void verifyTakeactionisClickable() throws InterruptedException {
		ndr.clickTakeAction();
	}

	@Test
	public void verifyInfoText() throws InterruptedException {
		ndr.clickInfoText();
	}

	@Test(dependsOnMethods = { "verifyRtoRequestedisClickable" })
	public void verifyDownloadbuttonisClickable() throws InterruptedException {
		ndr.clickDownload();
	}

	@Test
	public void clickDetails() throws InterruptedException {
		ndr.clickDetails();
	}

	@Test
	public void verifySearchUsingOrderid() throws InterruptedException {
		ndr.searchSomething();
	}

	@Test
	public void verifySearchUsingAwb() throws InterruptedException {
		ndr.searchSomething();
	}

	@Test
	public void verifySearchUsingCustomernumber() throws InterruptedException {
		ndr.searchSomething();
	}

	@AfterSuite
	public void teardown() {
		driver.close();
	}
}
