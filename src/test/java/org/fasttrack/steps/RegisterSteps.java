package org.fasttrack.steps;

import net.thucydides.core.annotations.Step;
import org.fasttrack.pages.HomePage;
import org.fasttrack.pages.MyAccountPage;
import org.fasttrack.pages.RegisterPage;

public class RegisterSteps {

    private HomePage homePage;
    private MyAccountPage myAccountPage;
    private RegisterPage register;
    @Step
    public void goToRegisterPage(){
        homePage.open();
       homePage.clickMyAccountLink();}

        @Step
    public void enterRegisterCredentials(String email, String password){
        register.setEmailAdressField(email);
        register.setPassWordField(password);
        }
        @Step
    public void registerAfterCompleteFields(){register.clickRegisterButton();}
    @Step
    public void verifyRegistration(){register.verifyRegistrationMessage();}
    @Step
    public void verifyNoPassword(){register.verifyRegistrationNoPassword();}
    @Step
    public void verifyNoEmail(){register.verifyRegistrationNoEmail();}
    @Step
    public void verifyStrongerPasswordVeryWaeak(){register.verifyStrongerPasswordVeryWeak();}
    @Step
    public void verifyStrongerPasswordWeak(){register.verifyStrongerPasswordWeak();}
    @Step
    public void verifyAllreadyUsedEmail(){register.verifyAllreadyUsedEmail();}

    }
