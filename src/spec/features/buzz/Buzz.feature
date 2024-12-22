@buzz
Feature: buzz
  en tant que utilisateur je souhaite tester la création de buzz
  
   Background:
		Given je me connecte sur l application orange
    When je saisis un username valide  "Admin"
    And je saisis un mot de passe valide "admin123"
    And je clique sur le bouton login
  @buzz1
  Scenario: je souhaite cree un buzz .
    When je clique sur le boutton buzz
    And je saisis un buz "Test automation" 
    And je clique sur le bouton post
    Then je verifie le buzz cree "Test automation"
