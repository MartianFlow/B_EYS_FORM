package com.browserstack.cucumber.ui.BasicDataPage;

import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.webdriver.shadow.ByShadow;

public class BasicInfoPage {
        // Basic Data
        public static Target DOCUMENT_TYPE_DROPDOWN = Target.the("Document Type")
                        .located(ByShadow.cssSelector("#dropdown_1",
                                        "bdb-at-dropdown[label='Tipo de documento']"));
        public static Target DOCUMENT_NUMBER_BOX = Target.the("Document number")
                        .located(ByShadow.cssSelector("#bdb-at-input",
                                        "bdb-at-input[label='Número de documento']"));
        public static Target SEARCH_BUTTON = Target.the("Search Button")
                        .located(By.xpath("//button[contains(text(),'Consultar')]"));

        // Commercial Info
        public static Target MODALITY_DROPDOWN = Target.the("modality")
                        .located(ByShadow.cssSelector("#dropdown_1",
                                        "bdb-at-dropdown[label='Modalidad']"));
        public static Target TERM_BOX = Target.the("term")
                        .located(ByShadow.cssSelector("#bdb-at-input",
                                        "bdb-at-input[label='Plazo']"));
        public static Target ADD_INVEST_BUTTON = Target.the("add invest")
                        .located(By.xpath("//button[contains(text(),'Agregar inversión')]"));

}
