package org.fasttrack.steps;

import net.thucydides.core.annotations.Step;
import org.fasttrack.pages.HomePage;
import org.fasttrack.pages.MyAccountPage;
import org.fasttrack.pages.SearchPage;
import org.junit.Assert;

public class SearchSteps {

    private HomePage homePage;
    private MyAccountPage myAccountPage;
    private SearchPage searchPage;
    @Step
   public void clickSearckLink(){
        homePage.open();
        searchPage.clickSearchLink();
    }
    @Step
    public void setSearchField(String word){searchPage.setSearchField(word);}
    @Step
    public void clickSearchButton(){searchPage.clickSearchButton();}
    @Step
    public void verifyProductIsNotOnTheSiteMessage(){searchPage.verifyProductsIsNotOnTheSiteMessage();}
    @Step
    public void verifyProductIsOnTheSiteMessage(String searchedWord){ searchPage.verifyProductIsOnTheSiteMessage(searchedWord);}
    @Step
    public void verifyProductInList(String itemName){
        Assert.assertTrue(searchPage.findItemInList(itemName));
    }

}