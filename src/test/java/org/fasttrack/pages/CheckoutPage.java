package org.fasttrack.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://qa2.fasttrackit.org:8008/")
public class CheckoutPage extends PageObject {
    @FindBy(css = "#post-5 > div > div > div > div > div > a")
    private WebElementFacade proceedToCheckoutButton;
    @FindBy(id = "billing_first_name")
    private WebElementFacade firstNameField;
    @FindBy(id = "billing_last_name")
    private WebElementFacade lastNameField;
    @FindBy(id = "billing_company")
    private WebElementFacade companyField;
    @FindBy(id = "select2-billing_country-container")
    private WebElementFacade countryLink;
    @FindBy(css = "body > span > span > span.select2-search.select2-search--dropdown > input")
    private WebElementFacade countryField;
    @FindBy (id = "billing_address_1")
    private WebElementFacade numberStreetField;
    @FindBy (id = "billing_address_2")
    private WebElementFacade houseInfoField;
    @FindBy(id = "billing_city")
    private WebElementFacade cityField;
    @FindBy(id = "select2-billing_state-container")
    private WebElementFacade countyLink;
    @FindBy(css = "body > span > span > span.select2-search.select2-search--dropdown > input")
    private WebElementFacade countyField;
    @FindBy(css = "#billing_postcode")
    private WebElementFacade postCode;
    @FindBy(id = "billing_phone")
    private WebElementFacade phoneField;
    @FindBy(id = "billing_email")
    private WebElementFacade emailField;
    @FindBy(id = "place_order")
    private WebElementFacade placeOrderButton;
    @FindBy(css = "#post-5 > div > div > p.cart-empty")
    private WebElementFacade verifyCheckoutCartIsEmpty;
    @FindBy(css = "#post-6 > header > h1")
    private WebElementFacade verifyReceivedOrder;
    @FindBy (css = "#post-6 > div > div > form.checkout.woocommerce-checkout > div.woocommerce-NoticeGroup." +
            "woocommerce-NoticeGroup-checkout > ul > li")
    private WebElementFacade verifyEmptyField;



    public void clickCheckoutButton(){clickOn(proceedToCheckoutButton);}
    public void setFirstNameField(String firstName){typeInto(firstNameField, firstName);}
    public void setLastNameField(String lastName){typeInto(lastNameField, lastName);}
    public void setCompanyField(String companyName){typeInto(companyField, companyName);}
    public void clickCountryLink(){clickOn(countryLink);}
    public void setCountryField(String countryName){countryField.typeAndEnter(countryName) ;}
    public void setNumberStreetField(String streetAndNumber){typeInto(numberStreetField, streetAndNumber);}
    public void setHouseInfoField(String houseInfo){typeInto(houseInfoField, houseInfo);}
    public void setCityField(String city){typeInto(cityField,city);}
    public void clickCountyLink(){clickOn(countyLink);}
    public void setCountyField(String county){countyField.typeAndEnter(county);}
    public void setPostCode(String post){typeInto(postCode, post);}
    public void setPhoneField(String phone){typeInto(phoneField, phone);}
    public void setEmailField(String email){typeInto(emailField, email);}
    public void clickPlaceOrderButton(){clickOn(placeOrderButton);}

    public void verifyCheckoutCartIsEmpty(){verifyCheckoutCartIsEmpty.shouldContainOnlyText
            ("Your cart is currently empty.");}
            public void verifyReceivedOrder(){verifyReceivedOrder.shouldContainText("Order received");}
            public void setVerifyEmptyField(){verifyEmptyField.shouldContainText("is a required field");}




}