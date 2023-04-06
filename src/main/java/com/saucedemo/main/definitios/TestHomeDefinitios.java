package com.saucedemo.main.definitios;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import  com.saucedemo.main.steps.TestHomeSteps;

public class TestHomeDefinitios {
    @Steps
    TestHomeSteps testHomeSteps;


    @Given("que el usuario agregue el producto al carrito de compras")
    public void QueElUsuarioAgregueElProductoAlCarritoDeComprars() {

        testHomeSteps.AgregarProducto();
    }
    @When("click al boton  carrito de compras")
    public void ClickAlBotonCarritoDeComprars() {
        testHomeSteps.CarritoDeComparas();
    }
    @When("verificar que estemos en la pagina del carrito de compras {string}")
    public void verificarQueEstemosEnLaPaginaDelCarritoDeCompras(String valor) {
        testHomeSteps.ValidarPagina(valor);
    }
    @When("validamos que el producto se encuentre en el carrito {string}")
    public void validamosQueElProductoSeEncuentreEnElCarrito(String Valor) {
        testHomeSteps.ValidarProducto(Valor);
    }
    @Then("eliminamos el producto del carrito y regresamos al home")
    public void eliminamosElProductoDelCarrito() {
        testHomeSteps.EliminarProducto();

    }



}
