package com.x_cart.mobile.pages;

import com.x_cart.mobile.utility.Utility;
import org.openqa.selenium.By;

public class SalePage extends Utility {

    By salePageText = By.xpath("//h1[contains(text(),'Sale')]");
    By sortBy = By.xpath("//span[@class='sort-by-label']");
    By priceHighToLow = By.xpath("//a[contains(text(),'Price Low - High')]");
    By priceHighToLowText = By.xpath("//span[contains(text(),'Price Low - High')]");
    By priceNameAToZ = By.xpath("//a[contains(text(),'Name A - Z')]");
    By priceNameAToZText = By.xpath("//span[contains(text(),'Name A - Z')]");
    By rates = By.xpath("//a[contains(text(),'Rates')]");
    By ratesText = By.xpath("//span[contains(text(),'Rates')]");

    public String getSalePageText(){
        return getTextFromElement(salePageText);
    }
    public void mouseHoverOnSortBy(){
        mouseHoverToElement(sortBy);
    }
    public void mouseHoverAndClickOnPriceHighToLow(){
        mouseHoverToElementAndClick(priceHighToLow);
    }
    public String getPriceHighToLowText(){
        return getTextFromElement(priceHighToLowText);
    }

    public void mouseHoverAndClickOnNameAToZ(){
        mouseHoverToElementAndClick(priceNameAToZ);
    }
    public String getNameAToZText(){
        return getTextFromElement(priceNameAToZText);
    }

    public void mouseHoverAndClickOnRates(){
        mouseHoverToElementAndClick(rates);
    }
    public String getRatesText(){
        return getTextFromElement(ratesText);
    }
}
