package com.x_cart.mobile.testsuite;

import com.x_cart.mobile.pages.BestSellerPage;
import com.x_cart.mobile.pages.HomePage;
import com.x_cart.mobile.pages.TargetPage;
import com.x_cart.mobile.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ShoppingTest extends TestBase {

    HomePage homePage = new HomePage();
    BestSellerPage bestsellerpage = new BestSellerPage();
    TargetPage targetpage = new TargetPage();

    @Test
    public void verifyThatUserShouldPlaceOrderSuccessfullyForOllieTheAppControlledRobot() throws InterruptedException {

        // 1.1 Mouse hover on the “Hot deals” link
        homePage.mouseHoverOnHotDealsTab();
        //  1.2 Mouse hover on the “Bestsellers”  link and click
        homePage.clickOnBestSellerLink();
        //1.3 Verify the text “Bestsellers”
        String actualBestSellerText = bestsellerpage.getBestSellerText();
        Assert.assertEquals(actualBestSellerText,"Bestsellers","error");
        //1.4 Mouse hover on “Sort By” and select “Name A-Z”
        bestsellerpage.mouseHoverOnSortBy();
        bestsellerpage.mouseHoverAndClickOnNameAToZ();
        //1.5 Click on “Add to cart” button of the product “iphone”
        bestsellerpage.mouseHoverOnAppleIphone();
        Thread.sleep(2000);
        bestsellerpage.mouseHoverAndClickOnAddToCartButton();
        // 1.6 Verify the message “Product has been added to your cart” display in  green bar
        String actualAddProductSuccessText = bestsellerpage.getAddToCartProductSuccessText();
        Assert.assertEquals(actualAddProductSuccessText,"Product has been added to your cart","error");
        //1.7 Click on X sign to close the message
        bestsellerpage.clickOnCloseButton();
        //1.8 Click on “Your cart” icon and Click on “View cart” button
        bestsellerpage.clickOnYourCartButton();
        Thread.sleep(2000);
        bestsellerpage.clickOnViewCartButton();
        //1.9 Verify the text “Your shopping cart - 1 item”
        String actualViewCartVerifyText = targetpage.getViewCartVerifyText();
        Assert.assertEquals(actualViewCartVerifyText,"Your shopping cart - 1 item","error");
        // 1.10 Verify the Subtotal $299.00
        String actualSubTotalText = targetpage.getSubTotalText();
        Assert.assertEquals(actualSubTotalText,"299","error");
        // 1.11 Verify the total $309.73
        String actualTotal = targetpage.getVerifyTotal();
        Assert.assertEquals(actualTotal,"$309.73","error");
        // 1.12 Click on “Go to checkout” button
        targetpage.clickOnGoToCheckoutButton();
        //1.13 Verify the text “Log in to your account”
        String actualLoginToYourAccountText = targetpage.getLoginToYourAccountText();
        Assert.assertEquals(actualLoginToYourAccountText,"Log in to your account","error");
        // 1.14 Enter Email address
        targetpage.enterEmailAddress("RameshPatel3400@gmail.com");
        // 1.15 Click on “Continue” Button
        targetpage.clickOnContinueButton();
        //1.16 Verify the text “Secure Checkout”
        String actualSecureCheckoutText = targetpage.getSecureCheckoutText();
        Assert.assertEquals(actualSecureCheckoutText,"Secure Checkout","error");
        // 1.17 Fill all the mandatory fields
        targetpage.enterFirstName("Ramesh");
        targetpage.enterLastName("Patel");
        targetpage.enterAddressName("123 High Street");
       // targetpage.enterCityName("London");
      //  targetpage.selectCountryFromDropDown("United Kingdon");
        targetpage.enterState("London");
      //  targetpage.enterZipCode("EC115QP");

        //1.18 Check the check box “Create an account for later use”
        targetpage.clickOnCreateProfileCheckBox();
        //1.19 Enter the password
        targetpage.enterPassword("Temp123");
        //1.20 Select the Delivery Method to “Local Shipping”
        targetpage.clickOnLocalShippingRadioButton();
        Thread.sleep(1000);
        // 1.21 Select Payment Method “COD”
        targetpage.clickOnCodRadioButton();
        // 1.22 Verify the total $311.03
        String actualTotalAmountAfterShippingCostText = targetpage.getTotalAmountAfterShippingCostText();
        Assert.assertEquals(actualTotalAmountAfterShippingCostText,"$311.03","error");
        // 1.23 Click on “Place Order” Button
        Thread.sleep(2000);
        targetpage.clickOnPlaceOrderButton();
        //1.24 Verify the text “Thank you for your order”
        String expectedThankYouForOrderText = "Thank you for your order";
        String actualThankYouForOrderText = targetpage.getThankYouForOrderText();
        Assert.assertEquals(actualThankYouForOrderText,expectedThankYouForOrderText,"error");
    }

    @Test
    public void verifyThatUserShouldClearShoppingCartSuccessfully() throws InterruptedException {

        // 1.1 Mouse hover on the “Hot deals” link
        homePage.mouseHoverOnHotDealsTab();
        //  1.2 Mouse hover on the “Bestsellers”  link and click
        homePage.clickOnBestSellerLink();
        //1.3 Verify the text “Bestsellers”
        String actualBestSellerText = bestsellerpage.getBestSellerText();
        Assert.assertEquals(actualBestSellerText,"Bestsellers","error");
        //1.4 Mouse hover on “Sort By” and select “Name A-Z”
        bestsellerpage.mouseHoverOnSortBy();
        bestsellerpage.mouseHoverAndClickOnNameAToZ();
        //1.5 Click on “Add to cart” button of the product “iphone”
        bestsellerpage.mouseHoverOnAppleIphone();
        Thread.sleep(2000);
        bestsellerpage.mouseHoverAndClickOnAddToCartButton();
        // 1.6 Verify the message “Product has been added to your cart” display in  green bar
        String actualAddProductSuccessText = bestsellerpage.getAddToCartProductSuccessText();
        Assert.assertEquals(actualAddProductSuccessText,"Product has been added to your cart","error");
        //1.7 Click on X sign to close the message
        bestsellerpage.clickOnCloseButton();
        //1.8 Click on “Your cart” icon and Click on “View cart” button
        bestsellerpage.clickOnYourCartButton();
        Thread.sleep(2000);
        bestsellerpage.clickOnViewCartButton();
        //1.9 Verify the text “Your shopping cart - 1 item”
        String actualViewCartVerifyText = targetpage.getViewCartVerifyText();
        Assert.assertEquals(actualViewCartVerifyText,"Your shopping cart - 1 item","error");
        //1.10 Click on “Empty your cart” link
        targetpage.clickOnEmptyCartButton();
        //1.11 Verify the text “Are you sure you want to clear your cart?” on alert
        switchToAlert();
        String expectedAlertMessage = "Are you sure you want to clear your cart?";
        String actualAlertMessage=getTextFromAlert();
        Assert.assertEquals(actualAlertMessage,expectedAlertMessage,"error");
        //1.12 Click “Ok” on alert
        acceptAlert();
        Thread.sleep(1000);
        //1.13 Verify the message “Item(s) deleted from your cart”
        String actualItemDeletedText = targetpage.getItemDeletedFromCartText();
        Assert.assertEquals(actualItemDeletedText,"Item(s) deleted from your cart","error");
        //1.14 Verify the text “Your cart is empty”
        String actualCartEmptyText = targetpage.geYourCartIsEmptyText();
        Assert.assertEquals(actualCartEmptyText,"Your cart is empty");
    }
}
