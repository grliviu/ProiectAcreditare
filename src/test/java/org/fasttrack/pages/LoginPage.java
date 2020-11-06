package org.fasttrack.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://qa2.fasttrackit.org:8008/")
public class LoginPage extends PageObject {


    @FindBy(css = "#username")
    private WebElementFacade emailField;

    @FindBy(css = "#password")
    private WebElementFacade passwordField;

    @FindBy(css = "#customer_login > div.u-column1.col-1 > form > p:nth-child(3) > button")

    private WebElementFacade loginButton;

    @FindBy(css =".error-msg span")
    private WebElementFacade errorMessage;
    @FindBy(css = "#meta-2 > h3")
    private WebElementFacade metaLink;

    @FindBy(css = "#post-7 > div > div > div > p:nth-child(1) > strong:nth-child(1)")
    private WebElementFacade verifyLoginMessage;
    @FindBy(css = "#meta-2 > ul > li:nth-child(2) > a")
    private WebElementFacade logoutButton;





    @FindBy(css = "#user_login")
    private WebElementFacade secondEmailField;
    @FindBy(css = "#user_pass")
    private WebElementFacade secondPassField;
    @FindBy(css = "#wp-submit")
    private WebElementFacade secondLoginButton;
    @FindBy(css = "#rememberme")
    private WebElementFacade remembermeButton;
    @FindBy(css = "#username")
    private WebElementFacade verifyEmailRemembered;
    public void verifyEmailIsRemembered(){verifyEmailRemembered.shouldContainText("oliviu66@yahoo.ro");}



    public void setWEmailField(String email){typeInto(secondEmailField, email);}
    public void setWPassField(String pass){typeInto(secondPassField, pass);}
    public void clickLoginButton(){clickOn(secondLoginButton);}




    public void setEmailField(String email){ typeInto(emailField, email); }

    public void setPasswordField(String password){
        typeInto(passwordField, password);
    }

    public void clickLogin(){
        clickOn(loginButton);
    }


    public void verifyErrorMessage(){
        errorMessage.shouldContainOnlyText("ERROR: Invalid email address. Lost your password?");
    }
    public void clickMetaLink(){clickOn(metaLink);}
    public void verifyLoginMessage(){verifyLoginMessage.shouldContainText("oliviu66");}
    public void clickLogoutButton(){clickOn(logoutButton);}

    public void clickRememberMeButton(){clickOn(remembermeButton);}
}