package org.fasttrack.features;


import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.fasttrack.steps.HomepageSteps;
import org.fasttrack.steps.LoginSteps;
import org.fasttrack.steps.SearchSteps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class SearchTest {

    @Managed(uniqueSession = true)
    public WebDriver driver;
    @Steps
    private SearchSteps searchSteps;
    @Steps
    private HomepageSteps homepage;
    @Steps
    private LoginSteps loginSteps;
    @Test
    public void searchProductNoRegister(){
        searchSteps.clickSearckLink();
        searchSteps.setSearchField("hat");
        searchSteps.clickSearchButton();

    }
    @Test
    public void verifySiteDoesntContainProductMessage(){
        searchSteps.clickSearckLink();
        searchSteps.setSearchField("kuku");
        searchSteps.clickSearchButton();
        searchSteps.verifyProductIsNotOnTheSiteMessage();
    }
    @Test
    public void verifySiteContainsProductMessage(){
        searchSteps.clickSearckLink();
        searchSteps.setSearchField("belt");
        searchSteps.clickSearchButton();
        searchSteps.verifyProductIsOnTheSiteMessage("belt");
    }
    @Test
    public void verifyProductInList(){
        searchSteps.clickSearckLink();
        searchSteps.setSearchField("b");
        searchSteps.clickSearchButton();
        searchSteps.verifyProductInList("belt");
    }

    }







