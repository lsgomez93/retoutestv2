#autor: lgomezm@choucairtesting.com

@registreUtest
Feature: Registre Page Utest
  As a user, I wants registre on the page Utest

  @scenario1
  Scenario: Create user page Utest
    Given than Leidy wants registre page utest
    When she fillout date of the form and send
      |strFirstName|strLastName|strEmail        |srtMonth|srtDay|srtYear|srtCity   |srtCodePostal|srtCountry|srtOperatingSystem|srtVersionOperatingSystem|srtLanguageOperatingSystem|strBrandMobile|strModelMobile|strOperatingSystemMobile|password     |confirmPassword|
      |Silvana     |Gomez      |silady@gmail.com|March   |5     |1993   |Popayan   |10091        |Colombia  |macOS             |OS X 10.5                |Armenian                  |Alcatel       |One Touch Idol|Android 5.1.1           |IkNd25EXB8Nn |IkNd25EXB8Nn   |
    Then she receives a mesagge de bienvenida a pagina Utest Welcome to the world's largest community of freelance software testers!

