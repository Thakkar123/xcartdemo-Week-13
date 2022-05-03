package com.x_cart.mobile.pages;

import com.x_cart.mobile.utility.Utility;
import org.openqa.selenium.By;

public class ShippingPage extends Utility {

    By shippingPage = By.xpath("//h1[contains(text(),'Shipping')]");

    public String getShippingPageText(){
        return getTextFromElement(shippingPage);
    }
}
