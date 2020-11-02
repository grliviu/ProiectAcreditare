package org.fasttrack.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://qa2.fasttrackit.org:8008/?page_id=7")
public class MyAccountPage extends PageObject {
    @FindBy(css = "#post-7 > div > div > nav > ul > li.woocommerce-MyAccount-navigation-link" +
            ".woocommerce-MyAccount-navigation-link--dashboard > a")
    private WebElementFacade dashboardLink;
    @FindBy(css = "#post-7 > div > div > nav > ul > li.woocommerce-" +
            "MyAccount-navigation-link.woocommerce-MyAccount-navigation-link--orders > a")
    private WebElementFacade ordersLink;
    @FindBy(css = "#post-7 > div > div > nav > ul > li.woocommerce-MyAccount-navigation-link" +
            ".woocommerce-MyAccount-navigation-link--downloads > a")
    private WebElementFacade downloadLink;
    @FindBy(css = "#post-7 > div > div > nav > ul > li.woocommerce-MyAccount-navigation-link" +
            ".woocommerce-MyAccount-navigation-link--edit-address > a")
    private WebElementFacade adressesLink;
    @FindBy(css = "#post-7 > div > div > nav > ul > li.woocommerce-MyAccount-navigation" +
            "-link.woocommerce-MyAccount-navigation-link--edit-account > a")
    private WebElementFacade accountDetailsLink;
    @FindBy(css = "#post-7 > div > div > nav > ul > li.woocommerce-MyAccount-navigation-link." +
            "woocommerce-MyAccount-navigation-link--customer-logout > a")
    private WebElementFacade logoutLink;
    @FindBy(css = "#post-7 > div > div > div > p:nth-child(2)")
    private WebElementFacade verifyDashboardMessage;
    @FindBy(css = "#post-7 > div > div > div > div")
    private WebElementFacade verifyDownloadsIsEmpty;
    @FindBy(css = "#account_first_name")
    private WebElementFacade clearFirstName;
    @FindBy(css = "#account_first_name")
    private WebElementFacade changeFirstName;
    @FindBy(css = "#account_last_name")
    private WebElementFacade clearAndChangeLastName;
    @FindBy(css = "#post-7 > div > div > div > form > p:nth-child(7) > button")
    private WebElementFacade saveChanges;
    @FindBy(css = "#post-7 > div > div > div.woocommerce-message")
    private WebElementFacade verifySavedChangesMyAccountMessage;
    @FindBy(css = "#password_current")
    private WebElementFacade currentPassword;
    @FindBy(css = "#password_1")
    private WebElementFacade newPassword;
    @FindBy(css = "#password_2")
    private WebElementFacade confirmPassword;
    @FindBy(css = "#post-7 > div > div > div > table > tbody > tr:nth-child(1) > " +
            "td.woocommerce-orders-table__cell.woocommerce-orders-table__cell-order-status")
    private WebElementFacade verifyOrderStatus;


    public void clickDashboardLink() {
        clickOn(dashboardLink);
    }

    public void clickOrdersLink() {
        clickOn(ordersLink);
    }

    public void clickDownloadLink() {
        clickOn(downloadLink);
    }

    public void clickAdressesLink() {
        clickOn(adressesLink);
    }

    public void clickAccountDetailsLink() {
        clickOn(accountDetailsLink);
    }

    public void clickLogoutLink() {
        clickOn(logoutLink);
    }

    public void verifyDashboardMessage() {
        verifyDashboardMessage.shouldContainText("From your account dashboard you can view your recent orders, manage your shipping" +
                " and billing addresses and edit your password and account details.");
    }

    public void verifyDownloadsIsEmpty() {
        verifyDownloadsIsEmpty.shouldContainText("No downloads available yet.");
    }

    public void setClearFirstName() {
        clearFirstName.clear();
    }

    public void setChangeFirstName(String newFirstName) {
        typeInto(changeFirstName, newFirstName);
    }

    public void setClearAndChangeLastName(String newLastName) {
        clearAndChangeLastName.clear();
        typeInto(clearAndChangeLastName, newLastName);
    }

    public void setSaveChanges() {
        clickOn(saveChanges);
    }

    public void verifySavedChangesMyAccountMessage() {
        verifySavedChangesMyAccountMessage.containsText("Account details changed successfully.");
    }

    public void setCurrentPassword(String pass) {
        typeInto(currentPassword, pass);
    }

    public void setNewPassword(String newPass) {
        typeInto(newPassword, newPass);
    }

    public void setConfirmPassword(String confirmPass) {
        typeInto(confirmPassword, confirmPass);
    }

    public void checkOrderStatus(String status) {
        verifyOrderStatus.containsText(status);
    }

}
















