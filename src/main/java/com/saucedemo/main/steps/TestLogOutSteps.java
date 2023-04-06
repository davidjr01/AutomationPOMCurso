package com.saucedemo.main.steps;

import com.saucedemo.main.pages.HomePage;
import com.saucedemo.main.pages.TestLoginPage;
import com.saucedemo.main.util.GeneralUtil;
import org.fluentlenium.core.annotation.Page;
import org.hamcrest.MatcherAssert;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestLogOutSteps {
    private static final Logger LOGGER= LoggerFactory.getLogger(TestLoginSteps.class);
    @Page
    HomePage homePage;
    @Page
    TestLoginPage testLoginPage;
    public void ClickMenu() {
        homePage.ClickMenu();
    }

    public void ClickLogOout() {
        homePage.ClickLogOout();
    }

    public void ValidarPL(String valor) {
        String s= GeneralUtil.formatMessageInformation("Validando que se haya cerrado sesion");
        LOGGER.info(s);
        MatcherAssert.assertThat("Se cerro sesion correctamente",valor.contains(testLoginPage.tituloLogin.getAttribute("class") ));

    }

}
