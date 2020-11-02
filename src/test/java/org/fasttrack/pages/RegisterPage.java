package org.fasttrack.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://qa2.fasttrackit.org:8008/")
public class RegisterPage extends PageObject {

    @FindBy(css = "#reg_email")
    private WebElementFacade emailAdressField;
    @FindBy(css = "#reg_password")
    private WebElementFacade passWordField;
    @FindBy(css = "#customer_login > div.u-column2.col-2 > form > p.woocommerce-FormRow.form-row > button")
    private WebElementFacade registerButton;
    @FindBy(css = "#post-7 > div > div > div > p:nth-child(1) > strong:nth-child(1)")
    private WebElementFacade verifyRegistrationMessage;
    @FindBy(css = "#post-7 > div > div > ul > li")
    private WebElementFacade verifyRegistrationWithNoPassword;
    @FindBy(css = "#post-7 > div > div > ul > li")
    private WebElementFacade verifyWithNoEmailAdress;
    @FindBy(css = "#customer_login > div.u-column2.col-2 > form > p:nth-child(2) > div")
    private WebElementFacade enterStrongerPassword;
    @FindBy(css = "#post-7 > div > div > ul > li")
    private WebElementFacade allreadyUsedEmail;


    public void setEmailAdressField(String email) {
        typeInto(emailAdressField, email);
    }

    public void setPassWordField(String pass) {
        typeInto(passWordField, pass);
    }

    public void clickRegisterButton() {
        clickOn(registerButton);
    }

    public void verifyRegistrationMessage() {
        verifyRegistrationMessage.containsText("Hello");
    }

    public void verifyRegistrationNoPassword() {
        verifyRegistrationWithNoPassword.containsOnlyText("Error: Please enter an account password.");
    }

    public void verifyRegistrationNoEmail() {
        verifyWithNoEmailAdress.containsOnlyText("Error: Please provide a valid email address.");
    }

    public void verifyStrongerPasswordVeryWeak() {
        enterStrongerPassword.containsOnlyText("Very weak - Please enter" +
                " a stronger password.");
    }
    public void verifyStrongerPasswordWeak(){
        enterStrongerPassword.containsOnlyText("Weak - Please enter a stronger password.");
    }
    public void verifyAllreadyUsedEmail(){allreadyUsedEmail.containsOnlyText("Error: An account is already registered with your " +
            "email address. Please log in.");}
}







