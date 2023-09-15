
@tagB
Feature: Title of your feature
  

  @tag5
  Scenario Outline: Check the Search button
    Given User is on the app
    Then Click on the app
    Then Click on the Search
    Then Clcik on Invoke Search
    Then Give the Prefill Query "<Prefill Query>"
    Then Give the App data "<App Data>"
    

    Examples: 
      | Prefill Query  | App Data |
      | Nagarro |   data of the app | 
      
   @tag6
  Scenario: Test the Graphics
  Given User is in the app
  Then click on Graphic button
  Then click on AlphaBitmap and check the title and move back
  Then click on the AnimateDrawbles check the title and move back
  Then click on the Density check the title scroll down and move back
  Then Scroll down 
  Then clcik on picture check the title and move back
  Then clcik on Touch paint and check the title and touch on screen 
  
 
      
   
      
