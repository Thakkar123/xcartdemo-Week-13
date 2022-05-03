package com.x_cart.mobile.pages;

import com.x_cart.mobile.utility.Utility;
import org.openqa.selenium.By;

public class BestSellerPage extends Utility {

    By bestSellerText = By.xpath("//h1[contains(text(),'Bestsellers')]");
    By sortBy = By.xpath("//span[@class='sort-by-label']");
    By nameZToA = By.xpath("//a[contains(text(),'Name Z - A')]");
    By nameZToAText = By.xpath("//span[contains(text(),'Name Z - A')]");
    By priceHighToLow = By.xpath("//a[contains(text(),'Price High - Low')]");
    By priceHighToLowText = By.xpath("//span[contains(text(),'Price High - Low')]");
    By rates = By.xpath("//a[contains(text(),'Rates')]");
    By ratesText = By.xpath("//span[contains(text(),'Rates')]");
    By nameAToZ = By.xpath("//a[contains(text(),'Name A - Z')]");
    By appleIphoneProduct = By.xpath("//ul[@class='products-grid grid-list']/li[1]");
    By addToCartButton = By.xpath("//button[contains(@class,'regular-button add-to-cart product-add2cart productid-42')]//span[contains(text(),'Add to cart')]");
    By addToCartProductSuccessText = By.xpath("//li[contains(text(),'Product has been added to your cart')]");
    By closeButton = By.cssSelector(".close");
    By yourCartButton = By.xpath("//div[@title='Your cart']");
    By viewCartButton = By.xpath("(//a[@class='regular-button cart'])[1]");



    public String getBestSellerText(){

    return getTextFromElement(bestSellerText);
    }
    public void mouseHoverOnSortBy(){
        mouseHoverToElement(sortBy);
    }
    public void mouseHoverAndClickOnNameZToA(){
        mouseHoverToElementAndClick(nameZToA);
    }
    public String getNameZToAText(){
        return getTextFromElement(nameZToAText);
    }
    public void mouseHoverAndClickOnPriceHighToLow(){
        mouseHoverToElementAndClick(priceHighToLow);
    }
    public String getPriceHighToLowText(){
        return getTextFromElement(priceHighToLowText);
    }

    public void mouseHoverAndClickOnRates(){
        mouseHoverToElementAndClick(rates);
    }
    public String getRatesText(){
        return getTextFromElement(ratesText);
    }
    public void mouseHoverAndClickOnNameAToZ(){
        mouseHoverToElementAndClick(nameAToZ);
    }
    public void mouseHoverOnAppleIphone(){
        mouseHoverToElement(appleIphoneProduct);
    }
    public void mouseHoverAndClickOnAddToCartButton(){
        mouseHoverToElementAndClick(addToCartButton);
    }
    public String getAddToCartProductSuccessText(){
        return getTextFromElement(addToCartProductSuccessText);
    }
    public void clickOnCloseButton(){
        clickOnElement(closeButton);
    }
    public void clickOnYourCartButton(){
        clickOnElement(yourCartButton);
    }
    public void clickOnViewCartButton(){
        clickOnElement(viewCartButton);
    }



}
