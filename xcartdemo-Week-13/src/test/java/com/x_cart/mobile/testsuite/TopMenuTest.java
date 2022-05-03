package com.x_cart.mobile.testsuite;

import com.x_cart.mobile.pages.*;
import com.x_cart.mobile.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TopMenuTest extends TestBase {

    HomePage homePage = new HomePage();
    ShippingPage shippingpage = new ShippingPage();
    NewPage newpage = new NewPage();
    ComingSoonPage comingsoonpage = new ComingSoonPage();
    ContactUsPage contactuspage = new ContactUsPage();

    @Test
    public void verifyUserShouldNavigateToShippingPageSuccessfully(){
        homePage.clickOnShippingLink();
        String actualShippingPageText =shippingpage.getShippingPageText();
        Assert.assertEquals(actualShippingPageText,"Shipping","error");
    }
    @Test
    public void verifyUserShouldNavigateToNewPageSuccessfully(){
        homePage.clickOnNewPageLink();
        String actualNewPageText = newpage.getNewPageText();
        Assert.assertEquals(actualNewPageText,"New arrivals","error");
    }
    @Test
    public void verifyUserShouldNavigateToComingSoonPageSuccessfully(){
        homePage.clickOnComingSoonPageLink();
        String actualComingSoonPageText = comingsoonpage.getComingSoonPageText();
        Assert.assertEquals(actualComingSoonPageText,"Coming soon","error");
    }
    @Test
    public void verifyUserShouldNavigateToContactUsPageSuccessfully(){
        homePage.clickOnContactUsPageLink();
        String actualContactUsPageText = contactuspage.getContactUsPageText();
        Assert.assertEquals(actualContactUsPageText,"Contact us","error");
    }
}
