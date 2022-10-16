package selenide;

import org.junit.jupiter.api.Test;
import selenide.pages.*;

import static com.codeborne.selenide.Selenide.open;

/**
 * Class End2EndTests contains End2End tests for Quandoo
 */
public class End2EndTests extends Page {

    private Homepage homepage;
    private LoginPage loginPage;
    private FilterPage filterPage;
    private RestaurantPage restaurantPage;
    private CompleteReservationPage completeReservationPage;
    private CheckoutSummaryPage checkoutSumPage;
    private ProfilePage profilePage;
    private UserReservationsPage userReservationsPage;
    private EditReservationPage editReservationPage;
    private ReservationPage reservationPage;

    /**
     * This test checks the possibility of changing the day a booking
     */
    @Test
    public void LogInBookingChangeCancellationOfBooking() {

        //classes
        homepage = open(BERLIN_URL, Homepage.class);
        homepage.accCookies();
        loginPage = homepage.clickOnLoginBtn();
        loginPage.fillInValidCred();
        homepage = loginPage.clickOnLoginBtnHP();
        homepage.clickOnShowAllBtn();
        homepage.clickOnItalianLabel();
        restaurantPage = homepage.clickOnFirstRestaurantBtn();
        restaurantPage.chooseReservationDate();
        reservationPage = restaurantPage.clickOnReserveBtn();
        completeReservationPage = reservationPage.clickOnReserveNowBtn();
        reservationPage.clickOnHeaderNavigationBtn();
        userReservationsPage = reservationPage.clickOnProfileBtn();
        userReservationsPage.clickOnReservations();
        editReservationPage = userReservationsPage.clickOnEditReservation();
        editReservationPage.chooseReservationDateERP();
        editReservationPage.checkTextOptional();
        editReservationPage.clickOnUpdateReservationBtn();
        reservationPage.clickOnHeaderNavigationBtn();
        userReservationsPage = reservationPage.clickOnProfileBtn();
        userReservationsPage.clickOnReservations();
        userReservationsPage.clickOnCancelReservationBtn();
        userReservationsPage.clickOnYesCancelReservationBtn();
        userReservationsPage.clickOnReservations();
        restaurantPage = userReservationsPage.clickOnReserveAgainBtn();
    }
}
