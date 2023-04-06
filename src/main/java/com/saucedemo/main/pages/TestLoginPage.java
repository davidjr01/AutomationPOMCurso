package com.saucedemo.main.pages;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.support.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

@DefaultUrl("https://www.saucedemo.com/")
public class TestLoginPage extends PageObject {

    @FindBy(xpath="//input[@id='user-name']")
    public WebElementFacade inputUserName;

    @FindBy(xpath="//input[@id='password']")
    public WebElementFacade inputPassword;

    @FindBy(xpath="//input[@id='login-button']")
    public WebElementFacade btnLogin;

    @FindBy (xpath="//div[@class='login_wrapper']")
    public WebElementFacade tituloLogin;

    public void ingresarCredencialesLogin(String username, String password) {
        inputUserName.sendKeys(username);
        inputPassword.sendKeys(password);

    }

    public void clickBtnLogin() {

        btnLogin.click();
    }


}