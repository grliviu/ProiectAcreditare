package org.fasttrack.steps;

import net.thucydides.core.annotations.Step;
import org.fasttrack.pages.*;

public class CheckoutSteps {

    private HomePage homePage;
    private MyAccountPage myAccountPage;
    private LoginPage login;
    private CartPage cart;
    private CheckoutPage checkout;

    @Step
    public void clickCheckoutButton(){checkout.clickCheckoutButton();}

    @Step
    public void goToCheckOut(){
        homePage.open();
        homePage.clickCheckoutLink();}
    @Step
    public void verifyCheckoutIsEmpty(){ checkout.verifyCheckoutCartIsEmpty();}
    @Step
    public void nameForCheckout(String firstName, String lastName, String companyName){
        checkout.setFirstNameField(firstName);
        checkout.setLastNameField(lastName);
        checkout.setCompanyField(companyName);}
    @Step
    public void countryForCheckout(String country){
        checkout.clickCountryLink();
        checkout.setCountryField(country);}
    @Step
    public void streetAdress(String street){
        checkout.setNumberStreetField(street);}
    @Step
    public void houseAdress(String house){
        checkout.setHouseInfoField(house);}
    @Step
    public void cityAndCounty(String city, String postCode){
        checkout.setCityField(city);
        //checkout.setCountyField(county);
        checkout.setPostCode(postCode);
    }
    @Step
    public void phoneAndEmail(String phone, String email){
        checkout.setPhoneField(phone);
        checkout.setEmailField(email);
    }

    @Step
    public void placeOrderButton(){
        checkout.clickPlaceOrderButton();
    }
    @Step
    public void verifyReceivedOrder(){checkout.verifyReceivedOrder();}
    @Step
    public void verifyEmptyField(){checkout.setVerifyEmptyField();}
}