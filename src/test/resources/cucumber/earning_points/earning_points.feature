@earning-points
Feature: Earning Frequent Flyer points from flights
  In order to encourage travellers to book with Flying High Airlines more frequently
  As the Flying High sales manager
  I want travellers to earn Frequent Flyer points when they fly with us

  Scenario: Earning standard points from an Economy flight
  Normal flights earn 1 point every 2 kilometers
    Given the flying distance between 'SYD' and 'MEL' is 878 km
    And I am a standard Frequent Flyer member
    When I fly from Sydney to Melbourne on '10/10/2022'
    Then I should earn 439 points
