package fi.comiq.tests.tests;

import fi.comiq.tests.pages.MainPage;
import fi.comiq.tests.pages.RekrytointiPage;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class RekrytointiPageTests {

    MainPage mainPage = new MainPage();
    RekrytointiPage rekrytointiPage = new RekrytointiPage();

    @Test
    @DisplayName("Open Rekrytointi Page")
    void openRekrytointiPage() {
        mainPage.openMainPage();
        rekrytointiPage.openRekrytointiPage();
        rekrytointiPage.checkRekrytointiPageIsOpened();
    }

    @Test
    @DisplayName("Check the list of vacancies has AQA vacancy ")
    void checkTheVacancyForAQA() {
        mainPage.openMainPage();
        rekrytointiPage.openRekrytointiPage();
        rekrytointiPage.checkTestAutomationExpertVacancy();
    }
}
