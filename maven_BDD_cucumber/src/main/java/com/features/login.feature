@login
Feature: JBK Offline application

@jbk
Scenario Outline: login test

Given user should be on login page
When user enters "<uname>" and "<pass>"
Then user should be on home page

Examples:
|uname           |pass   |
|kiran@gmail.com |123456 |
|ak@gmail.com    |1234567|
|neelam@gmail.com|uawehu |


Scenario: logo test

Given user should be on login page
Then user should see JBK logo