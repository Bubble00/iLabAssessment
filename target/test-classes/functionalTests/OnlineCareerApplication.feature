Feature: Career Application
  Description: The purpose of this feature is to test if online career application is working

  Scenario: Candidate applies for a career from online portal
    Given user is on Home Page
    When he navigate to Careers page
    And he choose "South Africa"
    And he select the first available job
    And he select apply online button
    And populate the name "Name"
    And populate email address "automationAssessment@iLABQuality.com"
    And populate phone number
    Then validate text "You need to upload at least one file."