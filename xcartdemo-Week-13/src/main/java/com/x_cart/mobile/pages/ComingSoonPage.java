package com.x_cart.mobile.pages;

import com.x_cart.mobile.utility.Utility;
import org.openqa.selenium.By;

public class ComingSoonPage extends Utility {

    By comingSoonPage = By.xpath("//h1[contains(text(),'Coming soon')]");

    public String getComingSoonPageText(){
        return getTextFromElement(comingSoonPage);
    }
}
