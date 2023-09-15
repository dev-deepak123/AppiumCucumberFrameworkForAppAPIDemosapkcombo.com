@tagA
Feature: Api Demo Features
  

  @tag1
  Scenario: Test the hinding and showing button in animation option
  Given User is in the app
  Then click on Animation button
  Then click on the Hide-Show Animation
  Then click on zero
  Then verify that zero is gone or not
  Then click on the show button 
  Then verify that zero is visible or not
  
  @tag2
  Scenario: Test the display option in the app
  Given User is in the app
  Then click on the App button
  Then click on the Action Bar
  Then click on the Display Options
  Then click on the Display_show_title and verify it
  Then click on the Display_show_custom and verify it 
  Then click on Navigation and verify it
  
   @tag3
  Scenario: Test the set password in the app
  Given User is in the app
  Then click on the App text
  Then click on the Device admin 
  Then click on the Password expiration
  Then click on the set password
  Then click on the fingerprint and password
  Then send the password "<password>"
  Then reenter the confirm password "<confirm password>"
  Then click on the confirm button
  Then Click on do not show notification
  Then click on the confirm
  Then click on skip
  
  Examples: 
      | password  | confirm password |
      | 1234 |   1234 | 
  
    
  @tag4
  Scenario: Test create contact 
  Then user click on the text
  Then user click on the Linkify
  Then click on the here
  Then click on the Create new contact
  Then click on the cancel
  Then fill the first name "<First Name>"
  Then fill the last name "<Last Name>"
  Then enter the phone number "<Phone Number>"
  Then enter the email "<Email>"
  Then select mobile
  Then Clcik on Save
  Then Check that number is save or not
  
  Examples: 
      | First Name  | Last Name | Phone Number | Email |
      | Deepak |   Vishwakarma | 7880541096 | deepuvishwkarma212@gmail.com  |
