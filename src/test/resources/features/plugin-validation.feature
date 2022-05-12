Feature: Plugin validation

  @XRAY-4
  Scenario: User can add scenario
    Given user is logged in to jira
    When user opens user story
    And user expands options
    Then user can select Acceptance criteria option
    And user can see the scenario template
