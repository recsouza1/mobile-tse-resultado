Feature: Tab Icons

  Scenario Outline: Select Tab Icons
    Given I am at home screen
    When I select <tab icon>
    Then The <tab icon> should be selected
    Examples:
      | tab icon            |
      | 'resultadosTabBtn'  |
      | 'totalizacaoTabBtn' |
      | 'favoritosTabBtn'   |
      | 'informacoesTabBtn' |