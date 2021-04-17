Feature: Go to the https://demo.prestashop.com/
  Scenario: Subscribe with invalid email
Given On the button of the page fill 'Get our latest news and special sales' field with invalid email (like tttt@ttt)
When Click on Subscribe button
Then Check that 'Invalid email address.' appear