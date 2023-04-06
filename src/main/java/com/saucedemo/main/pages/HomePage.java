package com.saucedemo.main.pages;


import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.support.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

import java.util.List;
import java.util.Arrays;


public class HomePage extends PageObject {


    public String flagPrice="False";
    public String flagTittle="False";
    int tam;

    @FindBy (xpath="//span[@class='title']")
    public WebElementFacade spanHome;

    @FindBy (xpath="//button[@id='add-to-cart-sauce-labs-backpack']")
    public WebElementFacade btagregar1;
    @FindBy (xpath="//button[@id='add-to-cart-sauce-labs-bolt-t-shirt']")
    public WebElementFacade btagregar2;


    @FindBy (xpath="//a[@class='shopping_cart_link']")
    public WebElementFacade bt_carrito;

    @FindBy (xpath="//select [@class='product_sort_container']")
    public WebElementFacade selects;

    @FindBy (xpath="//div[@class='inventory_item_price']")
    public List<WebElementFacade> PrecioProductos;

    @FindBy (xpath="//div[@class='inventory_item_name']")
    public List<WebElementFacade> TitulosProductos;

    @FindBy (xpath="//button[@id='react-burger-menu-btn']")
    public WebElementFacade bt_Menu;

    @FindBy (xpath="//a[@id='logout_sidebar_link']")
    public WebElementFacade bt_Logout;




    public Double[] Lpecios;
    public String [] LProductos;
    public String [] lTemp;

    public void SeleccionFiltro() {
        selects.click();
    }

    public void ObeterDatosP(){
        Lpecios=new Double[PrecioProductos.size()];
        for (int i = 0; i <PrecioProductos.size(); i++){
            String x;
            x=PrecioProductos.get(i).getText().replace("$","");
            Double x2=Double.parseDouble(x);
            Lpecios[i]=x2;
        }

    }

    public void ObeterTitulos(){
        tam=TitulosProductos.size();
        LProductos=new String[tam];
        lTemp=new String[tam];
        for (int i = 0; i <tam; i++){
            LProductos[i]=TitulosProductos.get(i).getText();
            lTemp[i]=TitulosProductos.get(i).getText();
        }
        Arrays.sort(lTemp);

    }

    public void Filtrar(String valor) {
        switch (valor) {
            case "Name(AtoZ)":
                selects.selectByValue("az");
                ObeterTitulos();
                for (int i = 0; i <tam;i++){
                    if(LProductos[i]==lTemp[i]){
                        flagTittle="True";
                    }else{
                        flagTittle="False";
                        break;
                    }
                }
                break;
            case "Name(ZtoA)":
                selects.selectByValue("za");
                ObeterTitulos();
                for (int i = 0; i <tam;i++){
                    if(LProductos[i].equals(lTemp[(tam-1)-i])){
                        flagTittle="True";
                    }
                    else{
                        flagTittle="False";
                        break;
                    }
                }

                break;
            case "LowPrice":
                selects.selectByValue("lohi");
                ObeterDatosP();
                for (int i = 0; i <PrecioProductos.size()-1; i++) {
                    if(Lpecios[i]<=Lpecios[i+1]){
                        flagPrice="True";
                    }else{
                        flagPrice="False";
                        break;
                    }
                }
                break;
            case "HighPrice":
                selects.selectByValue("hilo");
                ObeterDatosP();
                for (int i = 0; i <PrecioProductos.size()-1; i++) {
                    if(Lpecios[i]>=Lpecios[i+1]){
                        flagPrice="True";
                    }else{
                        flagPrice="False";
                        break;
                    }
                }
                break;
            default:
                throw new IllegalArgumentException("unexpected value: " + valor);
        }
    }

    public void AgregarProducto() {
        btagregar1.click();
    }


    public void CarritoDeComparas() {
        bt_carrito.click();

    }


    public void ClickMenu() {
        bt_Menu.click();
    }

    public void ClickLogOout() {
        bt_Logout.click();

    }
}
