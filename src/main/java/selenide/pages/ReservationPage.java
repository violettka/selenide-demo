package selenide.pages;

import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class ReservationPage extends Page {

    // locators
    private static final By reserveNowBtn = By.xpath("//button[@data-qa='reservation-submit']");

    // methods
    public UserReservationsPage clickOnProfileBtn() {
        $(profileBtn).click();
        return page(UserReservationsPage.class);
    }

    public CompleteReservationPage clickOnReserveNowBtn() {
        $(reserveNowBtn).click();
        return page(CompleteReservationPage.class);
    }
}

