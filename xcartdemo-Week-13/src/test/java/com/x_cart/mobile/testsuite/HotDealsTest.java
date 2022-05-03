package com.x_cart.mobile.testsuite;

import com.x_cart.mobile.pages.BestSellerPage;
import com.x_cart.mobile.pages.HomePage;
import com.x_cart.mobile.pages.SalePage;
import com.x_cart.mobile.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HotDealsTest extends TestBase {

        HomePage homePage = new HomePage();
        SalePage salePage = new SalePage();
        BestSellerPage bestsellerpage = new BestSellerPage();
    @Test
        public void verifySaleProductsArrangeAlphabetically(){
        //1.1 Mouse hover on the “Hot deals” link
        homePage.mouseHoverOnHotDealsTab();
        //1.2 Mouse hover on the “Sale”  link and click
        homePage.clickOnSaleLink();
        //1.3 Verify the text “Sale”
        String actualSalePageText = salePage.getSalePageText();
        Assert.assertEquals(actualSalePageText,"Sale","error");
        //1.4 Mouse hover on “Sort By” and select “Name A-Z”
        salePage.mouseHoverOnSortBy();
        salePage.mouseHoverAndClickOnNameAToZ();
        // 1.5 Verify that the product arrange alphabetically
        String actualNameAToZText= salePage.getNameAToZText();
        Assert.assertEquals(actualNameAToZText,"Name A - Z","error");
    }
    @Test
        public void verifySaleProductsPriceArrangeLowToHigh(){
        //2.1 Mouse hover on the “Hot deals” link
        homePage.mouseHoverOnHotDealsTab();
        //2.2 Mouse hover on the “sales”  link and click
        homePage.clickOnSaleLink();
        //	2.3 Verify the text “sales”
        String actualSalePageText = salePage.getSalePageText();
        Assert.assertEquals(actualSalePageText,"Sale","error");
        // 2.4 Mouse hover on “Sort By” and select “Price Low-High”
        salePage.mouseHoverOnSortBy();
        salePage.mouseHoverAndClickOnPriceHighToLow();
        // 2.5 Verify that the product’s price arrange Low to High
        String actualPriceHighToLowText= salePage.getPriceHighToLowText();
        Assert.assertEquals(actualPriceHighToLowText,"Price Low - High","error");
     }

     @Test
        public void verifySaleProductsArrangeByRates(){
        // 3.1 Mouse hover on the “Hot deals” link
         homePage.mouseHoverOnHotDealsTab();
        // 3.2 Mouse hover on the “Sale”  link and click
         homePage.clickOnSaleLink();
        // 3.3 Verify the text “Sale”
         String actualSalePageText = salePage.getSalePageText();
         Assert.assertEquals(actualSalePageText,"Sale","error");
        // 3.4 Mouse hover on “Sort By” and select “Rates”
         salePage.mouseHoverOnSortBy();
         salePage.mouseHoverAndClickOnRates();
         //3.5 Verify that the product’s arrange Rates
         String actualRatesText= salePage.getRatesText();
         Assert.assertEquals(actualRatesText,"Rates","error");
     }

     @Test

        public void verifyBestSellersProductsArrangeByZToA(){
         //1.1 Mouse hover on the “Hot deals” link
         homePage.mouseHoverOnHotDealsTab();
         //1.2 Mouse hover on the “Bestsellers”  link and click
         homePage.clickOnBestSellerLink();
         //1.3 Verify the text “Bestsellers”
         String actualBestSellerText = bestsellerpage.getBestSellerText();
         Assert.assertEquals(actualBestSellerText,"Bestsellers","error");
         //1.4 Mouse hover on “Sort By” and select “Name Z-A”
         bestsellerpage.mouseHoverOnSortBy();
         bestsellerpage.mouseHoverAndClickOnNameZToA();
         //1.5 Verify that the product arrange by Z to A
          String actualNameZToAText = bestsellerpage.getNameZToAText();
          Assert.assertEquals(actualNameZToAText,"Name Z - A","error");
     }
@Test

        public void verifyBestSellersProductsPriceArrangeHighToLow(){

            //2.1 Mouse hover on the “Hot deals” link
            homePage.mouseHoverOnHotDealsTab();
            //2.2 Mouse hover on the “Bestsellers” link and click
            homePage.clickOnBestSellerLink();
            //2.3 Verify the text “Bestsellers”
            String actualBestSellerText = bestsellerpage.getBestSellerText();
            Assert.assertEquals(actualBestSellerText,"Bestsellers","error");
            // 2.4 Mouse hover on “Sort By” and select “Price High-Low”
            bestsellerpage.mouseHoverOnSortBy();
            bestsellerpage.mouseHoverAndClickOnPriceHighToLow();
            //2.5 Verify that the product’s price arrange High to Low
            String actualPriceHighToLowText = bestsellerpage.getPriceHighToLowText();
            Assert.assertEquals(actualPriceHighToLowText,"Price High - Low","error");
         }
 @Test
      public void verifyBestSellersProductsArrangeByRates(){
     //3.1 Mouse hover on the “Hot deals” link
     homePage.mouseHoverOnHotDealsTab();
     //3.2 Mouse hover on the “Bestsellers” link and click
     homePage.clickOnBestSellerLink();
     //3.3 Verify the text “Bestsellers”
     String actualBestSellerText = bestsellerpage.getBestSellerText();
     Assert.assertEquals(actualBestSellerText,"Bestsellers","error");
     // 3.4 Mouse hover on “Sort By” and select “Rates”
     bestsellerpage.mouseHoverOnSortBy();
     bestsellerpage.mouseHoverAndClickOnRates();
     //3.5 Verify that the product’s arrange Rates
     String actualRatesText = bestsellerpage.getRatesText();
     Assert.assertEquals(actualRatesText,"Rates","error");
 }

}
