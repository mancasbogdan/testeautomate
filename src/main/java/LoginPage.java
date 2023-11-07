import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.assertEquals;


public class LoginPage extends BasePage {


    private WebDriverWait wait;

    public LoginPage(WebDriver driver) {
        super(driver);
        wait = new WebDriverWait(driver, 30);
    }

    @FindBy(css = ".account-cart-wrapper span")
    private WebElement accountClick;
    @FindBy(linkText = "Log In")
    private WebElement skipAccount;
    @FindBy(id = "email")
    private WebElement email;
    @FindBy(id = "pass")
    private WebElement pass;
    @FindBy(id = "send2")
    private WebElement logInButton;
//    @FindBy(css = ".page-title")
//    private WebElement Hello;

    public void getAccountClick() {
        accountClick.click();
    }

    public void getSkipAccount() {
        skipAccount.click();
    }

    public void getEmail() {
        email.sendKeys("mancas240@gmail.com");
    }
    public void getPass() {
        pass.sendKeys("Lemn.tech1");
    }
    public void getLogInButton() {
        logInButton.click();
    }}





//    @FindBy(xpath = "//a[text()='Food']")
//    private WebElement foodMenu;
//
//
//    public void cityCart() {
//        cityCart.sendKeys("alabama city");
//    } //    driver.findElement(By.id("city")).sendKeys("alabama");
//
//
//    public void clickWhenReady(WebElement locator){
//        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(locator));
//        element.click();
//                        }
//
//       public void assertTextWhenReady(WebElement locator,String expectedText) {
//        wait.until(ExpectedConditions.visibilityOf(locator));
//        wait.until(ExpectedConditions.textToBePresentInElement(locator, expectedText));
//        assertEquals (expectedText,locator.getText());
//       }}

