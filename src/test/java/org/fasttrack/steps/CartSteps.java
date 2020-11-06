package org.fasttrack.steps;

import net.thucydides.core.annotations.Step;
import org.fasttrack.pages.CartPage;
import org.fasttrack.pages.HomePage;
import org.fasttrack.pages.LoginPage;

public class CartSteps {
    private CartPage cart;
    private HomePage homePage;
    private LoginPage loginPage;

    @Step
    public void clickCartButton(){cart.clickCartButton();
    }
    @Step
    public void clickShopLink(){cart.clickShopLink();}
    @Step
    public void clickProduct(){cart.clickProduct();}
    @Step
    public void clickAddProductToCart(){cart.clickAddToCartButton();}
    @Step
    public void clearDefaultQuantity(){cart.setClearDefaultQuantity();}
    @Step
    public void selectQuantity(String quantity){cart.setProductsQuantity(quantity);}

    @Step
    public void openHomePage(){
        homePage.open();
    }
    @Step
    public void clickReviewsButton(){cart.clickReviewsButton();}
    @Step
    public void setCommentField(String commnet){cart.setCommentField(commnet);}
    @Step
    public void clickSubmitButton(){cart.clickSubmitButton();}
    @Step
    public void verifySaleMessage(){cart.verifySaleMessage();}
    @Step
    public void verifyProductIsAddedToCartMessage(){cart.verifyProductIsAddedToCart();}
    @Step
    public void addRating(){cart.clickAddRating();}
    @Step
    public void findItemInListList(String itemName){cart.findItemInList(itemName);}



}
