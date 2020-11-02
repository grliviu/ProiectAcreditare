package org.fasttrack.features;


import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.fasttrack.steps.CheckoutSteps;
import org.fasttrack.steps.HomepageSteps;
import org.fasttrack.steps.LoginSteps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class CheckoutTest {

    @Managed(uniqueSession = true)
    public WebDriver driver;

    @Steps
    private LoginSteps loginSteps;
    private HomepageSteps homepage;
    private CheckoutSteps checkoutSteps;
@Test
    public void goToCheckout(){
loginSteps.goToCheckOut();
}
@Test
    public void verifyCheckOutIsEmpty(){
    loginSteps.goToCheckOut();
    loginSteps.verifyCheckoutIsEmpty();}
    @Test
    public void checkoutWithRegistration(){
        loginSteps.goToLoginPage();
        loginSteps.enterLoginCredentials("oliviu66@yahoo.ro","0035799262872");
        loginSteps.clickLogin();
    loginSteps.clickShopLink();
    loginSteps.clickProduct();
    loginSteps.clickAddToCartButton();
    loginSteps.goToCheckOut();
    loginSteps.nameForCheckout("Liv", "Gr", "Xerox");
    loginSteps.countryForCheckout("Romania");
    loginSteps.streetAdress("Randunelelor , nr 20 ");
    loginSteps.houseAdress("Casa 2 , sc 2, ap 21");
    loginSteps.cityAndCounty("Cluj-Napoca", "093948359");
    loginSteps.phoneAndEmail("0034756746476", "oliviu66@yahoo.com");
    loginSteps.placeOrderButton();
    }
    @Test
    public void verifyOrderIsReceived(){
        loginSteps.goToLoginPage();
        loginSteps.enterLoginCredentials("oliviu66@yahoo.ro","0035799262872");
        loginSteps.clickLogin();
        loginSteps.clickShopLink();
        loginSteps.clickProduct();
        loginSteps.clickAddToCartButton();
        loginSteps.goToCheckOut();
        loginSteps.nameForCheckout("Liv", "Gr", "Xerox");
        loginSteps.countryForCheckout("Romania");
        loginSteps.streetAdress("Padurii, 34");
        loginSteps.houseAdress("Bloc 20 , ap 12");
        loginSteps.cityAndCounty("Cluj-Napoca", "093948333");
        loginSteps.phoneAndEmail("0034756746476", "oliviu66@yahoo.com");
        loginSteps.placeOrderButton();
        loginSteps.verifyReceivedOrder();
    }

    @Test
    public void verifyCheckoutEmptyField(){
        loginSteps.goToLoginPage();
        loginSteps.enterLoginCredentials("oliviu66@yahoo.ro","0035799262872");
        loginSteps.clickLogin();
        loginSteps.clickShopLink();
        loginSteps.clickProduct();
        loginSteps.clickAddToCartButton();
        loginSteps.goToCheckOut();
        loginSteps.nameForCheckout("", "Gr", "Xerox");
        loginSteps.countryForCheckout("Romania");
        loginSteps.streetAdress("Randunelelor , nr 20 ");
        loginSteps.houseAdress("Casa 2 , sc 2, ap 21");
        loginSteps.cityAndCounty("Cluj-Napoca", "093948359");
        loginSteps.phoneAndEmail("0034756746476", "oliviu66@yahoo.com");
        loginSteps.placeOrderButton();
        loginSteps.verifyEmptyField();

    }
    }

