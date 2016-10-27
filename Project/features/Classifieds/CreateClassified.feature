Feature: A classified can have different types of pricing
Background:
  Given A classified with tile 'Some title' description 'a tine bit of text for some content' and price € 10

  Scenario: A classified can have a fixed price
    When I open the classified
    Then I see the correct price
      And I see the title
      And I see the description

  Scenario: When I update the price, only the price is changed

  Scenario: I can not update to an empty title
