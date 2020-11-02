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
    public class HomepageTest {

        @Managed(uniqueSession = true)
        public WebDriver driver;
        @Steps
        private HomepageSteps homepageSteps;
@Test
        public void verifyHomepageMessage(){

}
    }