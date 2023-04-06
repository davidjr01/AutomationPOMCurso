Feature: iniciar sesion en la aplicacion de saucedemo
  @login
  Scenario:ingresar a la aplicacion con credenciales
    Given que el usuario ingrese a la pagina web
    When el usuario ingrese las credenciales
    And dar click en el boton de login
    Then validamos que estemos en la pagina principal "PRODUCTS"

  @FiltroPorPrecio
  Scenario:Filtrar los productos por orden de precio
    Given que el usuario de click a la seccion de filtracion
    When  filtrar busqueda por precio "LowPrice"
    Then  Validamos que se haya filtrado de forma correcta "True"

  @FiltroPorOrdenAlfabetico
  Scenario:Filtrar los productos por orden alfabetica
    Given Se de click a la seccion de filtracion
    When  filtrar busqueda por nombre de producto  "Name(ZtoA)"
    Then  Validamos que se haya filtrado de forma alfabetica "True"


  @AddToCart
  Scenario:agregar item al carrito de comprar y eliminarlo
    Given que el usuario agregue el producto al carrito de compras
    When  click al boton  carrito de compras
    And   verificar que estemos en la pagina del carrito de compras "YOUR CART"
    And   validamos que el producto se encuentre en el carrito "Sauce Labs Backpack"
    Then  eliminamos el producto del carrito y regresamos al home

  @BuyProducts
  Scenario:Comprar los productos
    Given que el usuario agregue el producto al carrito de compras
    When  click al boton  carrito de compras
    And Que el usuario de click en el boton Checkout
    And Asegurarse que este en la pagina para credenciales "CHECKOUT: YOUR INFORMATION"
    And Que el usuario ingrese sus credenciales "Luis" "Juarez","0012"
    And click en el boton CONTINUE
    And click en el boton FINISH
    Then  validar que se realizo la compra "CHECKOUT: COMPLETE!"

    @Logout
    Scenario:Cerar sesion
      Given que el usuario de click al menu
      When  el usuario de clik a la opcion logout
      Then verificar que estemas en la pagina del login "login_wrapper"


