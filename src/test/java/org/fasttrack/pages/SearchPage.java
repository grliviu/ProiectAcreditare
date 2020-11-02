package org.fasttrack.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://qa2.fasttrackit.org:8008/")
public class SearchPage extends PageObject {

    @FindBy(css = "#masthead > div.main-header > div > div.right-links > div.header-search > a > i")
    private WebElementFacade searchLink;
    @FindBy(css  = "#masthead > div.main-header > div > div.right-links >" +
            " div.header-search > div > form > input")
    private WebElementFacade searchField;

    @FindBy (css = "#masthead > div.main-header > div > div.right-links " +
            "> div.header-search > div > form > button > i")
    private WebElementFacade searchButton;
    @FindBy(css = "#post-20 > header > h1 > a")
    private WebElementFacade verifyProductIsOnTheSiteMessage;
    @FindBy(css = "#masthead > div.main-header > div > div.right-links > div.header-search > div > form > div > select")
    private WebElementFacade selectProductFromDropdown;

    @FindBy(css = "#main > section > header > h1")
    private WebElementFacade verifyProductsIsNotOnTheSiteMessage;

    public void clickSearchLink(){clickOn(searchLink);}
    public void setSearchField(String word){typeInto(searchField,word );}
    public void clickSearchButton(){clickOn(searchButton);}
    public void verifyProductsIsNotOnTheSiteMessage(){verifyProductsIsNotOnTheSiteMessage.containsText("Nothing Found");}
    public void verifyProductIsOnTheSiteMessage(String searchedWord){verifyProductIsOnTheSiteMessage.containsText(searchedWord);}

    }



