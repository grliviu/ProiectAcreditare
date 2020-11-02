package org.fasttrack.steps;

import net.thucydides.core.annotations.Step;
import org.fasttrack.pages.HomePage;
import org.fasttrack.pages.MyAccountPage;
import org.fasttrack.pages.RegisterPage;

public class HomepageSteps {

    private HomePage homePage;
    private MyAccountPage myAccountPage;
    private RegisterPage register;
@Step
    public void verifyHomePageMessage(){
    homePage.open();
    homePage.setVerifyHomepageMessage();}

    }



