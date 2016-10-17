Feature: A classified can have different types of pricing

  Scenario: A classified can have a fixed price
    Given A classified with a fixed price
    When I open the classified
    Then I see the price
    And I don't have the option to enter a bid