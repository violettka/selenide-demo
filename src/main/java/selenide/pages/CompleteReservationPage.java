package selenide.pages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class CompleteReservationPage extends Page {

    // locators
    private static final By reserveNowBtn = By.xpath("//button[@data-qa='reservation-submit']");
    private static By loginBtn = By.xpath("//*[@data-qa='header-login-btn']");

    // methods
    public CheckoutSummaryPage clickOnReserveNowBtn() {
        $(reserveNowBtn).click();
        return page(CheckoutSummaryPage.class);
    }
}
