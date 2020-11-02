package org.fasttrack.steps;

import net.thucydides.core.annotations.Step;
import org.fasttrack.pages.*;

public class LoginSteps {

    private HomePage homePage;
    private MyAccountPage myAccountPage;
    private LoginPage login;
    private CartPage cart;
    private CheckoutPage checkout;
    @Step
    public void goToLoginPage(){
        homePage.open();
        login.clickLoginGreenButton();
    }


    @Step
    public void enterLoginCredentials(String email, String password){
        login.setEmailField(email);
        login.setPasswordField(password);
    }
        @Step
      public void clickLogin(){
        login.clickLogin();}
        @Step
    public void clickLogout(){login.clickLogoutLink();}
    @Step
    public void clickMyAccountKink(){homePage.clickMyAccountLink();}
    @Step
    public void verifyValidLoginMesage(){login.verifyLoginMessage();}
    @Step
    public void verifyInvalidAdressAndPassword(){login.verifyErrorMessage();}
    @Step
    public void clickLogoutButton(){login.clickLogoutButton();}

// Steps for CheckoutTest
    @Step
    public void clickCartButton(){cart.clickCartButton();
    }
    @Step
    public void clickCheckoutButton(){checkout.clickCheckoutButton();}

    @Step
    public void goToCheckOut(){
        homePage.clickCheckoutLink();}
        @Step
                public void verifyCheckoutIsEmpty(){ checkout.verifyCheckoutCartIsEmpty();}
                @Step
                public void nameForCheckout(String firstName, String lastName, String companyName){
        checkout.setFirstNameField(firstName);
        checkout.setLastNameField(lastName);
        checkout.setCompanyField(companyName);}
        @Step
                public void countryForCheckout(String country){
        checkout.clickCountryLink();
            checkout.setCountryField(country);}
            @Step
                    public void streetAdress(String street){
        checkout.setNumberStreetField(street);}
        @Step
                public void houseAdress(String house){
        checkout.setHouseInfoField(house);}
        @Step
                public void cityAndCounty(String city, String postCode){
        checkout.setCityField(city);
        //checkout.setCountyField(county);
        checkout.setPostCode(postCode);
        }
            @Step
                    public void phoneAndEmail(String phone, String email){
                checkout.setPhoneField(phone);
                checkout.setEmailField(email);
        }

        @Step
                public void placeOrderButton(){
        checkout.clickPlaceOrderButton();
                }
                @Step
                public void verifyReceivedOrder(){checkout.verifyReceivedOrder();}
                @Step
                public void verifyEmptyField(){checkout.setVerifyEmptyField();}


    //Steps for CartTest
    @Step
    public void clickShopLink(){cart.clickShopLink();}
    @Step
    public void clickProduct(){cart.clickProduct();}
    @Step
    public void addProductToCart(){cart.clickAddToCartButton();}
    @Step
    public void clearDefaultQuantity(){cart.setClearDefaultQuantity();}
    @Step
    public void selectQuantity(String quantity){cart.setProductsQuantity(quantity);}
    @Step
    public void clickAddToCartButton(){cart.clickAddToCartButton();}
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
    //Steps for MyAccount
    @Step
    public void clickDashboardLink(){myAccountPage.clickDashboardLink();}
    @Step
    public void verifyDashboardmessage(){myAccountPage.verifyDashboardMessage();}
    @Step
    public void clickMyaccountLink(){homePage.clickMyAccountLink();}
    @Step
    public void verifyDownloadsIsEmpty(){myAccountPage.verifyDownloadsIsEmpty();}
    @Step
    public void clickDownloadsLink(){myAccountPage.clickDownloadLink();}
    @Step
    public void changeFirstName(String newFirstName){
        myAccountPage.setClearFirstName();
        myAccountPage.setChangeFirstName(newFirstName); }
    @Step
    public void clickAccountDetails(){ myAccountPage.clickAccountDetailsLink();}
    @Step
    public void changeLastName(String newLastName){
        myAccountPage.setClearAndChangeLastName(newLastName);
    }
    @Step
    public void saveChangesInMyAccountDetails(){myAccountPage.setSaveChanges();}
    @Step
    public void verifySavedChangesInMyAccount(){myAccountPage.verifySavedChangesMyAccountMessage();}
    @Step
    public void changePassword(String pass, String newPass, String confirmPass){
        myAccountPage.setCurrentPassword(pass);
        myAccountPage.setNewPassword(newPass);
        myAccountPage.setConfirmPassword(confirmPass);
    }
    @Step
    public void checkOrderStatus(String status){myAccountPage.checkOrderStatus(status);}
    @Step
    public void clickOrdersLink(){myAccountPage.clickOrdersLink();}




}

