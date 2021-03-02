Feature: User should able to manage  wappier Users Management

  Background:
    Given go to url


  @WUM-04
  Scenario Outline: user can create new user with valid credentials
    When user click add user button
    Then user can upload avatar
    Then user can write <name> as user's name
    Then user can write <country> as user's country
    Then user can select <birthday> user's birthdate
    And user able to click save button
    Then user able to see <name> user on userlist table

    Examples:
      | name         | country | birthday           |
      | "Adam Smith" | "VA"    | "02 December 1987" |
      | "Tom Hanks   | "USA"   | "02 July 1973"     |


  @WUM-03
  Scenario: verify table cells are not null
    When user can see there is not null value on the table

  @WUM-01
  Scenario: verify table header
    When user can see headers following below
      | Avatar Name Age Country Number of apps |

  @WUM-05
  Scenario: negative testing to create new user with invalid data
    When user click add user button
    Then user can upload avatar
    And  user can write "Angel Smith" as user's name
    Then user can write "VA" as user's country
    And  user can select "12-34-2090" user's birthdate
    Then user able to click save button
    And user can not to see "Angel Smith" new user on userlist table

  @WUM-06
  Scenario: verify user can sort the table
    When user click on "nameIcon" icon
    Then user can sort the table based on "name"
    When user click on "countryIcon" icon
    Then user can sort the table based on "country"
    When user click on "appNumIcon" icon
    Then user can sort the table based on "number of apps"

  @WUM-07
  Scenario: verify each row is clickable
    When user hover over each row
    When user click on "Charles Hansen"
    Then user should able to see "Charles Hansen" as header on userView page


  @smoke @wip
  Scenario:verify functionality of app
    When user hover over each row
    And user click on "St Charles Hansen"
    Then user should able to see "St Charles Hansen" as header on userView page
    And user click edit button
    And user can write "Charles Halsen " as user's name
    And user able to click save button
    Then history table contains "Charles Halsen "
    And user can go userList page by clicking list button
    Then user can sort the table based on "name"
    And user can see "St Charles Halsen " on history on userList page

  @WUM-12
  Scenario: verify go back userListPage by clicking list button
    Given user click add user button
    When user click list button
    Then user is on userListPage

  @WUM-13
  Scenario: verify history
    When verify that time info is identified
    Then time is sorted
    And user can scroll-down and scroll-up history








