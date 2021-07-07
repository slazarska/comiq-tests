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
    SelenideElement vacanciesLink = $("a[href='#rekry-vacancies']");
    SelenideElement testAutomationExpertVacancy = $("#rekry-4");

    @Step("Open Main Page")
    public void openRekrytointiPage() {
        rekrytointiLink.click();
    }

    @Step("Check Rekrytointi Page is opened")
    public void checkRekrytointiPageIsOpened() {
        vacanciesButton.shouldBe(visible);
    }

    @Step("Open open vacancies")
    public void openVacancies() {
        vacanciesLink.click();
    }

    @Step("Open Test Automation Expert Vacancy")
    public void openTestAutomationExpertVacancy() {
        testAutomationExpertVacancy.shouldHave(text("Testausautomaation asiantuntija"));
        testAutomationExpertVacancy.click();
    }
}
