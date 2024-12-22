package com.e2eTest.automation.step_definitions;

import com.e2eTest.automation.page_objects.LogoutPage;

import io.cucumber.java.en.When;

public class LogoutStepDefinitions {

	LogoutPage logoutPage = new LogoutPage();

	@When("je clique sur la fleche de mon profil")
	public void jeCliqueSurLaFlecheDeMonProfil() throws InterruptedException {
		Thread.sleep(5000);
		logoutPage.getbtnProfil();
	}

	@When("je clique sur le bouton logout")
	public void jeCliqueSurLeBoutonLogout() {
		logoutPage.getbtnLogout();

	}

}
