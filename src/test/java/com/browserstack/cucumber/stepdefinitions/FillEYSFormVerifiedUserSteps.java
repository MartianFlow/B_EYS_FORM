package com.browserstack.cucumber.stepdefinitions;

import com.browserstack.cucumber.tasks.FillBasicData;
import com.browserstack.cucumber.tasks.FillCommercialInfo;
import com.browserstack.cucumber.tasks.FillInvestmentProjectInfo;

import io.cucumber.java.en.*;
import net.serenitybdd.screenplay.Actor;

public class FillEYSFormVerifiedUserSteps {

    Actor actor = CommonSteps.actor;

    @When("^he fill the form with document Type (.*) and document number (.*)$")
    public void fill_basic_info(String documentType, String documentNumber) {
        actor.attemptsTo(
                FillBasicData
                        .with()
                        .documentType(documentType)
                        .documentNumber(documentNumber));
    }

    @And("^he enter the commercial information with modality (.*) and term (.*)$")
    public void fill_commercial_information(String modality, String term) {
        actor.attemptsTo(
                FillCommercialInfo
                        .with()
                        .modality(modality)
                        .and()
                        .term(term));
    }

    @And("^he enter the investment project info with category (.*) and subcategory (.*)$")
    public void fill_investment_project_info(String category, String subcategory) {
        actor.attemptsTo(
                FillInvestmentProjectInfo
                        .with()
                        .category(category)
                        .and()
                        .subcategory(subcategory)
                        .and()
                        .investmentDescription("Descripcion de inversion")
                        .and()
                        .investmentValue("250000000")
                        .and()
                        .valueOne("10000")
                        .and()
                        .unitOne("unit One")
                        .and()
                        .valueTwo("20000")
                        .and()
                        .unitTwo("unit two")
                        .and()
                        .valueThree("30000")
                        .and()
                        .unitThree("unit three")
                        .and()
                        .valueFour("40000")
                        .and()
                        .unitFour("unit four"));
    }

}
