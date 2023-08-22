package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Ndrpage {
	@FindBy(xpath = "//div[normalize-space()='NDR']")
	WebElement ndrElement;

	@FindBy(xpath = "//nav//div[3]")
	WebElement side_bar;

	@FindBy(xpath = "//span[normalize-space()='Re-Attempt Requested (12)']")
	WebElement reattemptRequest;

	@FindBy(xpath = "//span[normalize-space()='Delivered']")
	WebElement delivered;

	@FindBy(xpath = "//span[normalize-space()='RTO Requested']")
	WebElement rtoRequested;

	@FindBy(xpath = "//button[normalize-space()='More Filters']")
	WebElement morefilters;

	@FindBy(xpath = "//span[normalize-space()='Take Action (56)']")
	WebElement takeAction;

	@FindBy(xpath = "//span[@class='Info_cursor-pointer__-pHVs']//span")
	WebElement infoText;

	@FindBy(xpath = "//body/div[@id='root']/section/section/div/div/div/div[@role='gridcell']/button[1]")
	WebElement downloadCta;

	@FindBy(xpath = "//a[normalize-space()='Details']")
	WebElement details;

	@FindBy(xpath = "//input[@placeholder='Search']")
	WebElement searchBox;

	WebDriver driver;

	Actions act;

	String url = "http://v2.nushop-dashboard.kaip.in/";

	public Ndrpage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void navigateToNdr() {
		driver.get(url);
	}

	public void hoverNdr() {

		try {

			act = new Actions(driver);
			act.moveToElement(side_bar).click().perform();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	public void clickNdr() throws InterruptedException {
		Thread.sleep(3000);
		ndrElement.click();
	}

	public void clickReattemptrequest() throws InterruptedException {
		Thread.sleep(3000);
		reattemptRequest.click();
	}

	public void clickOnDelivered() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		delivered.click();
	}

	public void clickOnRtoRequested() {
		try {
			Thread.sleep(3000);
			rtoRequested.click();
		} catch (Exception e) {
			e.getMessage();
		}
	}

	public void clickOnMorefilters() {
		try {
			Thread.sleep(3000);
			morefilters.click();
		} catch (Exception e) {
			e.getMessage();
		}
	}

	public void clickTakeAction() throws InterruptedException {
		Thread.sleep(3000);
		takeAction.click();
	}

	public void clickInfoText() throws InterruptedException {
		Thread.sleep(3000);
		infoText.click();
	}

	public void clickDownload() throws InterruptedException {
		Thread.sleep(3000);
		downloadCta.click();
	}

	public void clickDetails() throws InterruptedException {
		Thread.sleep(3000);
		details.click();
	}

	public void searchSomething() throws InterruptedException {
		Thread.sleep(3000);
		searchBox.sendKeys("random text");
		searchBox.clear();
	}
}
