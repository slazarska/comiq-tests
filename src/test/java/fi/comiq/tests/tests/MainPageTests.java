package fi.comiq.tests.tests;

import fi.comiq.tests.pages.MainPage;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MainPageTests extends TestBase {

    MainPage mainPage = new MainPage();

    @Test
    @DisplayName("Open main page")
    void openMainPage() {
        mainPage.openMainPage();
        mainPage.checkMainPageIsOpened();
    }

    @Test
    @DisplayName("Main page title should have header text")
    void checkTitle() {
        mainPage.openMainPage();
        mainPage.checkTitle();
    }

    @Test
    @DisplayName("Page console log should not have errors")
    void checkConsoleLogHaveNoErrors() {
        mainPage.openMainPage();
        mainPage.checkConsoleLogHaveNoErrors();
    }

    @Test
    @DisplayName("Default language for main page should be finnish")
    void checkPageIsOnFinnishLangByDefault() {
        mainPage.openMainPage();
        mainPage.checkPageIsInFinn();
    }

    @Test
    @DisplayName("Switch to english language is available")
    void checkSwithToEngLang() {
        mainPage.openMainPage();
        mainPage.chooseEnglsihLanguage();
        mainPage.checkPageIsInEng();
    }
}