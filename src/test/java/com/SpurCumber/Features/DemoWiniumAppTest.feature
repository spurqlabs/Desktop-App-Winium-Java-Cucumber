@winiumApp
Feature: To verify the draw functionality of AutoCAD software
  As a User I want to launch the application
  and validate that I can access the different functionalities of the application.

  @smoke
  Scenario: Verify user can launch and open the new document using microsoft word application
    Given User launches the microsoft word application
    When User verifies the landing screen is visible with "Recent" opened document list
    And User clicks on "Blank document" option to add blank document
    Then User verifies that "Page 1 content" a new page for opened blank page is visible