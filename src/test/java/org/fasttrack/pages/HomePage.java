package org.fasttrack.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://qa2.fasttrackit.org:8008/")
public class HomePage extends PageObject {
    @FindBy(css = "#menu-item-63 > a")
    private WebElementFacade homepageLink;
    @FindBy(css = "#menu-item-64 > a")
    private WebElementFacade myAccountLink;

    @FindBy(css = "#menu-item-65 > a")
    private WebElementFacade checkoutLink;
    @FindBy(css = "#post-1 > header > h1 > a")
    private WebElementFacade checkHomepage;
    @FindBy(css = "#post-1 > div")
    private WebElementFacade verifyHomepageMessage;

    public void clickMyAccountLink(){
        waitFor(myAccountLink);
        clickOn(myAccountLink); }
        public void clickHomepageLink(){clickOn(homepageLink);}

        public void clickCheckoutLink(){clickOn(checkoutLink);}
        public void verifyCheckHomepage(){checkHomepage.containsOnlyText("Hello world!");}
        public void setVerifyHomepageMessage(){verifyHomepageMessage.containsText("Welcome to WordPress. This is your first post. Edit or delete it, then start writing!");}


}
