package org.fasttrack.features;


import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.fasttrack.steps.HomepageSteps;
import org.fasttrack.steps.LoginSteps;
import org.fasttrack.steps.MyAccountSteps;
import org.fasttrack.steps.RegisterSteps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)

public class MyAccountTest {
    @Managed(uniqueSession = true)
    public WebDriver driver;


    @Steps
    private LoginSteps loginSteps;
    @Steps
    private HomepageSteps homepage;
    @Steps
    private RegisterSteps registerSteps;
    @Steps
    private MyAccountSteps myAccountSteps;

    @Test
    public void verifyDashboardMessage(){
        loginSteps.goToLoginPage();
        loginSteps.enterLoginCredentials("oliviu66@yahoo.ro","0035799262872");
        loginSteps.clickLogin();
        myAccountSteps.clickMyaccountLink();
        myAccountSteps.clickDashboardLink();
        myAccountSteps.verifyDashboardmessage();
    }
    @Test
    public void verifyDownloadsIsEmpty(){
        loginSteps.goToLoginPage();
        loginSteps.enterLoginCredentials("oliviu66@yahoo.ro","0035799262872");
        loginSteps.clickLogin();
        myAccountSteps.clickMyaccountLink();
        myAccountSteps.clickDownloadsLink();
        myAccountSteps.verifyDownloadsIsEmpty();
    }
    @Test
    public void changeFirstName(){
        loginSteps.goToLoginPage();
        loginSteps.enterLoginCredentials("oliviu66@yahoo.ro","0035799262872");
        loginSteps.clickLogin();
        myAccountSteps.clickMyaccountLink();
        myAccountSteps.clickAccountDetails();
        myAccountSteps.changeFirstName("liviutz");
        myAccountSteps.saveChangesInMyAccountDetails();
    }
    @Test
    public void changeLastName(){
        loginSteps.goToLoginPage();
        loginSteps.enterLoginCredentials("oliviu66@yahoo.ro","0035799262872");
        loginSteps.clickLogin();
        myAccountSteps.clickMyaccountLink();
        myAccountSteps.clickAccountDetails();
        myAccountSteps.changeLastName("graur");
        myAccountSteps.saveChangesInMyAccountDetails(); }
        @Test
    public void verifySavedChangesInMyAccount(){
            loginSteps.goToLoginPage();
            loginSteps.enterLoginCredentials("oliviu66@yahoo.ro","0035799262872");
            loginSteps.clickLogin();
            myAccountSteps.clickMyaccountLink();
            myAccountSteps.clickAccountDetails();
            myAccountSteps.changeFirstName("liviutz");
            myAccountSteps.saveChangesInMyAccountDetails();
            myAccountSteps.verifySavedChangesInMyAccount();
        }
        @Test
        public void changePassword(){
            loginSteps.goToLoginPage();
            loginSteps.enterLoginCredentials("oliviu66@yahoo.ro","0035799262872");
            loginSteps.clickLogin();
            myAccountSteps.clickMyaccountLink();
            myAccountSteps.clickAccountDetails();
            myAccountSteps.changePassword("0035799262872", "431319A431319", "431319A431319");
    }

       @Test
    public void checkOrderStatus(){
           loginSteps.goToLoginPage();
           loginSteps.enterLoginCredentials("oliviu66@yahoo.ro","0035799262872");
           loginSteps.clickLogin();
           myAccountSteps.clickMyaccountLink();
           myAccountSteps.clickOrdersLink();
           myAccountSteps.checkOrderStatus("hold");
       }

}
