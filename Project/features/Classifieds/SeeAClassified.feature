Feature: A classified can  be seen by different people
  Background:
    Given there is a classified belonging to seller 1

    Scenario: a seller can see his classified in edit mode
      Given I am logged in as seller 1
      When I go to the classified
      Then I should be on the edit classified page

    Scenario: As a logged in buyer I can see the classified
      Given I am logged in as a buyer
      When I go to the classified
      Then I should be on the classified page
        And I should not be able to access the classified edit page
