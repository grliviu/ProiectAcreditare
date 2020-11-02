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
    private HomepageSteps homepage;
    private RegisterSteps registerSteps;
    private MyAccountSteps myAccountSteps;

    @Test
    public void verifyDashboardMessage(){
        loginSteps.goToLoginPage();
        loginSteps.enterLoginCredentials("oliviu66@yahoo.ro","0035799262872");
        loginSteps.clickLogin();
        loginSteps.clickMyaccountLink();
        loginSteps.clickDashboardLink();
        loginSteps.verifyDashboardmessage();
    }
    @Test
    public void verifyDownloadsIsEmpty(){
        loginSteps.goToLoginPage();
        loginSteps.enterLoginCredentials("oliviu66@yahoo.ro","0035799262872");
        loginSteps.clickLogin();
        loginSteps.clickMyaccountLink();
        loginSteps.clickDownloadsLink();
        loginSteps.verifyDownloadsIsEmpty();
    }
    @Test
    public void changeFirstName(){
        loginSteps.goToLoginPage();
        loginSteps.enterLoginCredentials("oliviu66@yahoo.ro","0035799262872");
        loginSteps.clickLogin();
        loginSteps.clickMyaccountLink();
        loginSteps.clickAccountDetails();
        loginSteps.changeFirstName("liviutz");
        loginSteps.saveChangesInMyAccountDetails();
    }
    @Test
    public void changeLastName(){
        loginSteps.goToLoginPage();
        loginSteps.enterLoginCredentials("oliviu66@yahoo.ro","0035799262872");
        loginSteps.clickLogin();
        loginSteps.clickMyaccountLink();
        loginSteps.clickAccountDetails();
        loginSteps.changeLastName("graur");
        loginSteps.saveChangesInMyAccountDetails(); }
        @Test
    public void verifySavedChangesInMyAccount(){
            loginSteps.goToLoginPage();
            loginSteps.enterLoginCredentials("oliviu66@yahoo.ro","0035799262872");
            loginSteps.clickLogin();
            loginSteps.clickMyaccountLink();
            loginSteps.clickAccountDetails();
            loginSteps.changeFirstName("liviutz");
            loginSteps.saveChangesInMyAccountDetails();
            loginSteps.verifySavedChangesInMyAccount();
        }
        @Test
        public void changePassword(){
            loginSteps.goToLoginPage();
            loginSteps.enterLoginCredentials("oliviu66@yahoo.ro","0035799262872");
            loginSteps.clickLogin();
            loginSteps.clickMyaccountLink();
            loginSteps.clickAccountDetails();
            loginSteps.changePassword("0035799262872", "431319A431319", "431319A431319");
    }

       @Test
    public void checkOrderStatus(){
           loginSteps.goToLoginPage();
           loginSteps.enterLoginCredentials("oliviu66@yahoo.ro","0035799262872");
           loginSteps.clickLogin();
           loginSteps.clickMyaccountLink();
           loginSteps.clickOrdersLink();
           loginSteps.checkOrderStatus("hold");
       }

}
