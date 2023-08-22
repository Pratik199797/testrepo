package Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Codorder {

	WebDriver driver;
	JavascriptExecutor js_var;
	WebDriverWait wait_var;

	String url = "http://fifth.nushop.kaip.in/";

	@FindBy(xpath = "//body//div[@id='root']//div[@id='main']//div//div//div//div[1]//a[1]")
	WebElement product;

	@FindBy(xpath = "//div[contains(text(),'Buy Now')]")
	WebElement buynow_button;

	@FindBy(xpath = "//input[@type='tel']")
	WebElement phonenumber_field;

	@FindBy(xpath = "//div[contains(text(),'Save & Continue')]")
	WebElement saveandcontinue_button;

	@FindBy(xpath = "//button[@type='submit']")
	WebElement confirmnumber_button;

	@FindBy(id = "cod")
	WebElement cod_radiobutton;

	@FindBy(xpath = "//div[@id='root']//div//div//div//section//div//div//div//div//div//div//button")
	WebElement placeorder_button;

	@FindBy(xpath = "//input[@name='name']")
	WebElement name_field;

	@FindBy(xpath = "//input[@name='zip']")
	WebElement pincode_field;

	@FindBy(xpath = "//body//div[@id='root']//div//div//div[3]//div[1]//div[1]//input[1]")
	WebElement housenumber_field;

	@FindBy(xpath = "//input[@name='address-one']")
	WebElement adress_field;

	@FindBy(xpath = "(//input[@placeholder='-'])[1]")
	WebElement otpfield_1;

	@FindBy(xpath = "(//input[@placeholder='-'])[2]")
	WebElement otpfield_2;

	@FindBy(xpath = "(//input[@placeholder='-'])[3]")
	WebElement otpfield_3;

	@FindBy(xpath = "(//input[@placeholder='-'])[4]")
	WebElement otpfield_4;

	@FindBy(xpath = "//div[@id='root']//div//div//form//div//div//button")
	WebElement confirmotp_button;

	@FindBy(xpath = "//body/div[@id='root']/div/section/div/div/div[1]/div[1]")
	WebElement order_placed;

	@FindBy(xpath = "//body//div//div[@align='center']//div//div//div[1]//button[1]")
	WebElement iwanttoordermore_button;

	public Codorder(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void multiple_cod_orders() throws InterruptedException {

		try {
			for (int i = 0; i < 100; i++) {
				driver.get(url);
				Thread.sleep(3000);
				product.click();
				Thread.sleep(3000);
				js_var = (JavascriptExecutor) driver;
				js_var.executeScript("window.scrollBy(0,7000)");
				Thread.sleep(3000);
				buynow_button.click();
				Thread.sleep(3000);
				phonenumber_field.clear();
				phonenumber_field.sendKeys("8939117490");
				confirmnumber_button.click();
				Thread.sleep(3000);
				name_field.clear();
				name_field.sendKeys("Pratik Bhowmik");
				pincode_field.clear();
				pincode_field.sendKeys("799006");
				housenumber_field.clear();
				housenumber_field.sendKeys("100");
				adress_field.clear();
				adress_field.sendKeys("test adress long adress much long");
				saveandcontinue_button.click();
				Thread.sleep(3000);
				placeorder_button.click();
				Thread.sleep(3000);
				otpfield_1.sendKeys("0");
				otpfield_2.sendKeys("0");
				otpfield_3.sendKeys("0");
				otpfield_4.sendKeys("0");
				confirmotp_button.click();
				Thread.sleep(3000);
				driver.manage().deleteAllCookies();
				driver.navigate().refresh();
			}
		} catch (Exception e) {
			System.out.println("Error is placing cod order " + e.getMessage());
		}
	}

	public void singleCodorder() throws InterruptedException {
		driver.get(url);
		js_var = (JavascriptExecutor) driver;
		js_var.executeScript("window.scrollBy(0,900)");
		Thread.sleep(3000);
		product.click();
		Thread.sleep(3000);
		buynow_button.click();
		Thread.sleep(3000);
		phonenumber_field.clear();
		phonenumber_field.sendKeys("8939117490");
		confirmnumber_button.click();
		Thread.sleep(3000);
		name_field.clear();
		name_field.sendKeys("Pratik Bhowmik");
		pincode_field.clear();
		pincode_field.sendKeys("799006");
		housenumber_field.clear();
		housenumber_field.sendKeys("100");
		adress_field.clear();
		adress_field.sendKeys("test adress long adress much long");
		saveandcontinue_button.click();
		Thread.sleep(3000);
		placeorder_button.click();
		Thread.sleep(3000);
		otpfield_1.sendKeys("0");
		otpfield_2.sendKeys("0");
		otpfield_3.sendKeys("0");
		otpfield_4.sendKeys("0");
		confirmotp_button.click();
	}

	public boolean isorder_placed() {
		if (order_placed.isDisplayed()) {
			return true;
		}
		return false;
	}

}
