package com.saucedemo.main.steps;

import com.saucedemo.main.pages.HomePage;
import com.saucedemo.main.pages.AddToCartPage;
import com.saucedemo.main.util.GeneralUtil;
import org.fluentlenium.core.annotation.Page;
import org.hamcrest.MatcherAssert;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestHomeSteps {
    private static final Logger LOGGER= LoggerFactory.getLogger(TestLoginSteps.class);
    @Page
    HomePage homePage;

    @Page
    AddToCartPage addToCartPage;

    public void AgregarProducto() {

        homePage.AgregarProducto();
    }

    public void CarritoDeComparas() {
        homePage.CarritoDeComparas();
    }

    public void EliminarProducto() {
        addToCartPage.EliminarProducto();
    }

    public void ValidarPagina(String valor) {
        String s= GeneralUtil.formatMessageInformation("Validar la pagina");
        LOGGER.info(s);
        MatcherAssert.assertThat("Se valido la pagina",valor.contains(addToCartPage.tituloCarrito.getText()));
    }

    public void ValidarProducto(String valor) {
        String s= GeneralUtil.formatMessageInformation("Validar Producto");
        LOGGER.info(s);
        MatcherAssert.assertThat("Se valido el producto",valor.contains(addToCartPage.tituloProducto.getText()));
    }
}
