package com.saucedemo.main.definitios;

import com.saucedemo.main.steps.TestByProductSteps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;


public class TestByProductDefinitios {
    @Steps
    TestByProductSteps testByProductSteps;

    @Given("Que el usuario de click en el boton Checkout")
    public void queElUsuarioDeClickEnElBotonCheckout() {
        testByProductSteps.Checkout();

    }
    @When("Asegurarse que este en la pagina para credenciales {string}")
    public void asegurarseQueEsteEnLaPaginaParaCredenciales(String valor) {
        testByProductSteps.Asegurarse(valor);
    }
    @When("Que el usuario ingrese sus credenciales {string} {string},{string}")
    public void queElUsuarioIngreseSusCredenciales(String Fname, String Lname, String Zcode) {
        testByProductSteps.Credenciales(Fname, Lname, Zcode);

    }
    @When("click en el boton CONTINUE")
    public void clickEnElBotonCONTINUE() {
        testByProductSteps.Continue();

    }
    @When("click en el boton FINISH")
    public void clickEnElBotonFINISH() {
        testByProductSteps.Finish();
    }
    @Then("validar que se realizo la compra {string}")
    public void validarQueSeRealizoLaCompra(String valor) {
        testByProductSteps.CompraValida(valor);

    }
}
