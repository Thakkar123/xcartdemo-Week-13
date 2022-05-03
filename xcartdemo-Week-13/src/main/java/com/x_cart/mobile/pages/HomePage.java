package com.x_cart.mobile.pages;

import com.x_cart.mobile.utility.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {

    By shippingLink = By.xpath("(//span[contains(text(),'Shipping')])[2]");
    By newPageLink = By.xpath("(//span[contains(text(),'New!')])[2]");
    By comingSoonLink = By.xpath("(//span[contains(text(),'Coming soon')])[2]");
    By contactUsLink = By.xpath("(//span[contains(text(),'Contact us')])[2]");
    By hotDealsTab = By.xpath("//ul[@class='nav navbar-nav top-main-menu']/li[2]");
    By saleLink = By.xpath("(//span[contains(text(),'Sale')])[2]");
    By bestSellerLink = By.xpath("(//span[contains(text(),'Bestsellers')])[2]");

    public void clickOnShippingLink() {
        clickOnElement(shippingLink);
    }
    public void clickOnNewPageLink(){
        clickOnElement(newPageLink);
    }
    public void clickOnComingSoonPageLink(){
        clickOnElement(comingSoonLink);
    }
    public void clickOnContactUsPageLink(){
        clickOnElement(contactUsLink);
    }
    public void mouseHoverOnHotDealsTab(){
        mouseHoverToElement(hotDealsTab);
    }
    public void clickOnSaleLink(){
        mouseHoverToElementAndClick(saleLink);
    }
    public void clickOnBestSellerLink(){
        mouseHoverToElementAndClick(bestSellerLink);
    }
}
