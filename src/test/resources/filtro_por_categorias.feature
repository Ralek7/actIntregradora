Feature: Filtro por categorías
  Scenario: Usuario valida filtro por categorías en supermercado
    Given El usuario está en la página de Mercado Libre
    When Selecciona opción "Supermercado"
    And Selecciona opción "Cuidado del Hogar"
    Then Valida la opción "Categorías"
