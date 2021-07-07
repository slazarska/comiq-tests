package fi.comiq.tests.tests;

import fi.comiq.tests.helpers.DriverUtils;
import fi.comiq.tests.pages.MainPage;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.step;
import static org.assertj.core.api.Assertions.assertThat;

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
        step("Console logs should not contain text 'SEVERE'", () -> {
            String consoleLogs = DriverUtils.getConsoleLogs();
            String errorText = "SEVERE";

            assertThat(consoleLogs).doesNotContain(errorText);
        });
    }

    @Test
    void checkPageIsOnFinnishLangByDefault() {
        mainPage.openMainPage();
        mainPage.checkPageIsInFinn();
    }

    @Test
    void checkSwithToEngLang() {
        mainPage.openMainPage();
        mainPage.chooseEnglsihLanguage();
        mainPage.checkPageIsInEng();
    }
}