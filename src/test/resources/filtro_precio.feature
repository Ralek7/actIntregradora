Feature: Filtro precio
  Scenario: Usuario valida filtro de precio
    Given El usuario está en la página de Mercado Libre
    When Busca el producto "termo"
    Then Valida el filtro de precio
