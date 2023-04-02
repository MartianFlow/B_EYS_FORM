package com.browserstack.cucumber.tasks;

import com.browserstack.cucumber.ui.InvestmentDescriptionPage.InvestmentProjectDrawerPage;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.thucydides.core.webdriver.shadow.ByShadow;

public class FillInvestmentProjectInfo implements Task {

    private String category;
    private String subcategory;
    private String investmentDescription;
    private String investmentValue;
    private String valueOne;
    private String unitOne;
    private String valueTwo;
    private String unitTwo;
    private String valueThree;
    private String unitThree;
    private String valueFour;
    private String unitFour;

    public FillInvestmentProjectInfo(String category, String subcategory, String investmentDescription,
            String investmentValue, String valueOne, String unitOne, String valueTwo, String unitTwo, String valueThree,
            String unitThree, String valueFour, String unitFour) {
        this.category = category;
        this.subcategory = subcategory;
        this.investmentDescription = investmentDescription;
        this.investmentValue = investmentValue;
        this.valueOne = valueOne;
        this.unitOne = unitOne;
        this.valueTwo = valueTwo;
        this.unitTwo = unitTwo;
        this.valueThree = valueThree;
        this.unitThree = unitThree;
        this.valueFour = valueFour;
        this.unitFour = unitFour;
    }

    public static FillInvestmentProjectInfoBuilder with() {
        return new FillInvestmentProjectInfoBuilder();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(InvestmentProjectDrawerPage.CATEGORY_DROPDOWN),
                Click.on(ByShadow.cssSelector("#" + category,
                        "bdb-at-dropdown[label='Categoría']")),
                Click.on(InvestmentProjectDrawerPage.SUBCATEGORY_DROPDOWN),
                Click.on(ByShadow.cssSelector("#" + subcategory,
                        "bdb-at-dropdown[label='Subcategoría']")),
                Enter.theValue(investmentDescription).into(InvestmentProjectDrawerPage.DESCRIPTION_TEXTAREA),
                Enter.theValue(investmentValue).into(InvestmentProjectDrawerPage.INVESTMENT_VALUE_BOX),
                Enter.theValue(valueOne).into(InvestmentProjectDrawerPage.VALUE_ONE_BOX),
                Enter.theValue(unitOne).into(InvestmentProjectDrawerPage.UNIT_ONE_BOX),
                Enter.theValue(valueTwo).into(InvestmentProjectDrawerPage.VALUE_TWO_BOX),
                Enter.theValue(unitTwo).into(InvestmentProjectDrawerPage.UNIT_TWO_BOX),
                Enter.theValue(valueThree).into(InvestmentProjectDrawerPage.VALUE_THREE_BOX),
                Enter.theValue(unitThree).into(InvestmentProjectDrawerPage.UNIT_THREE_BOX),
                Enter.theValue(valueFour).into(InvestmentProjectDrawerPage.VALUE_FOUR_BOX),
                Enter.theValue(unitFour).into(InvestmentProjectDrawerPage.UNIT_FOUR_BOX));

    }

    public static class FillInvestmentProjectInfoBuilder {
        private String category;
        private String subcategory;
        private String investmentDescription;
        private String investmentValue;
        private String valueOne;
        private String unitOne;
        private String valueTwo;
        private String unitTwo;
        private String valueThree;
        private String unitThree;
        private String valueFour;

        public FillInvestmentProjectInfoBuilder category(String category) {
            this.category = category;
            return this;
        }

        public FillInvestmentProjectInfoBuilder and() {
            return this;
        }

        public FillInvestmentProjectInfoBuilder subcategory(String subcategory) {
            this.subcategory = subcategory;
            return this;
        }

        public FillInvestmentProjectInfoBuilder investmentDescription(String investmentDescription) {
            this.investmentDescription = investmentDescription;
            return this;
        }

        public FillInvestmentProjectInfoBuilder investmentValue(String investmentValue) {
            this.investmentValue = investmentValue;
            return this;
        }

        public FillInvestmentProjectInfoBuilder valueOne(String valueOne) {
            this.valueOne = valueOne;
            return this;
        }

        public FillInvestmentProjectInfoBuilder unitOne(String unitOne) {
            this.unitOne = unitOne;
            return this;
        }

        public FillInvestmentProjectInfoBuilder valueTwo(String valueTwo) {
            this.valueTwo = valueTwo;
            return this;
        }

        public FillInvestmentProjectInfoBuilder unitTwo(String unitTwo) {
            this.unitTwo = unitTwo;
            return this;
        }

        public FillInvestmentProjectInfoBuilder valueThree(String valueThree) {
            this.valueThree = valueThree;
            return this;
        }

        public FillInvestmentProjectInfoBuilder unitThree(String unitThree) {
            this.unitThree = unitThree;
            return this;
        }

        public FillInvestmentProjectInfoBuilder valueFour(String valueFour) {
            this.valueFour = valueFour;
            return this;
        }

        public Performable unitFour(String unitFour) {
            return Instrumented.instanceOf(FillInvestmentProjectInfo.class).withProperties(category, subcategory,
                    investmentDescription, investmentValue, valueOne, unitOne, valueTwo, unitTwo, valueThree, unitThree,
                    valueFour, unitFour);
        }

    }

}
