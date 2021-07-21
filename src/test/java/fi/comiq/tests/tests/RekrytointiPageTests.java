package fi.comiq.tests.tests;

import fi.comiq.tests.pages.MainPage;
import fi.comiq.tests.pages.RekrytointiPage;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class RekrytointiPageTests {

    static MainPage mainPage = new MainPage();
    static RekrytointiPage rekrytointiPage = new RekrytointiPage();

    @BeforeAll
    static void openMain() {
        mainPage.openMainPage();
        rekrytointiPage.openRekrytointiPage();
    }

    @Test
    @DisplayName("Open Rekrytointi Page")
    void openRekrytointiPage() {
        rekrytointiPage.checkRekrytointiPageIsOpened();
    }

    @Test
    @DisplayName("Check the list of vacancies has AQA vacancy ")
    void checkTheVacancyForAQA() {
        rekrytointiPage.checkTestAutomationExpertVacancy();
    }
}
