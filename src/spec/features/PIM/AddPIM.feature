@Employee
Feature: Gestion des employés dans OrangeHRM

  Background: 
    Given je me connecte sur l application orange
    When je saisis un username valide  "Admin"
    And je saisis un mot de passe valide "admin123"
    And je clique sur le bouton login
    And Je navigue vers le module PIM
    

  @add_Employee
  Scenario: Ajouter un nouvel employe
    And Je clique sur le bouton Add Employee
    And Je remplis les informations "ahmedlaorrrr" dans le champ firstname
    And Je remplis les informations "thzyizjurrr" dans le champ Lastname 
    And Je clique sur le bouton Save
    Then je me regirige vers la page "Personal Details"