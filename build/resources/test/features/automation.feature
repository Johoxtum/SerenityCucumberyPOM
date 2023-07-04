# encoding :iso-8859-1
@Auto
Feature: Como QA automation quiero automatizar los diferentes flujos de "Automation Exercise"

  @Register
  Scenario: Registrar una cuenta en la pagina Automation Exercise
    Given que Pablo ingresa a Automation Exercise
    When diligencia el formulario con los siguientes datos:
      | name  | email           | password| day | month  | year| firstName| lastName| Company   | address| state | City     | Zipcode| MobileNumber|
      | John  | john@example.com|  1234   | 12  | January| 2011| John     | Martinez| unaempresa| Calle54| mexico| unaciudad| 12124  | 3415458745  |
    Then debera visualizar "ACCOUNT CREATED!"





