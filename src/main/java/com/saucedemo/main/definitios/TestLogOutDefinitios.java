package com.saucedemo.main.definitios;
import com.saucedemo.main.steps.TestLogOutSteps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class TestLogOutDefinitios {

    @Steps
    TestLogOutSteps testLogOutSteps;
    @Given("que el usuario de click al menu")
    public void queElUsuarioDeClickAlMenu() {
        testLogOutSteps.ClickMenu();

    }
    @When("el usuario de clik a la opcion logout")
    public void elUsuarioDeClikALaOpcionLogout() {
        testLogOutSteps.ClickLogOout();
    }
    @Then("verificar que estemas en la pagina del login {string}")
    public void verificarQueEstemasEnLaPaginaDelLogin(String valor) {

        testLogOutSteps.ValidarPL(valor);

    }
}
