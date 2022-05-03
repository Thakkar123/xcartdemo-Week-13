package com.x_cart.mobile.pages;

import com.x_cart.mobile.utility.Utility;
import org.openqa.selenium.By;

public class NewPage extends Utility {

    By newPage = By.xpath("//h1[contains(text(),'New arrivals')]");



        public String getNewPageText(){
            return getTextFromElement(newPage);
        }


}


