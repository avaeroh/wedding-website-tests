Feature: Website UI

  @example
  Scenario: Finding Callum
    Given Rach navigates to the wedding website
    When she opens the hamburger menu
    When she clicks on the "groomsmen" link
    Then she should see "callum" in the groomsman section

