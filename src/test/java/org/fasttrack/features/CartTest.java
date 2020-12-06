package org.fasttrack.features;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.fasttrack.steps.CartSteps;
import org.fasttrack.steps.LoginSteps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
    public class CartTest {

        @Managed(uniqueSession = true)
        public WebDriver driver;
        @Steps
        private LoginSteps loginSteps;
        @Steps
        private CartSteps cartSteps;
        @Test
        public void addProductToCart(){
            loginSteps.goToLoginPage();
            loginSteps.enterLoginCredentials("oliviu66@yahoo.ro","0035799262872");
            loginSteps.clickLogin();
            cartSteps.clickShopLink();
            cartSteps.clickProduct();
            cartSteps.clickAddProductToCart();

        }
        @Test
        public void addCommentAndRating(){
            loginSteps.goToLoginPage();
            loginSteps.enterLoginCredentials("oliviu66@yahoo.ro","0035799262872");
            loginSteps.clickLogin();
            cartSteps.clickShopLink();
            cartSteps.clickProduct();
            cartSteps.clickReviewsButton();
            cartSteps.addRating();
            cartSteps.setCommentField("eeeeeee");
            cartSteps.clickSubmitButton();

        }
        @Test
    public void verifyIfProductIsOnSale(){
            loginSteps.goToLoginPage();
            loginSteps.enterLoginCredentials("oliviu66@yahoo.ro","0035799262872");
            loginSteps.clickLogin();
            cartSteps.clickShopLink();
            cartSteps.clickProduct();
            cartSteps.verifySaleMessage();

        }
        @Test
    public void verifyProductIsAddedToCart(){
            loginSteps.goToLoginPage();
            loginSteps.enterLoginCredentials("oliviu66@yahoo.ro","0035799262872");
            loginSteps.clickLogin();
            cartSteps.clickShopLink();
            cartSteps.clickProduct();
            cartSteps.clickAddProductToCart();
            cartSteps.verifyProductIsAddedToCartMessage();
        }
        @Test
    public void showMostExpensiveProduct(){
            loginSteps.goToLoginPage();
            loginSteps.enterLoginCredentials("oliviu66@yahoo.ro","0035799262872");
            loginSteps.clickLogin();
            cartSteps.clickShopLink();
            cartSteps.selectCategory();
            cartSteps.findFirstElement();
        }


}


