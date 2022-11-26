package ru.netology.page;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class CardReplenishment {
    private SelenideElement heading = $("[data-test-id=dashboard]");
    private SelenideElement sum = $("[data-test-id=amount] input");
    private SelenideElement whenceField = $("span[data-test-id=from] input");
    private SelenideElement topButton = $("button[data-test-id=action-transfer]");

    public CardReplenishment() {
        heading.shouldBe(Condition.visible);
    }

    public DashboardPage topUpTheCard(int amount, String cardNumber) {
        sum.setValue(String.valueOf(amount));
        whenceField.setValue(cardNumber);
        topButton.click();
        return new DashboardPage();
    }
}

