package fi.comiq.tests.pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class RekrytointiPage {

    SelenideElement rekrytointiLink = $(By.xpath("//span[contains(text(), \"Rekrytointi\")]"));
    SelenideElement vacanciesButton = $("a[id='vacancies']");
    SelenideElement vacanciesMenu = $("#rekry-menu");

    @Step("Open Main Page")
    public void openRekrytointiPage() {
        rekrytointiLink.click();
    }

    @Step("Check Rekrytointi Page is opened")
    public void checkRekrytointiPageIsOpened() {
        vacanciesButton.scrollTo().shouldBe(visible);
    }

    @Step("check Test Automation Expert vacancy")
    public void checkTestAutomationExpertVacancy() {
        vacanciesMenu.scrollTo().shouldHave(text("Testausautomaation asiantuntija"));
    }
}
