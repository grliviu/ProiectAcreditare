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

    @FindBy(css = "#masthead > div.main-header > div > div.right-links > div.my-account > div > form > p:nth-child(4) > button")
    private WebElementFacade loginButton;

    @FindBy(css =".error-msg span")
    private WebElementFacade errorMessage;
    @FindBy(css = "#masthead > div.main-header > div > div.right-links > div.my-account > i")
    private WebElementFacade logout;
    @FindBy(css = "#masthead > div.main-header > div > div.right-links > div.my-account > i")
    private WebElementFacade loginGreenButton;
    @FindBy(css = "#post-7 > div > div > div > p:nth-child(1) > strong:nth-child(1)")
    private WebElementFacade verifyLoginMessage;
    @FindBy(css = "#masthead > div.main-header > div > div.right-links > div.my-account > div > a.logout")
    private WebElementFacade logoutButton;




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
    public void clickLogoutLink(){clickOn(logout);}
    public void clickLoginGreenButton(){clickOn(loginGreenButton);}
    public void verifyLoginMessage(){verifyLoginMessage.shouldContainText("oliviu66");}
    public void clickLogoutButton(){clickOn(logoutButton);}
}