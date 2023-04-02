package com.browserstack.cucumber.stepdefinitions;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;

public class CommonSteps {

    @Managed
    WebDriver driver;

    @Before
    public void setTheStage() {
        driver.manage().window().maximize();
        actor.can(BrowseTheWeb.with(driver));
    }

    public static Actor actor = Actor.named("commercial manager");

    @Given("^commercial manager can open the form site on his browser$")
    public void actor_can_open_the_form_site_on_his_browser() {
        actor.attemptsTo(
                Open.url("https://eys-sostenible-proceso-web-ui.bbogcreditocomercialtccstg.com/for056/for056"));
    }
}
