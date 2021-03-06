package fi.comiq.tests.tests;

import fi.comiq.tests.pages.AsiakkaatPage;
import fi.comiq.tests.pages.MainPage;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class AsiakkatPageTests extends TestBase {

    MainPage mainPage = new MainPage();
    AsiakkaatPage asiakkatPage = new AsiakkaatPage();

    @Test
    @DisplayName("Open Asiakkaat Page")
    void openAsiakkaatPageTest() {
        mainPage.openMainPage();
        asiakkatPage.openAsiakkaatPage();
        asiakkatPage.checkAsiakkaatPageIsOpened();
    }
}
