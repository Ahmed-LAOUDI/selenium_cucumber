package com.e2eTest.automation.step_definitions;

import com.e2eTest.automation.page_objects.CreationBuzzPage;
import com.e2eTest.automation.utils.SeleniumUtils;
import com.e2eTest.automation.utils.Validations;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreationBuzzStep {

	private CreationBuzzPage creationBuzzPage;
	private SeleniumUtils seleniumUtils;
	private Validations validations;
	
	public CreationBuzzStep() {
		creationBuzzPage = new CreationBuzzPage();
		seleniumUtils = new SeleniumUtils();
		validations = new Validations();
	}

	@When("je clique sur le module buzz")
	public void jeCliqueSurLeModuleBuzz() throws InterruptedException {
		seleniumUtils.click(CreationBuzzPage.getModuleBuzz2());
		Thread.sleep(3000);
	}
	@When("je saisis un buzz {string}")
	public void jeSaisisUnBuzz(String namem) throws InterruptedException {
	    seleniumUtils.writeText(CreationBuzzPage.getBuzzText(), namem);
	    Thread.sleep(3000);
	}
	@When("je clique sur post")
	public void jeCliqueSurPost() throws InterruptedException {
		seleniumUtils.click(CreationBuzzPage.getBtnPost());
		Thread.sleep(3000);
	    
	}
	@Then("je verifie buzz cree {string}")
	public void jeVerifieBuzzCree(String string) throws InterruptedException {
		Thread.sleep(3000);
	}



}
