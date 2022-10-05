package selenide;

import org.junit.jupiter.api.Test;
import selenide.pages.*;

import static com.codeborne.selenide.Selenide.open;
import static selenide.pages.Page.BASE_URL;

public class RestaurantReservationTest {

    Homepage homepage;
    LoginPage loginPage;
    FilterPage filterPage;
    RestaurantPage restaurantPage;
    ReservationPage reservationPage;
    CheckoutSummaryPage checkoutSummaryPage;
    UserReservationsPage userReservationsPage;

    @Test
    /**
     * A positive test in which the user visits the site, selects a restaurant, and makes a reservation
     */
    public void firstLogInThanRestaurantReservation() {
        homepage = open(BASE_URL, Homepage.class);
        homepage.accCookies();
        loginPage = homepage.clickOnLoginBtn();
        loginPage.fillInValidCred();
        loginPage.clickOnLoginBtnHP();
        filterPage = homepage.fillInTheRestaurantAndClickOnFindBtn();
        restaurantPage = filterPage.clickOnRestaurant();
        restaurantPage.reserveNow("7:00 pm", "7:30 pm");
        checkoutSummaryPage = reservationPage.clickOnReserveNowBtn();
        userReservationsPage = checkoutSummaryPage.clickOnLoginIcon();
        userReservationsPage.restaurantIsDisplayed();
    }
}
