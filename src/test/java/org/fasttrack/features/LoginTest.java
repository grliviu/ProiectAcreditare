package org.fasttrack.features;


import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.fasttrack.steps.HomepageSteps;
import org.fasttrack.steps.LoginSteps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class LoginTest {

    @Managed(uniqueSession = true)
    public WebDriver driver;


    @Steps
    private LoginSteps loginSteps;
    private HomepageSteps homepage;
    @Test
    public void validLogin(){
        loginSteps.goToLoginPage();
        loginSteps.enterLoginCredentials("oliviu66@yahoo.ro","0035799262872");
        loginSteps.clickLogin();}
        @Test
    public void verifyValidLoginTest(){
            loginSteps.goToLoginPage();
            loginSteps.enterLoginCredentials("oliviu66@yahoo.ro","0035799262872");
            loginSteps.clickLogin();
            loginSteps.clickMyAccountKink();
            loginSteps.verifyValidLoginMesage();
    }
    @Test
    public void verifyInvalidEmailAndPasword(){
        loginSteps.goToLoginPage();
        loginSteps.enterLoginCredentials("oliviu6@yahoo.ro","0035799262872");
        loginSteps.clickLogin();
        loginSteps.verifyInvalidAdressAndPassword();
    }
@Test
    public void logoutTest(){
    loginSteps.goToLoginPage();
    loginSteps.enterLoginCredentials("oliviu66@yahoo.ro","0035799262872");
    loginSteps.clickLogin();
    loginSteps.clickLogout();
    loginSteps.clickLogoutButton();
    }
}




