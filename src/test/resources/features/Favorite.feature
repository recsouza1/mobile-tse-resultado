Feature: Favorite a candidate

  Scenario: Add a candidate to favorites
    Given I am at a candidate screen
    When I favorite a candidate
    And I go to favorites page
    Then I see the candidate as favorite

  Scenario: Remove a candidate from favorites
    Given There is a candidate as favorite
    When I go to favorites page
    And I remove the candidate from favorites
    Then The candidate is no longer displayed on favorites page