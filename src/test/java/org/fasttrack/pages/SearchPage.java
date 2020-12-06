package org.fasttrack.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

import java.util.List;

@DefaultUrl("http://qa2.fasttrackit.org:8008/")
public class SearchPage extends PageObject {

    @FindBy(css = "#masthead > div > div.header-top.cl > div.search-box > i")
    private WebElementFacade searchLink;
    @FindBy(css  = "#masthead > div > div.header-top.cl > div.search-box > form > input[type=text]")
    private WebElementFacade searchField;

    @FindBy (css = "#masthead > div > div.header-top.cl > div.search-box > form > button > i")
    private WebElementFacade searchButton;
    @FindBy(css = "#primary #main")
    private WebElementFacade verifyProductIsOnTheSiteMessage;
    @FindBy(css = "#masthead > div.main-header > div > div.right-links > div.header-search > div > form > div > select")
    private WebElementFacade selectProductFromDropdown;

    @FindBy(css = "#main > section > div > p")
    private WebElementFacade verifyProductsIsNotOnTheSiteMessage;
    @FindBy(css = "#main")
    private List<WebElementFacade> listOfItems;


    public boolean findItemInList(String itemName){
        for(WebElementFacade element : listOfItems){
            if(element.findElement(By.cssSelector(" header > h1 > a")).getText().equals(itemName)){
                return true;
            }
        }
        return false;
    }

    public void clickSearchLink(){clickOn(searchLink);}
    public void setSearchField(String word){typeInto(searchField,word );}
    public void clickSearchButton(){clickOn(searchButton);}
    public void verifyProductsIsNotOnTheSiteMessage(){verifyProductsIsNotOnTheSiteMessage.containsText("Sorry, but nothing matched your search terms. Please try" +
            " again with some different keywords.");}
    public void verifyProductIsOnTheSiteMessage(String searchedWord){ verifyProductIsOnTheSiteMessage.containsText(searchedWord);}

    }



