package com.saucedemo.main.definitios;

import com.saucedemo.main.steps.TestFiltroSteps;
import net.thucydides.core.annotations.Steps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestFiltroStringDefinitios {
    @Steps
    TestFiltroSteps testFiltroSteps;
    @Given("Se de click a la seccion de filtracion")
    public void seDeClickALaSeccionDeFiltracion() {
        testFiltroSteps.SelecionFiltro();


    }
    @When("filtrar busqueda por nombre de producto  {string}")
    public void filtrarBusquedaPorNombreDeProducto(String valor) {
        testFiltroSteps.Filtrar2(valor);
    }
    @Then("Validamos que se haya filtrado de forma alfabetica {string}")
    public void validamosQueSeHayaFiltradoDeFormaAlfabetica(String valor) {
        testFiltroSteps.Validar2(valor);
    }
}
