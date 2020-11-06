package org.fasttrack.features;


import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.fasttrack.steps.CartSteps;
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
    @Steps
    private HomepageSteps homepage;
    @Steps
    private CheckoutSteps checkoutSteps;
    @Steps
    private CartSteps cartSteps;
@Test
    public void goToCheckout(){
checkoutSteps.goToCheckOut();
}
@Test
    public void verifyCheckOutIsEmpty(){
    checkoutSteps.goToCheckOut();
    checkoutSteps.verifyCheckoutIsEmpty();}



    @Test
    public void checkoutWithRegistration(){
        loginSteps.goToLoginPage();
        loginSteps.enterLoginCredentials("oliviu66@yahoo.ro","0035799262872");
        loginSteps.clickLogin();
    cartSteps.clickShopLink();
    cartSteps.clickProduct();
    cartSteps.clickAddProductToCart();
    checkoutSteps.goToCheckOut();
    checkoutSteps.nameForCheckout("Liv", "Gr", "Xerox");
    checkoutSteps.countryForCheckout("Romania");
    checkoutSteps.streetAdress("Randunelelor , nr 20 ");
    checkoutSteps.houseAdress("Casa 2 , sc 2, ap 21");
    checkoutSteps.cityAndCounty("Cluj-Napoca", "093948359");
    checkoutSteps.phoneAndEmail("0034756746476", "oliviu66@yahoo.com");
    checkoutSteps.placeOrderButton();
    }
    @Test
    public void verifyOrderIsReceived(){
        loginSteps.goToLoginPage();
        loginSteps.enterLoginCredentials("oliviu66@yahoo.ro","0035799262872");
        loginSteps.clickLogin();
        cartSteps.clickShopLink();
        cartSteps.clickProduct();
        cartSteps.clickAddProductToCart();
        checkoutSteps.goToCheckOut();
        checkoutSteps.nameForCheckout("Liv", "Gr", "Xerox");
        checkoutSteps.countryForCheckout("Romania");
        checkoutSteps.streetAdress("Padurii, 34");
        checkoutSteps.houseAdress("Bloc 20 , ap 12");
        checkoutSteps.cityAndCounty("Cluj-Napoca", "093948333");
        checkoutSteps.phoneAndEmail("0034756746476", "oliviu66@yahoo.com");
        checkoutSteps.placeOrderButton();
        checkoutSteps.verifyReceivedOrder();
    }

    @Test
    public void verifyCheckoutEmptyField(){
        loginSteps.goToLoginPage();
        loginSteps.enterLoginCredentials("oliviu66@yahoo.ro","0035799262872");
        loginSteps.clickLogin();
        cartSteps.clickShopLink();
        cartSteps.clickProduct();
        cartSteps.clickAddProductToCart();
        checkoutSteps.goToCheckOut();
        checkoutSteps.nameForCheckout("", "Gr", "Xerox");
        checkoutSteps.countryForCheckout("Romania");
        checkoutSteps.streetAdress("Randunelelor , nr 20 ");
        checkoutSteps.houseAdress("Casa 2 , sc 2, ap 21");
        checkoutSteps.cityAndCounty("Cluj-Napoca", "093948359");
        checkoutSteps.phoneAndEmail("0034756746476", "oliviu66@yahoo.com");
        checkoutSteps.placeOrderButton();
        checkoutSteps.verifyEmptyField();

    }
    }

