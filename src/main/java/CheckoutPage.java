import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

import static org.junit.Assert.assertEquals;

public class CheckoutPage extends BasePage {

    private WebDriverWait wait;
    public CheckoutPage(WebDriver driver) {
        super(driver);
            wait = new WebDriverWait(driver, 30);
    }

    @FindBy(xpath = "//a[text()='Food']")
    private WebElement foodMenu;
    @FindBy(css = ".product-info button")
    private WebElement addToCart;
    @FindBy(id = "city")
    private WebElement cityCart;
    @FindBy(id = "postcode")
    private WebElement postCode;
    @FindBy(id = "region_id")
    private WebElement regionId;
    @FindBy(css = ".method-checkout-cart-methods-onepage-bottom button")
    private WebElement checkoutButton;

    @FindBy(id = "onepage-guest-register-button")
    private WebElement regButton;

    //    @FindBy(id = "billing:firstname")
//    private WebElement bfirstName;
//    @FindBy(css = "ul:nth-child(2) .name-lastname")
//    private WebElement blastName;
    @FindBy(id = "billing:firstname")
    public WebElement firstName;
    @FindBy(id = "billing:middlename")
    private WebElement middleName;
    @FindBy(id = "billing:lastname")
    public WebElement lastName;
    @FindBy(id = "billing:company")
    private WebElement company;
    @FindBy(id = "billing:email")
    private WebElement email;
    @FindBy(id = "billing:street1")
    public WebElement street1;
    @FindBy(id = "billing:street2")
    private WebElement street2;
    @FindBy(id = "billing:city")
    public  WebElement cityAdress;
    @FindBy(id = "billing:region_id")
    private WebElement bregionId;
    @FindBy(id = "billing:postcode")
    public WebElement postCode1;
    @FindBy(id = "billing:postcode")
    private WebElement postCode2;
    @FindBy(id = "billing:telephone")
    private WebElement bTel;
    @FindBy(id = "billing:telephone")
    private WebElement telPhone;
    @FindBy(css = "#billing-buttons-container span > span")
    public WebElement billButton;
    @FindBy(css = "#shipping-method-buttons-container span > span")
    public WebElement shpMet;
    @FindBy(css = "#payment-buttons-container span > span")
    public WebElement payButton;
    @FindBy(css = ".btn-checkout")
    public WebElement coutButton;

    @FindBy (id="region_id")
    private WebElement cartRegionDropdown;

    @FindBy (id="billing:region_id")
    private WebElement regionDropdown;
    @FindBy(xpath = "//div[@class='page-title']")
    public WebElement pageTitle;
//    @FindBy(id = "review-buttons-container")
//    public WebElement placeOrder;

    @FindBy(id = "advice-required-entry-billing:firstname")
    public WebElement mandatoryFirstName;

    @FindBy(id = "advice-required-entry-billing:lastname")
    public WebElement mandatoryLastName;
    @FindBy(id = "advice-required-entry-billing:street1")
    public WebElement mandatoryStreet1;
    @FindBy(id="advice-required-entry-billing:city")
    public WebElement mandatoryCity;

    @FindBy(id="advice-required-entry-billing:postcode1")
    public WebElement mandatoryPostCode;

    public void getFoodMenu() {
        foodMenu.click();
    }

    public void getAddToCart() {
        addToCart.click();
    }

    public void cityCart() {
        cityCart.sendKeys("alabama city");
    } //    driver.findElement(By.id("city")).sendKeys("alabama");

    public void postCode() {
        postCode.sendKeys("12345");
    }
    //    driver.findElement(By.id("postcode")).sendKeys("12345");

    public void regionId() {
        regionId.click();
    }

    //    driver.findElement(By.id("region_id")).click();
    public void checkoutButton() {
        checkoutButton.click();
    }

    public void regButton() {
        regButton.click();
    }

//    public void bfirstName() {
//        bfirstName.click();
//    }
//
//    public void blastName() {
//        blastName.click();
//    }

    public void firstName() {
        firstName.sendKeys("Test");
    }

    public void middleName() {
        middleName.sendKeys("Test2");
    }

    public void lastName() {
        lastName.sendKeys("Test3");
    }

    public void company() {
        company.sendKeys("Test5");
    }

    public void email() {
        email.sendKeys("asdf@example.com");
    }

    public void street1() {
        street1.sendKeys("adresa mea");
    }

    public void street2() {
        street2.sendKeys("adresa mea 2");
    }

    public void cityAdress() {
        cityAdress.sendKeys("Alabama City");
    }

    public void bregionId() {
        bregionId.click();
    }

    public void postCode1() {
        postCode1.click();
    }//    driver.findElement(By.id("billing:postcode")).click();

    public void postCode2() {
        postCode2.sendKeys("12345");
    }  //    driver.findElement(By.id("billing:postcode")).sendKeys("12345");

    public void bTel() {
        bTel.click();
    }//    driver.findElement(By.id("billing:telephone")).click();

    public void telPhone() {
        telPhone.sendKeys("0777777777");
    }

    //    driver.findElement(By.id("billing:telephone")).sendKeys("0777777777");
    public void billButton() {
        billButton.click();
    }

    public void shpMet() {
        shpMet.click();
    }

    public void payButton() {
        payButton.click();
    }

    public void coutButton() {
        coutButton.click();
    }



    public void clickCartRegionDropdown(){
        cartRegionDropdown.click();
    }

    public void selectCartRegion(String cartRegionName){
        Select cartRegionSelect = new Select(cartRegionDropdown) ;
        cartRegionSelect.selectByVisibleText(cartRegionName);
    }
    public void cartRegion(String regionName){
        Select regionSelect = new Select(regionDropdown) ;
        regionSelect.selectByVisibleText(regionName);
    }

    public void clickWhenReady(WebElement locator){
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(locator));
        element.click();
                        }

    public void assertTextWhenReady(WebElement locator, String expectedText) {
        wait.until(ExpectedConditions.visibilityOf(locator));
        try {
            wait.until(ExpectedConditions.textToBePresentInElement(locator, expectedText));
        } catch (Exception e){
            System.out.println("Text not present");
        }
        assertEquals(expectedText, locator.getText());
    }
    public void completeAndSubmitCart(){
        cityCart();
        postCode();
        regionId();
        clickCartRegionDropdown();
       selectCartRegion("Alabama");
        checkoutButton();
      regButton();
    }
    public void completeAllMandatoryFieldsInCheckoutPage(){
        firstName.sendKeys("Ioan");
        middleName();
        lastName();
        company();
       email();
        street1();
        street2();
        cityAdress();
        bregionId();
        cartRegion("Alabama");
        postCode1();
        postCode2();
        bTel();
        telPhone();
    }
    public void clickallContinueButtonsOnCheckOutPAge(){
        clickWhenReady(billButton);
        clickWhenReady(shpMet);
        clickWhenReady(payButton);
        clickWhenReady(coutButton);
    }
    public void fillMandatoryFieldExcept(WebElement fieldToSkip){
        getFoodMenu();
        getAddToCart();
        completeAndSubmitCart();
        completeAllMandatoryFieldsInCheckoutPage();
        fieldToSkip.clear();
        clickWhenReady(billButton);


    }
}