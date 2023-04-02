package com.browserstack.cucumber.tasks;

import com.browserstack.cucumber.ui.BasicDataPage.BasicInfoPage;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.thucydides.core.webdriver.shadow.ByShadow;

public class FillBasicData implements Task {

    private String documentType;
    private String documentNumber;

    public FillBasicData(String documentType, String documentNumber) {
        this.documentType = documentType;
        this.documentNumber = documentNumber;
    }

    public static FillFormBuilder with() {
        return new FillFormBuilder();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BasicInfoPage.DOCUMENT_TYPE_DROPDOWN),
                Click.on(ByShadow.cssSelector("#option-" + documentType,
                        "bdb-at-dropdown[label='Tipo de documento']")),
                Enter.theValue(documentNumber).into(BasicInfoPage.DOCUMENT_NUMBER_BOX),
                Click.on(BasicInfoPage.SEARCH_BUTTON));
    }

    public static class FillFormBuilder {
        private String documentType;

        public FillFormBuilder documentType(String documentType) {
            this.documentType = documentType;
            return this;
        }

        public Performable documentNumber(String documentNumber) {
            return Instrumented.instanceOf(FillBasicData.class).withProperties(documentType, documentNumber);
        }

    }

}
