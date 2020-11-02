package org.fasttrack.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

import java.util.function.Predicate;

import static io.vavr.Predicates.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

@DefaultUrl("http://qa2.fasttrackit.org:8008/")
public class CartPage extends PageObject {

    @FindBy(css = "#menu-item-66 > a")
    private WebElementFacade shopLink;

    @FindBy(css = "#primary > ul > li.item-prod-wrap.wow.flipInY.post-19.product.type" +
            "-product.status-publish.has-post-thumbnail.product_cat-accessories.instock.sale.taxable" +
            ".shipping-taxable.purchasable.product-type-simple" +
            " > div.collection_combine.item-img > a > img")
    private WebElementFacade selectProduct;
    @FindBy(css = "#quantity_5f9c779c3781b")
    private WebElementFacade selectQuantity;
    @FindBy(css = "#product-27 > div.summary.entry-summary > form > button")
    private WebElementFacade addToCartButton;
    @FindBy(css = "#masthead > div.main-header > div > div.right-links > div.cart-box > a > div > i")
    private WebElementFacade cartButton;
    @FindBy(css = "#quantity_5f9c779c3781b")
    private WebElementFacade clearDefaultQuantity;
    @FindBy(css = "#primary > div.woocommerce-tabs.wc-tabs-wrapper.clear > ul > li.reviews_tab > a")
    private WebElementFacade reviewsButton;
    @FindBy(css = "#comment")
    private WebElementFacade addComment;
    @FindBy(css = "#submit")
    private WebElementFacade submitButton;
    @FindBy(css = "#product-19")
    private WebElementFacade saleMessage;
    @FindBy(css = "#primary > form > select")
    private WebElementFacade selectProductCategory;

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




