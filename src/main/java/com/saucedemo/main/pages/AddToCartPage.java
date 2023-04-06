package com.saucedemo.main.pages;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.support.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class AddToCartPage extends PageObject {

    @FindBy (xpath="//button[@id='remove-sauce-labs-backpack']")
    public WebElementFacade remove1;

    @FindBy (xpath="//button[@id='continue-shopping']")
    public WebElementFacade regresar;

    @FindBy (xpath="//span[@class='title']")
    public WebElementFacade tituloCarrito;

    @FindBy (xpath="//div[@class='inventory_item_name']")
    public WebElementFacade tituloProducto;

    public void EliminarProducto() {
        remove1.click();
        regresar.click();

    }

}
