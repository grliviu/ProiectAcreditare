package org.fasttrack.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

import java.util.List;



@DefaultUrl("http://qa2.fasttrackit.org:8008/wp-admin/index.php")
public class AdminPage extends PageObject {
    @FindBy(css = "#menu-posts-product > a > div.wp-menu-name")
    private WebElementFacade productSection;
    @FindBy(css = "#wpbody-content > div.wrap > a:nth-child(2)")
    private WebElementFacade addNewProductButton;
    @FindBy(css = "#title")
    private WebElementFacade productNameField;
    @FindBy(css = "#tinymce > p")
    private WebElementFacade descriptionField;
    @FindBy(css = "#_regular_price")
    private WebElementFacade regularPriceField;
    @FindBy(css = "#_sale_price")
    private WebElementFacade salePriceField;
    @FindBy(css = "#general_product_data > div.options_group.pricing.show_if_" +
            "simple.show_if_external.hidden > p.form-field._sale_price_field > span > a")
    private WebElementFacade scheduleButton;
    @FindBy(css = "#_sale_price_dates_from")
    private WebElementFacade saleFromField;
    @FindBy(css = "#_sale_price_dates_to")
    private WebElementFacade saleToField;
   @FindBy(css = "#publish")
    private WebElementFacade publishButton;
   @FindBy(css = "#wp-admin-bar-site-name > a" )
   private WebElementFacade dashboardButton;

    @FindBy(css = "#wp-admin-bar-my-account > a > span")
    private WebElementFacade adminLogoutLink;
    @FindBy(css = "#wp-admin-bar-logout > a")
    private WebElementFacade adminLooutButton;
    @FindBy(css = "#menu-comments > a > div.wp-menu-name")
    private WebElementFacade commentsLink;
    @FindBy(css = "#bulk-action-selector-top")
    private WebElementFacade commentAdminActions;
    @FindBy(css = "#comment-search-input")
    private WebElementFacade searchCommentField;
    @FindBy(css  = "#search-submit")
    private WebElementFacade searchCommentsButton;
    @FindBy(css = "#doaction")
    private WebElementFacade applyActionButton;


    public void  selectDropdownValues(){
        commentAdminActions.selectByValue("approve");
        clickOn(commentAdminActions);
    }
        public void clickCommentsLink(){clickOn(commentsLink);}
        public void setSearchCommenttField(String id){typeInto(searchCommentField, id);}
        public void clickSearchCommentsButon(){clickOn(searchCommentsButton);}
        public void clickApplyActionButton(){clickOn(applyActionButton);}

    public void clickAdminLogoutLink(){clickOn(adminLogoutLink);}
    public void clickAdminLogoutButton(){clickOn(adminLooutButton);}


   public void clickDashboardButton(){clickOn(dashboardButton);}
   public void clickProductSection(){clickOn(productSection);}
   public void clickAddNewProduct(){clickOn(addNewProductButton);}
   public void setProductNameField(String name){typeInto(productNameField, name);}
   public void setDescriptionField(String description){typeInto(descriptionField, description);}
   public void setRegularPriceField(String price){typeInto(regularPriceField, price);}
   public void setSalePriceField(String salePrice){typeInto(salePriceField, salePrice);}
   public void clickScheduleButton(){clickOn(scheduleButton);}
   public void setSaleFromField(String saleFrom){typeInto(saleFromField, saleFrom);}
   public void setSaleToField(String saleTo){typeInto(saleToField, saleTo);}
   public void clickPublishButton(){clickOn(publishButton);}
}
