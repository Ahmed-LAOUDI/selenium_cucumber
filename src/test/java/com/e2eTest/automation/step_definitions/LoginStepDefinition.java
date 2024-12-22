package com.e2eTest.automation.step_definitions;

import org.junit.jupiter.api.Assertions;

import com.e2eTest.automation.page_objects.LoginPage;
import com.e2eTest.automation.utils.ConfigFileReader;
import com.e2eTest.automation.utils.Setup;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinition {
	
	ConfigFileReader configFileReader = new ConfigFileReader();
	LoginPage loginPage = new LoginPage();

	@Given("je me connecte sur l application orange")
	public void jeMeConnecteSurLApplicationOrange(){
		Setup.getDriver().get(configFileReader.getProperty("home.url"));
	    
	}
	@When("je saisis un username valide  {string}")
	public void jeSaisisUnUsernameValide(String username) throws InterruptedException{
		Thread.sleep(3000);
		loginPage.getUsername(username);
	}
	@When("je saisis un mot de passe valide {string}")
	public void jeSaisisUnMotDePasseValide(String password) {
	   loginPage.getPassword(password);
	}
	@When("je clique sur le bouton login")
	public void jeCliqueSurLeBoutonLogin() {
		loginPage.getBtnlogin();
	    
	}
	@Then("je me redirige vers la page Home {string}")
	public void jeMeRedirigeVersLaPageHome(String text) throws InterruptedException {
		Thread.sleep(2000);
	    String homePage = loginPage.getUserHome();
	    Assertions.assertEquals(text, homePage);
	}



}
