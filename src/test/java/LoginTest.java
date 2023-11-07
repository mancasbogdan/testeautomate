


import org.junit.Before;
import org.junit.Test;

public class LoginTest extends Hooks {
  private LoginPage loginPage;
  public CheckoutPage checkoutPage;

  @Before
  public void setupPageObject() {
    loginPage = new LoginPage(driver);
    checkoutPage = new CheckoutPage(driver);
    driver.manage().window().maximize();
  }

  @Test
  public void loginTest() throws InterruptedException {
    loginPage.getAccountClick();
    loginPage.getSkipAccount();
    loginPage.getEmail();
    loginPage.getPass();
    loginPage.getLogInButton();
    checkoutPage.assertTextWhenReady(checkoutPage.pageTitle, "MY DASHBOARD");
  }




}


