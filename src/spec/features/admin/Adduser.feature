@admin
Feature: adduser
  en tant que utilisateur je souhaite tester la recherche de user
  
   Background:
		Given je me connecte sur l application orange
    When je saisis un username valide  "Admin"
    And je saisis un mot de passe valide "admin123"
    And je clique sur le bouton login
  @adduser
  Scenario: je souhaite cree  un user .
    When je clique sur le module admin
    When je clique sur adduser
    And je rempli le formulaire
    And je clique sue save
 
