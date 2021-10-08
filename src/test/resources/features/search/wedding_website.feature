Feature: Website UI

  @wedding
  Scenario: Finding Faye
    Given Rach navigates to the wedding website
    When she opens the hamburger menu
    When she clicks on the "bridesmaids" link
    Then she should see "faye" in the bridesmaids section

  @wedding
  Scenario: Finding Callum
    Given Rach navigates to the wedding website
    When she opens the hamburger menu
    When she clicks on the "groomsmen" link
    Then she should see "callum" in the groomsman section

  @notImplemented
  Scenario: Finding Wilf
    Given Rach navigates to the wedding website
    When she opens the hamburger menu
    When she clicks on the "groomsmen" link
    Then she should see "wilf" in the groomsman section

  @notImplemented
  Scenario: Our Story is present
    Given Rach navigates to the wedding website
    When she opens the hamburger menu
    When she clicks on the "our story" link
    Then she should see the "Our Story" paragraph text

  @notImplemented
  Scenario: Wedding starts at 3:30pm
    Given Rach navigates to the wedding website
    When she opens the hamburger menu
    When she clicks on the "getting here" link
    Then she should see that the wedding ceremony is from "3:30pm"

  @notImplemented
  Scenario: RSVP
    Given Rach navigates to the wedding website
    When she opens the hamburger menu
    When she clicks on the "rsvp" link
    And she fills out "what is your name" with the text "Test" on the first part of the form
    And she selects "I will attend the wedding" on the second part of the form
    And she selects "Reception (from 6pm)" on the third part of the form
    And she selects "Email" on the fourth part of the form
    And she fills out "test@test.com" in the fifth part of the form

