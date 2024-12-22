@buzz2
Feature: buzz
  je souhaite me tester la création de buzz
  
  Background:
    Given Je me connecte sur Orange
    When Je saisis le username valide "Admin"
    And Je saisis le mot de passe valide "admin123"
    And Je clique sur Login
    
    @connexion
    Scenario: Je souhaite me créer un buzz
    When je clique sur le module buzz
    And je saisis un buzz "Test automation" 
    And je clique sur post
    Then je verifie buzz cree "Test automation"
    
