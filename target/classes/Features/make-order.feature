@smoke
Feature: HoverCategories and proceed an order
  Scenario: HoverCategories for random product
    Given Login with valid email and password
    And go to Women category and select blouse
    Then Assert navigate page contain category name
    When click on go to cart
    And click on Proceed to check out
    Then check if the product in stock
    And Click on proceed to checkout twice
    And Click on check box and proceed to checkout
    And Click on Pay by bank
    And Click on Confirm
    Then Assert completing the order by specific word "Complete"

