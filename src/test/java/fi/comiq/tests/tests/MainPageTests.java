package fi.comiq.tests.tests;

import fi.comiq.tests.pages.MainPage;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MainPageTests extends TestBase {

    static MainPage mainPage = new MainPage();

    @BeforeAll
    static void openMain() {
        mainPage.openMainPage();
    }

    @Test
    @DisplayName("Open main page")
    void openMainPage() {
        mainPage.checkMainPageIsOpened();
    }

    @Test
    @DisplayName("Main page title should have header text")
    void checkTitle() {
        mainPage.checkTitle();
    }

    @Test
    @DisplayName("Page console log should not have errors")
    void checkConsoleLogHaveNoErrors() {
        mainPage.checkConsoleLogHaveNoErrors();
    }

    @Test
    @DisplayName("Default language for main page should be finnish")
    void checkPageIsOnFinnishLangByDefault() {
        mainPage.checkPageIsInFinn();
    }

    @Test
    @DisplayName("Switch to english language is available")
    void checkSwithToEngLang() {
        mainPage.chooseEnglsihLanguage();
        mainPage.checkPageIsInEng();
    }
}