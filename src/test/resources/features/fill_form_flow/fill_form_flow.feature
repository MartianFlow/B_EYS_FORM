
Feature: filing form successfull flow

    Background:Navigate to the form site
        Given commercial manager can open the form site on his browser


    Scenario Outline: Fill VCC FOR 056 Form with a verified user and different document types
        When he fill the form with document Type <documentType> and document number <documentNumber>
        And he enter the commercial information with modality <modality> and term <term>
        And he enter the investment project info with category <category> and subcategory <subcategory>
        Examples:
            | documentType | documentNumber | modality | term | category | subcategory |
            | CC           | 123456         | option-1 | 12   | option-1 | option-1    |
#| NI           | 9100010962     | option-2 | 24   | option-2 | option-7    |
