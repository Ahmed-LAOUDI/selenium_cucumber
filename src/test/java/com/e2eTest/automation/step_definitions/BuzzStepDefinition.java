package com.e2eTest.automation.step_definitions;

import org.junit.jupiter.api.Assertions;

import com.e2eTest.automation.page_objects.BuzzPage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BuzzStepDefinition {
	
	BuzzPage buzzpage = new BuzzPage();

	@When("je clique sur le boutton buzz")
	public void jeCliqueSurLeBouttonBuzz() throws InterruptedException {
		Thread.sleep(5000);
	  buzzpage.getModuleBuzz();
	}
	@When("je saisis un buz {string}")
	public void jeSaisisUnBuz(String buzz) throws InterruptedException {
		Thread.sleep(5000);
		buzzpage.getBuzzText(buzz);
	    
	}
	@When("je clique sur le bouton post")
	public void jeCliqueSurLeBoutonPost() throws InterruptedException {
		Thread.sleep(5000);
	   buzzpage.getBtnPost();
	}
	@Then("je verifie le buzz cree {string}")
	public void jeVerifieLeBuzzCree(String text1) throws InterruptedException {
		String vrbuzzPage = buzzpage.verifyBuzzCreated();
	   Thread.sleep(5000);
	    Assertions.assertEquals(text1, vrbuzzPage);
	}



	
}
