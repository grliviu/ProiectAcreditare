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
        homePage.clickMyAccountLink();
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
    public void clickMetaLink(){login.clickMetaLink();}
    @Step
    public void clickMyAccountKink(){homePage.clickMyAccountLink();}
    @Step
    public void verifyValidLoginMesage(){login.verifyLoginMessage();}
    @Step
    public void verifyInvalidAdressAndPassword(){login.verifyErrorMessage();}
    @Step
    public void clickLogoutButton(){login.clickLogoutButton();}
    @Step
    public void secondWayToLogin(String mail, String pass){
        login.setWEmailField(mail);
        login.setWPassField(pass);
        login.clickLoginButton();
    }
    @Step
    public void clickRemembermeButton(){login.clickRememberMeButton();}
    @Step
    public void verifyEmailIsRemembered(){login.verifyEmailIsRemembered();}




}

