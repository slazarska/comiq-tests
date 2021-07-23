package fi.comiq.tests.tests;

import fi.comiq.tests.pages.MainPage;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MainPageTests extends TestBase {

    MainPage mainPage = new MainPage();

    @Test
    @DisplayName("Open main page")
    void openMainPageTest() {
        mainPage.openMainPage();
        mainPage.checkMainPageIsOpened();
    }

    @Test
    @DisplayName("Main page title should have header text")
    void mainPageTitleTest() {
        mainPage.openMainPage();
        mainPage.checkTitle();
    }

//    @Test
//    @Disabled
//    @DisplayName("Page console log should have no errors")
//    void consoleLogTest() {
//        mainPage.openMainPage();
//        mainPage.checkConsoleLogHaveNoErrors();
//    }

    @Test
    @DisplayName("Default language for main page should be finnish")
    void defaultLanguageOnMainPageTest() {
        mainPage.openMainPage();
        mainPage.checkPageIsInFinn();
    }

    @Test
    @DisplayName("Switch to english language om main page is available")
    void switchLanguageTest() {
        mainPage.openMainPage();
        mainPage.chooseEnglsihLanguage();
        mainPage.checkPageIsInEng();
    }
}