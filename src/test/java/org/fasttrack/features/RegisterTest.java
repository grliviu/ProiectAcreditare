package org.fasttrack.features;


import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.fasttrack.steps.LoginSteps;
import org.fasttrack.steps.RegisterSteps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class RegisterTest {

    @Managed(uniqueSession = true)
    public WebDriver driver;
    @Steps
    private RegisterSteps registerSteps;


    @Test
    public void registerToSite(){
        registerSteps.goToRegisterPage();
        registerSteps.enterRegisterCredentials("liviugraur@zohomail.com", "0035799262872");
        registerSteps.registerAfterCompleteFields();
    }

    @Test
    public void verifyRegisterNoEmail(){
        registerSteps.goToRegisterPage();
        registerSteps.enterRegisterCredentials("", "0035799262872");
        registerSteps.registerAfterCompleteFields();
        registerSteps.verifyNoEmail();

    }

    @Test
    public void verifyRegisterNoPassword(){
        registerSteps.goToRegisterPage();
        registerSteps.enterRegisterCredentials("tata@gmail.com", "");
        registerSteps.registerAfterCompleteFields();
        registerSteps.verifyNoPassword();
    }



    @Test
    public void verifyValidRegistration(){
        registerSteps.goToRegisterPage();
        registerSteps.enterRegisterCredentials("liviugraur@zohomail.com", "0035799262872");
        registerSteps.registerAfterCompleteFields();
        registerSteps.verifyRegistration();
    }

@Test
    public void enterStrongerPasswordVeryWeak(){
    registerSteps.goToRegisterPage();
    registerSteps.enterRegisterCredentials("liviugraur@zohomail.com", "0");
    registerSteps.verifyStrongerPasswordVeryWaeak();
    }
    @Test
    public void enterStongerPasswordWeak(){
        registerSteps.goToRegisterPage();
        registerSteps.enterRegisterCredentials("liviugraur@zohomail.com", "034564670");
        registerSteps.verifyStrongerPasswordWeak();
    }
    @Test
    public void registerAllreadyUsedEmail(){
        registerSteps.goToRegisterPage();
        registerSteps.enterRegisterCredentials("oliviu66@yahoo.ro", "0035799262872");
        registerSteps.registerAfterCompleteFields();
    }
    @Test
    public void verifyAllreadyUsedEmail(){
        registerSteps.goToRegisterPage();
        registerSteps.enterRegisterCredentials("oliviu66@yahoo.ro", "0035799262872");
        registerSteps.registerAfterCompleteFields();
        registerSteps.verifyAllreadyUsedEmail();
    }
}