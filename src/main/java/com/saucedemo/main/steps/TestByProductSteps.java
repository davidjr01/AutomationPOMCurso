package com.saucedemo.main.steps;

import com.saucedemo.main.pages.CheckoutPage;

import org.fluentlenium.core.annotation.Page;
import org.hamcrest.MatcherAssert;

public class TestByProductSteps {
    @Page
    CheckoutPage checkoutPage;
    public void Checkout() {
        checkoutPage.Checkout();
    }

    public void Asegurarse(String valor) {
        MatcherAssert.assertThat("se valido correctamente",valor.contains(checkoutPage.titulo.getText()));
    }

    public void Credenciales(String fname, String lname, String zcode) {
        checkoutPage.credenciales(fname,lname,zcode);
    }

    public void Continue() {
        checkoutPage.Continue();
    }

    public void Finish() {
        checkoutPage.Finish();
    }

    public void CompraValida(String valor) {
        MatcherAssert.assertThat("se valido correctamente",valor.contains(checkoutPage.titulo2.getText()));
        checkoutPage.backHome.click();

    }
}
