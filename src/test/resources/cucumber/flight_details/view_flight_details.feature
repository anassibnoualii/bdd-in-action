@viewing-flights
Feature: Retrieve information about a given flight

  Scenario: Find flight details by flight number
    Given I need to know the details of flight number 'FH-101'
    When I request the details about this flight
    Then I should receive the following:
      """
        {
            "flightNumber": "FH-101",
            "departure": "MEL",
            "destination": "SYD",
            "time": "06:00"
        }
      """

  Scenario: Find international flight details by flight number
    Given I need to know the details of flight number 'FH-102'
    When I request the details about this flight
    Then I should receive the following:
      """
        {
          "flightNumber": "FH-102",
          "departure": "SYD",
          "destination": "HKG",
          "time": "11:55"
      }
      """