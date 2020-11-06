package org.fasttrack.steps;

import net.thucydides.core.annotations.Step;
import org.fasttrack.pages.AdminPage;
import org.fasttrack.pages.CartPage;
import org.fasttrack.pages.HomePage;
import org.fasttrack.pages.LoginPage;

public class AdminSteps {
    private AdminPage adminPage;
    private HomepageSteps homepageSteps;
@Step
    public void goToDashboard(){
    adminPage.clickDashboardButton();}
    @Step
            public void goToProductSection(){
    adminPage.clickProductSection();}
    @Step
    public void addNewProduct(){adminPage.clickAddNewProduct(); }
    @Step
    public void addName(String name){
        adminPage.setProductNameField(name);

    }
    @Step
    public void addPrice(String regularPrice, String salePrice){
    adminPage.setRegularPriceField(regularPrice);
    adminPage.setSalePriceField(salePrice);
    adminPage.clickScheduleButton();
    }
    @Step
    public void setSalePeriod(String dateFrom, String dateTo){
    adminPage.setSaleFromField(dateFrom);
    adminPage.setSaleToField(dateTo);
    }
    @Step
    public void clickPublishButton(){adminPage.clickPublishButton();}
    @Step
    public void logoutAdmin(){adminPage.clickAdminLogoutLink();
adminPage.clickAdminLogoutButton();}
    @Step
    public void selectFromDropdownAction(){
    adminPage.selectDropdownValues();
    }
    @Step
    public void goToComments(String id){
    adminPage.clickCommentsLink();
    adminPage.setSearchCommenttField(id);
    adminPage.clickSearchCommentsButon();
    adminPage.selectDropdownValues();
    adminPage.clickApplyActionButton();

    }


}
