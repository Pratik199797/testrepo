package Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Placeorderpage {
	WebDriver driver;

    @FindBy(xpath = "//nav//div[3]")
    WebElement side_bar;

    @FindBy(xpath = "//div[text() = 'Place Order']")
    WebElement placeorder;

    @FindBy(xpath = "//input[@placeholder = '00000-00000']")
    WebElement custno;

    @FindBy(xpath = "//input[@fdprocessedid = 'xcylaa']")
    WebElement custname;

    @FindBy(xpath = "//span[text() = 'COD']")
    WebElement cod;

    @FindBy(xpath = "//input[@fdprocessedid = 'ou32re']")
    WebElement pincode;

    @FindBy(xpath = "//input[@fdprocessid = 'kv5jpth']")
    WebElement housenumber;

    @FindBy(xpath = "//input[@fdprocessid = 'wtx7l']")
    WebElement adress;

    @FindBy(xpath = "//button[2]")
    WebElement next_button_one;

    @FindBy(xpath = "//body//div[@id='root']//div//div//div[2]//section[1]//div[1]//div[2]//button[1]")
    WebElement button;

    @FindBy(xpath = "//div[7]//div[1]//button[2]")
    WebElement next_button_two;

    @FindBy(xpath = "//div[@role='gridcell']//section//div//button[@type='button']")
    WebElement next_button_three;

    @FindBy(xpath = "//button[text() = 'Place order']")
    WebElement placeorder_button;

    @FindBy(xpath = "//h2[normalize-space()='Order placed successfully!']")
    WebElement testcasepass_element;

    @FindBy(xpath = "//span[normalize-space()='Place New Order']")
    WebElement text;

    @FindBy(xpath = "//span[normalize-space()='Bulk Order']")
    WebElement bulkordertext;

    @FindBy (xpath = "//p[normalize-space()='Please enter 6 digit pincode']")
    WebElement errormessage;

    Actions act_obj;

    JavascriptExecutor js;

    String url = "http://v2.nushop-dashboard.kaip.in";

    public Placeorderpage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void navigatetosellerdash() {
        driver.get(this.url);
        System.out.println("Getting into seller dashboard...");
    }

    public void hoverto_order() {

        try {
            System.out.println("Locating place order...");
            act_obj = new Actions(driver);
            act_obj.moveToElement(side_bar).click().perform();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public void clickplaceorder() {

        try {
            System.out.println("Clicking on place order...");
            placeorder.click();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public void filltheform() {
        try {
            custno.sendKeys("8939117490");
            Thread.sleep(3000);
            next_button_one.click();
            System.out.println("Entered customer details...");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void selectproduct() {
        try {
            button.click();
            Thread.sleep(3000);
            next_button_two.click();
            Thread.sleep(3000);
            next_button_three.click();
            Thread.sleep(3000);
            placeorder_button.click();
            System.out.println("Product selected...");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public boolean checkIftextdisplayed() {
        if (text.getText().equals("Place New Order")) {
            System.out.println(text.getText());
            return true;
        } else {
            return false;
        }
    }

    public boolean checkifbulkordertextisdisplayed() throws InterruptedException {
        if (bulkordertext.getText().equals("Bulk Order")) {
            System.out.println(bulkordertext.getText());
            return true;
        } else {
            return false;
        }
    }

    public boolean errormessage() {
        next_button_one.click();
        if (errormessage.isDisplayed()) {
            return true;
        } else {
            return false;
        }
    }
}
