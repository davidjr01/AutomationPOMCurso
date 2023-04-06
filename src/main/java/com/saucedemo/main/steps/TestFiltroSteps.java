package com.saucedemo.main.steps;

import com.saucedemo.main.pages.HomePage;
import org.fluentlenium.core.annotation.Page;
import com.saucedemo.main.util.GeneralUtil;
import org.hamcrest.MatcherAssert;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestFiltroSteps {

    private static final Logger LOGGER= LoggerFactory.getLogger(TestLoginSteps.class);
    @Page
    HomePage homePage;
    public void SelecionFiltro() {
        homePage.SeleccionFiltro();
    }

    public void Filtrar1(String valor) {
        homePage.Filtrar(valor);
        GeneralUtil.explicitWait(1000L);
    }

    public void Filtrar2(String valor) {
        homePage.Filtrar(valor);
        GeneralUtil.explicitWait(1000L);
    }

    public void Validar(String valor) {
        String s=GeneralUtil.formatMessageInformation("Validando el correcto funcionamiento del Filtro");
        LOGGER.info(s);
        MatcherAssert.assertThat("se realizo correctamente la filtracion ",valor.contains(homePage.flagPrice));
    }


    public void Validar2(String valor) {
        String s=GeneralUtil.formatMessageInformation("Validando el correcto funcionamiento del Filtro");
        LOGGER.info(s);
        MatcherAssert.assertThat("se realizo correctamente la filtracion ",valor.contains(homePage.flagTittle));
    }
}
