@login
Feature: Login in the application
  As a registered user of the application
  I want to validate the login funtionality

  @successfulLogin
  Scenario Outline: Login successfully
    Given I navigate to the Login Page
    When I login the system with "<username>" and "<password>" 
    Then I logged in successfully

    Examples: 
      | username                     | password                     |
      | qaskillschallenge@geophy.com | qaskillschallenge@geophy.com |

  @failedLogin
  Scenario Outline: Login failed with invaild username or password
    Given I navigate to the Login Page
    When I login the system with "<username>" and "<password>" 
    Then There is an error message as "<alert>" 

    Examples: 
      | username                        | password                        | alert                                                                                              |
      | qaskillschallenge111@geophy.com | qaskillschallenge@geophy.com    | There was an error with your e-mail or password, please try entering your login credentials again. |
      | qaskillschallenge@geophy.com    | qaskillschallenge111@geophy.com | There was an error with your e-mail or password, please try entering your login credentials again. |
