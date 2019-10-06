@search
Feature: Verify search property
  As a loged in user
  I want to search property in the application

  Background: Login successfully
    Given I navigate to the Login Page
    When I login the system with "qaskillschallenge@geophy.com" and "qaskillschallenge@geophy.com"

  @validSearch
  Scenario Outline: Search successfully
    Given user is on Search Page
    When I search property with "<address>" and "<noi>" and "<units>" and "<year_built>" and "<year_renovation>" and "<occupancy>"
    And I check and run valuation
    Then user is on Report page

    Examples: 
      | address                                 | noi       | units | year_built | year_renovation | occupancy |
      | 555 N. College Avenue, Tempe, AZ, 85281 | 2 000 000 |   200 |       2000 |                 | 80%       |
