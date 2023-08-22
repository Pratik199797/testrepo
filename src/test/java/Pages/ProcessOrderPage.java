package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProcessOrderPage {
	WebDriver driver;

	Actions act;

	String url = "http://v2.nushop-dashboard.kaip.in/";

	@FindBy(xpath = "//div[normalize-space()='Process Orders']")
	WebElement processOrder;

	@FindBy(xpath = "//nav//div[3]")
	WebElement side_bar;

	public ProcessOrderPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void navigateToProcessOrder() {
		
		try {
			driver.get(url);
			act = new Actions(driver);
			act.moveToElement(side_bar).click().perform();
			Thread.sleep(3000);
			processOrder.click();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

	public void hoverProcessOrder() {

	}

	public void clickProcessOrder() throws InterruptedException {
		Thread.sleep(3000);
		processOrder.click();

	}
	
	
}
