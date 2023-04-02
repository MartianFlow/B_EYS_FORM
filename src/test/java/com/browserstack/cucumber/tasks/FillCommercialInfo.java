package com.browserstack.cucumber.tasks;

import com.browserstack.cucumber.ui.BasicDataPage.BasicInfoPage;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.webdriver.shadow.ByShadow;

public class FillCommercialInfo implements Task {

    private String modality;
    private String term;

    public FillCommercialInfo(String modality, String term) {
        this.modality = modality;
        this.term = term;
    }

    public static FillCommercialInfoBuilder with() {
        return new FillCommercialInfoBuilder();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(BasicInfoPage.MODALITY_DROPDOWN, WebElementStateMatchers.isClickable()),
                Scroll.to(BasicInfoPage.MODALITY_DROPDOWN),
                Click.on(BasicInfoPage.MODALITY_DROPDOWN),
                Click.on(ByShadow.cssSelector("#" + modality,
                        "bdb-at-dropdown[label='Modalidad']")),
                Enter.theValue(term).into(BasicInfoPage.TERM_BOX),
                Click.on(BasicInfoPage.ADD_INVEST_BUTTON));
    }

    public static class FillCommercialInfoBuilder {
        private String modality;

        public FillCommercialInfoBuilder modality(String modality) {
            this.modality = modality;
            return this;
        }

        public FillCommercialInfoBuilder and() {
            return this;
        }

        public Performable term(String term) {
            return Instrumented.instanceOf(FillCommercialInfo.class).withProperties(modality, term);
        }

    }

}
