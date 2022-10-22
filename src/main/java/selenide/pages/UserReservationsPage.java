package selenide.pages;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

/**
 * Class UserReservationsPage contains all user reservations page locators and methods.
 */
public class UserReservationsPage extends Page {

    // locators
    private static final By editReservationBtn = By.xpath("//button[contains(.,'Edit reservation')]");
    static final By cancelReserveAgainBtn = By.xpath("//*[@data-qa='cta-rebook-reservation-101065855']");
    static final By yesCancelReservationBtn = By.xpath("//*[@data-qa='cancel_no']");

    // methods
    public EditReservationPage clickOnEditReservation() {
        $(editReservationBtn).shouldBe(Condition.visible);
        $(editReservationBtn).click();
        return page(EditReservationPage.class);
    }

    public UserReservationsPage clickOnReservations() {
        $(reservationsBtn).click();
        return page(UserReservationsPage.class);
    }

    public UserReservationsPage clickOnYesCancelReservationBtn() {
        $(yesCancelReservationBtn).shouldBe(Condition.visible);
        $(yesCancelReservationBtn).click();
        return page(UserReservationsPage.class);
    }

    public RestaurantPage checkReserveAgainBtn() {
        $(cancelReserveAgainBtn).shouldBe(Condition.visible);
        return page(RestaurantPage.class);
    }

    public UserReservationsPage clickOnCancelReservationBtn() {
        $(cancelReserveAgainBtn).click();
        return page(UserReservationsPage.class);
    }
}

