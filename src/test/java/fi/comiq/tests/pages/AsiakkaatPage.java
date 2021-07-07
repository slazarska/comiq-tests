package fi.comiq.tests.pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class AsiakkaatPage {

    SelenideElement asiakkaatLink = $(By.xpath("//span[contains(text(), \"Asiakkaat\")]"));
    SelenideElement asiakkaatHeader = $(By.xpath("//div//h4"));

    @Step("Open Main Page")
    public void openAsiakkaatPage() {
        asiakkaatLink.click();
    }

    @Step("Check Asiakkaat Page is opened")
    public void checkAsiakkaatPageIsOpened() {
        asiakkaatHeader.shouldHave(text("Asiakkaat"));
    }
}
