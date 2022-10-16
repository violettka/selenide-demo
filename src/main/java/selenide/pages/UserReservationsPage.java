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
    static final By reserveAgainBtn = By.xpath("//*[@data-qa='cta-rebook-reservation-101065855']");
    static final By cancelReservationBtn = By.xpath("//*[@data-qa='cta-rebook-reservation-101065855']");
    static final By yesCancelReservationBtn = By.xpath("//*[@data-qa='cancel_no']");

    //test data

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
        $(yesCancelReservationBtn).click();
        return page(UserReservationsPage.class);
    }


    public RestaurantPage clickOnReserveAgainBtn() {
        $(reserveAgainBtn).click();
        return page(RestaurantPage.class);
    }


    public UserReservationsPage clickOnCancelReservationBtn() {
        $(cancelReservationBtn).click();
        return page(UserReservationsPage.class);
    }


}

