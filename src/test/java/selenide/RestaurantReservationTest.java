package selenide;

import org.junit.jupiter.api.Test;
import selenide.pages.*;
import static com.codeborne.selenide.Selenide.open;
import static selenide.pages.Page.BASE_URL;
import static selenide.pages.Page.SAMPLE_CITY;

/**
 * Contains RestaurantReservationTest tests for Quandoo
 */
public class RestaurantReservationTest {

    //classes
    private Homepage homepage;
    private LoginPage loginPage;
    private FilterPage filterPage;
    private RestaurantPage restaurantPage;
    private CompleteReservation completeReservation;
    private CheckoutSummaryPage checkoutSummaryPage;
    private UserReservationsPage userReservationsPage;

    @Test
/**
 *  Test End2End-Restaurant reservation and cancellation
 */
    public void setReservationAndFilter() {

        homepage = open(BASE_URL, Homepage.class);
        homepage.accCookies();
        loginPage = homepage.clickOnLoginBtn();
        loginPage.fillInValidCred();
        homepage = loginPage.clickOnLoginBtnHP();
        filterPage = homepage.chooseCity(SAMPLE_CITY);
        filterPage.chooseCuisine();
        restaurantPage = filterPage.clickOnChooseRestaurant();
        restaurantPage.chooseReservationDate();
        completeReservation = restaurantPage.clickOnReserveTable();
        checkoutSummaryPage = completeReservation.clickOnReserveNowBtn();
        userReservationsPage = checkoutSummaryPage.clickOnUserIcon();
        userReservationsPage.clickOnCancelPresentReservation();

    }

}
