package org.fasttrack.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

import java.util.List;
import java.util.function.Predicate;

import static io.vavr.Predicates.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

@DefaultUrl("http://qa2.fasttrackit.org:8008/")
public class CartPage extends PageObject {

    @FindBy(css = "#menu-item-66 > a")
    private WebElementFacade shopLink;

    @FindBy(css = "#primary > main > div > div > div.item.post-19.product.type-product.status-publish." +
            "has-post-thumbnail.product_cat-accessories.last.instock.sale.taxable.shipping" +
            "-taxable.purchasable.product-type-simple > div > div.p-preview > div > a > img")
    private WebElementFacade selectProduct;
    @FindBy(css = "#quantity_5f9c779c3781b")
    private WebElementFacade selectQuantity;
    @FindBy(css = "#product-19 > div.summary.entry-summary > form > button")
    private WebElementFacade addToCartButton;
    @FindBy(css = "#masthead > div > div.header-top.cl > div.header-cart > a > i")
    private WebElementFacade cartButton;
    @FindBy(css = "#quantity_5f9c779c3781b")
    private WebElementFacade clearDefaultQuantity;
    @FindBy(css = "#tab-title-reviews > a")
    private WebElementFacade reviewsButton;
    @FindBy(css = "#comment")
    private WebElementFacade addComment;
    @FindBy(css = "#submit")
    private WebElementFacade submitButton;
    @FindBy(css = "#product-19")
    private WebElementFacade saleMessage;
    @FindBy(css = "#primary > form > select")
    private WebElementFacade selectProductCategory;
    @FindBy(css = "#primary > main > div.woocommerce-message")
    private WebElementFacade verifyProductIsAddedToCart;
    @FindBy(css = "#commentform > div > p > span > a.star-3")
    private WebElementFacade addRating;
    @FindBy(css = "#recent-comments-2 > h3")
    private WebElementFacade recentCommnetsLink;
    @FindBy(css = "#recentcomments")
    private List<WebElementFacade> listOfItems;

    public boolean findItemInList(String itemName){
        for(WebElementFacade element : listOfItems){
            if(element.findElement(By.cssSelector(" #recentcomments li")).getText().contains(itemName)){
                return true;
            }
        }
        return false;
    }



    public void clickRecentCommentsLink(){clickOn(recentCommnetsLink);}

    public void verifyProductIsAddedToCart(){
        verifyProductIsAddedToCart.shouldContainText("Beanie” has been added to your cart.");
    }
   public void clickAddRating(){clickOn(addRating);}


    public void clickShopLink(){clickOn((shopLink)); }
    public void clickProduct(){clickOn(selectProduct); }
    public void setProductsQuantity(String quantity){typeInto(selectQuantity, quantity);}
    public void clickAddToCartButton(){clickOn(addToCartButton);}
    public void clickCartButton(){clickOn(cartButton);}
    public void setClearDefaultQuantity(){clearDefaultQuantity.clear();}
    public void clickReviewsButton(){clickOn(reviewsButton);}
    public void setCommentField(String comment){typeInto(addComment, comment);}
    public void clickSubmitButton(){clickOn(submitButton);}
    public void verifySaleMessage(){saleMessage.containsText("Sale!");}


    }




