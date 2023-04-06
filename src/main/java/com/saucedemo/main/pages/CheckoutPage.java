package com.saucedemo.main.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class CheckoutPage extends PageObject {

    @FindBy(xpath="//button[@id='checkout']")
    public WebElementFacade bt_checkout;

    @FindBy(xpath="//span[@class='title']")
    public WebElementFacade titulo;
    @FindBy(xpath="//span[@class='title']")
    public WebElementFacade titulo2;

    @FindBy(xpath="//input[@id='first-name']")
    public WebElementFacade firstN;
    @FindBy(xpath="//input[@id='last-name']")
    public WebElementFacade lastN;
    @FindBy(xpath="//input[@id='postal-code']")
    public WebElementFacade ZipC;

    @FindBy(xpath="//input[@id='continue']")
    public WebElementFacade btn_continue;

    @FindBy(xpath="//button[@id='finish']")
    public WebElementFacade btn_Finish;

    @FindBy(xpath="//button[@id='back-to-products']")
    public WebElementFacade backHome;

    public void Checkout() {
        bt_checkout.click();
    }

    public void credenciales(String fname, String lname, String zcode) {
        firstN.sendKeys(fname);
        lastN.sendKeys(lname);
        ZipC.sendKeys(zcode);
    }

    public void Continue() {
        btn_continue.click();
    }

    public void Finish() {
        btn_Finish.click();
    }
}
