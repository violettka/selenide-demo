package selenide;

import org.junit.jupiter.api.Test;
import selenide.pages.*;

import static com.codeborne.selenide.Selenide.open;
import static selenide.pages.Page.*;

public class RestaurantReservationTest {

    Homepage homepage;
    LoginPage loginPage;
    FilterPage filterPage;
    RestaurantPage restaurantPage;
    CompleteReservationPage completeReservationPage;
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
        filterPage = homepage.searchRestaurant(SAMPLE_RESTAURANT,SAMPLE_CITY);
        restaurantPage = filterPage.clickOnFirstRestaurantBtn();
        completeReservationPage = restaurantPage.reserveNow();
        checkoutSummaryPage = completeReservationPage.clickOnReserveNowBtn();
        userReservationsPage = checkoutSummaryPage.clickOnLoginIcon();
        userReservationsPage.anyRestaurantIsDisplayed();
    }
}