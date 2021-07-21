package fi.comiq.tests.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import fi.comiq.tests.helpers.DriverUtils;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;
import static org.assertj.core.api.Assertions.assertThat;

public class MainPage {

    private static final String MAIN_PAGE_URL = "https://comiq.fi/";

    SelenideElement logo = $("div.q_logo");
    SelenideElement suomiLangLink = $(By.linkText("Suomi"));
    SelenideElement englishLangLink = $(By.linkText("English"));
    SelenideElement palvelutLink = $(By.xpath("//span[contains(text(), \"Palvelut\")]"));
    SelenideElement servicesLink = $(By.xpath("//span[contains(text(), \"Services\")]"));

    @Step("Open Main Page")
    public void openMainPage() {
        open(MAIN_PAGE_URL);
    }

    @Step("Check Main Page is opened")
    public void checkMainPageIsOpened() {
        logo.shouldBe(Condition.visible);
    }

    @Step("Check Main page title")
    public void checkTitle() {
        String expectedTitle = "Comiq — Laatujohtamisen pioneeri";
        String actualTitle = title();
        assertThat(actualTitle).isEqualTo(expectedTitle);
    }

    @Step("Check Main page console log have no errors")
    public void checkConsoleLogHaveNoErrors() {
        String consoleLogs = DriverUtils.getConsoleLogs();
        String errorText = "SEVERE";
        assertThat(consoleLogs).doesNotContain(errorText);
    }

    @Step("Choose finninsh language")
    public void chooseFinnishLanguage() {
        suomiLangLink.click();
    }

    @Step("Choose english language")
    public void chooseEnglsihLanguage() {
        englishLangLink.click();
    }

    @Step("Check Main Page is in English")
    public void checkPageIsInFinn() {
        palvelutLink.shouldBe(Condition.visible);
    }

    @Step("Check Main Page is in English")
    public void checkPageIsInEng() {
        servicesLink.shouldBe(Condition.visible);
    }
}


