@status-points
Feature: Frequent Flyer status is calculated based on points
  As a Frequent Flyer member
  I want my status to be upgraded as soon as I earn enough points
  So that I can benefit from my higher status sooner

  Scenario Outline:
    Given Joe is a <initialStatus> Frequent Flyer member
    And he has <initialStatusPoints> status points
    When he earns <extraPoints> extra status points
    Then he should have a status of <finalStatus>

    Examples: Status points required for each level
      | initialStatus | initialStatusPoints | extraPoints | finalStatus |
      | BRONZE        | 0                   | 300         | SILVER      |
      | SILVER        | 0                   | 700         | GOLD        |
      | GOLD          | 0                   | 1500        | PLATINUM    |

    Examples: Earning status in small chunks
      | initialStatus | initialStatusPoints | extraPoints | finalStatus |
      | BRONZE        | 200                 | 99          | BRONZE      |
      | BRONZE        | 200                 | 100         | SILVER      |
      | SILVER        | 600                 | 99          | SILVER      |
      | SILVER        | 600                 | 100         | GOLD        |
      | GOLD          | 1400                | 99          | GOLD        |
      | GOLD          | 1400                | 100         | PLATINUM    |
      | PLATINUM      | 2000                | 100         | PLATINUM    |
