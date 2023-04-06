package com.saucedemo.main.definitios;

import com.saucedemo.main.steps.TestFiltroSteps;
import com.saucedemo.main.steps.TestHomeSteps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class TestFiltroDefinitios {
    @Steps
    TestFiltroSteps testFiltroSteps;

    @Given("que el usuario de click a la seccion de filtracion")
    public void queElUsuarioDeClickALaSeccionDeFiltracion() {
        testFiltroSteps.SelecionFiltro();
    }
    @When("filtrar busqueda por precio {string}")
    public void filtrarBusquedaPorPrecio(String valor) {
        testFiltroSteps.Filtrar1(valor);
    }

    @Then("Validamos que se haya filtrado de forma correcta {string}")
    public void validamosQueSeHayaFiltradoDeFormaCorrecta(String valor) {
        testFiltroSteps.Validar(valor);
    }

}
