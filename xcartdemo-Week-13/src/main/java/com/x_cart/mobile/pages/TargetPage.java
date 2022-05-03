package com.x_cart.mobile.pages;

import com.x_cart.mobile.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class TargetPage extends Utility {

    By viewCartVerifyText = By.xpath("//h1[@id='page-title']");
    By subTotal = By.xpath("(//span[@class='part-integer'][normalize-space()='299'])[4]");
    By total = By.xpath("//ul[@class='totals']/li[4]/child::span/descendant::span[@class='surcharge-cell']/child::span");
    By goToCheckoutButton = By.xpath("(//button[contains(@class,'regular-button regular-main-button checkout')])[1]");
    By loginToYoyAccountText = By.xpath("//h3[contains(text(),'Log in to your account')]");
    By emailTextBox = By.id("email");
    By continueButton = By.xpath("(//button[contains(@class,'regular-button anonymous-continue-button submit')])[1]");
    By secureCheckoutText = By.xpath("(//h1[normalize-space()='Secure Checkout'])[1]");

    By firstNameField = By.id("shippingaddress-firstname");
    By lastNameField = By.id("shippingaddress-lastname");
    By addressField = By.id("shippingaddress-street");
    By cityField = By.id("shippingaddress-city");
    By countryField = By.id("shippingaddress-country-code");
    By stateField =By.id("shippingaddress-custom-state");
    By createProfileCheckBox= By.id("create_profile");
    By passwordField = By.id("password");
    By zipCodeField = By.id("shippingaddress-zipcode");
    By localShippingRadioButton = By.id("method128");
    By codRadioButton = By.id("pmethod6");
    By totalAmountAfterShippingCostText = By.xpath("(//span[normalize-space()='Place order: $311.03'])[1]");
    By placeOrderButton = By.xpath("//button[contains(@class,'btn regular-button regular-main-button place-order submit')]");
    By thankYouForOrderText = By.id("page-title");
    By emptyCartButton = By.xpath("(//a[normalize-space()='Empty your cart'])[1]");
    By itemDeletedFromCart = By.xpath("//li[@class='info']");
    By yourCartIsEmpty = By.xpath("//h1[@id='page-title']");


    public String getViewCartVerifyText(){
        return getTextFromElement(viewCartVerifyText);
    }

    public String getSubTotalText(){
        return getTextFromElement(subTotal);
    }
    public String getVerifyTotal(){
        List<WebElement> actualTotalList = getTheListOfElement(total);
        //create the object of stringbuilder
        StringBuilder strbulTotal = new StringBuilder();
        for(WebElement totalList : actualTotalList)
        {
            //append all the list in strbul
            strbulTotal.append(totalList.getText());
        }
        //coverted the stringbuilder to string
        String actualTotal = strbulTotal.toString();
        return actualTotal;
    }
public void clickOnGoToCheckoutButton(){
        clickOnElement(goToCheckoutButton);
}

public String getLoginToYourAccountText(){
        return getTextFromElement(loginToYoyAccountText);
}
public void enterEmailAddress(String email){
        sendTextToElement(emailTextBox,email);
}
public void clickOnContinueButton(){
        clickOnElement(continueButton);
}
public String getSecureCheckoutText(){
        return getTextFromElement(secureCheckoutText);

}

    public void enterFirstName(String text){
        sendTextToElement(firstNameField,text);
    }

    public void enterLastName(String text){
        sendTextToElement(lastNameField,text);
    }
    public void enterAddressName(String text){
        sendTextToElement(addressField,text);
    }
    public void enterCityName(String city){
        sendTextToElement(cityField,city);
    }

    public void selectCountryFromDropDown(String text){
        selectByValueFromDropDown(countryField,text);
    }

    public void enterState(String text){
        sendTextToElement(stateField,text);
    }

    public void enterZipCode(String code){
        sendTextToElement(zipCodeField,code);
    }

    public void clickOnCreateProfileCheckBox(){
        clickOnElement(createProfileCheckBox);
    }
    public void enterPassword(String text){
        sendTextToElement(passwordField,text);
    }

    public void clickOnLocalShippingRadioButton(){
        clickOnElement(localShippingRadioButton);
    }
    public void clickOnCodRadioButton(){
        clickOnElement(codRadioButton);
    }
    public String getTotalAmountAfterShippingCostText(){
        return getTextFromElement(totalAmountAfterShippingCostText);
    }
    public void clickOnPlaceOrderButton(){
        clickOnElement(placeOrderButton);
    }
    public String getThankYouForOrderText(){
        return getTextFromElement(thankYouForOrderText);
    }

    public void clickOnEmptyCartButton(){
        clickOnElement(emptyCartButton);
    }
    public String getItemDeletedFromCartText(){
        return getTextFromElement(itemDeletedFromCart);
    }
    public String geYourCartIsEmptyText(){
        return getTextFromElement(yourCartIsEmpty);
    }
}
