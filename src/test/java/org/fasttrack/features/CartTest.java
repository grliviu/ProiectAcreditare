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
        private CartSteps cartSteps;
        @Test
        public void addProductToCart(){
            loginSteps.goToLoginPage();
            loginSteps.enterLoginCredentials("oliviu66@yahoo.ro","0035799262872");
            loginSteps.clickLogin();
            loginSteps.clickShopLink();
            loginSteps.clickProduct();
            loginSteps.clickAddToCartButton();

        }
        @Test
        public void addCommnetToProduct(){
            loginSteps.goToLoginPage();
            loginSteps.enterLoginCredentials("oliviu66@yahoo.ro","0035799262872");
            loginSteps.clickLogin();
            loginSteps.clickShopLink();
            loginSteps.clickProduct();
            loginSteps.clickReviewsButton();
            loginSteps.setCommentField("eeeeeee");
            loginSteps.clickSubmitButton();

        }
        @Test
    public void verifyIfProductIsOnSale(){
            loginSteps.goToLoginPage();
            loginSteps.enterLoginCredentials("oliviu66@yahoo.ro","0035799262872");
            loginSteps.clickLogin();
            loginSteps.clickShopLink();
            loginSteps.clickProduct();
            loginSteps.verifySaleMessage();

        }


}


