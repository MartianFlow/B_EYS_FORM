package com.browserstack.cucumber.ui.InvestmentDescriptionPage;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.webdriver.shadow.ByShadow;

public class InvestmentProjectDrawerPage {
        public static Target CATEGORY_DROPDOWN = Target.the("category").located(ByShadow.cssSelector("#dropdown_1",
                        "bdb-at-dropdown[label='Categoría']"));
        public static Target SUBCATEGORY_DROPDOWN = Target.the("subcategory")
                        .located(ByShadow.cssSelector("#dropdown_1",
                                        "bdb-at-dropdown[label='Subcategoría']"));
        public static Target DESCRIPTION_TEXTAREA = Target.the("investment description")
                        .located(ByShadow.cssSelector("#bdb-at-text-area__input",
                                        "bdb-at-text-area[label='Descripción de la inversión']"));
        public static Target INVESTMENT_VALUE_BOX = Target.the("investment value")
                        .located(ByShadow.cssSelector("#bdb-at-input",
                                        "bdb-at-input[label='Valor de la inversión (en miles)']"));
        public static Target VALUE_ONE_BOX = Target.the("value one")
                        .located(ByShadow.cssSelector("#bdb-at-input",
                                        "bdb-at-input[label='Valor 1']"));
        public static Target UNIT_ONE_BOX = Target.the("unit one")
                        .located(ByShadow.cssSelector("#bdb-at-input",
                                        "bdb-at-input[label='Unidad 1']"));
        public static Target VALUE_TWO_BOX = Target.the("value two")
                        .located(ByShadow.cssSelector("#bdb-at-input",
                                        "bdb-at-input[label='Valor 2']"));
        public static Target UNIT_TWO_BOX = Target.the("unit two")
                        .located(ByShadow.cssSelector("#bdb-at-input",
                                        "bdb-at-input[label='Unidad 2']"));
        public static Target VALUE_THREE_BOX = Target.the("value three")
                        .located(ByShadow.cssSelector("#bdb-at-input",
                                        "bdb-at-input[label='Valor 3']"));
        public static Target UNIT_THREE_BOX = Target.the("unit three")
                        .located(ByShadow.cssSelector("#bdb-at-input",
                                        "bdb-at-input[label='Unidad 3']"));
        public static Target VALUE_FOUR_BOX = Target.the("value four")
                        .located(ByShadow.cssSelector("#bdb-at-input",
                                        "bdb-at-input[label='Valor 4']"));
        public static Target UNIT_FOUR_BOX = Target.the("unit four")
                        .located(ByShadow.cssSelector("#bdb-at-input",
                                        "bdb-at-input[label='Unidad 4']"));
}
