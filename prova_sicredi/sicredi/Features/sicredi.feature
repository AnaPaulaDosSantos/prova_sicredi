
@tag
Feature: Adicionar

  @tag1
  Scenario: Mudar o valor da combo Select version
    Given que o usuario acesse a url "https://www.grocerycrud.com/v1.x/demo/bootstrap_theme"
    And clicar combo select version para Bootstrap V4 Theme
    And clicar no botão Add Customer
    And preencher campos
    
    @tag2 
    Scenario: delete desafio 1
    Given "https://www.grocerycrud.com/v1.x/demo/bootstrap_theme"
    And clicar na Search	e digita o conteudo
    And clicar no checbox abaixo da palavra actions 
    And clicar no botão delete
    And Validar o texto Are you sure that you want to delete this 1 item?
    And clicar no botão delete no popup
    And fechar o navegador
    
 
