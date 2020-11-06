package org.fasttrack.steps;

import net.thucydides.core.annotations.Step;
import org.fasttrack.pages.*;

public class MyAccountSteps {

    private HomePage homePage;
    private MyAccountPage myAccountPage;
    private LoginPage login;
    private CartPage cart;
    private CheckoutPage checkout;
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
