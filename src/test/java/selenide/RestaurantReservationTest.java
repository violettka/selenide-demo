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

    @Test
/**
 *  Check On Reserve Now Btn
 */
    public void setReservationAndFilter() {

        homepage = open(BASE_URL, Homepage.class);
        homepage.accCookies();
        loginPage = homepage.clickOnLoginBtn();
        loginPage.fillInValidCred();
        homepage = loginPage.clickOnLoginBtnHP();
        filterPage = homepage.searchRestaurant("",SAMPLE_CITY);
        filterPage.clickOnArabicCuisine();
        restaurantPage = filterPage.clickOnChooseRestaurant();
        restaurantPage.chooseReservationDate();
        completeReservation = restaurantPage.clickOnReserveTable();
        completeReservation.checkOnReserveNowBtn();



    }
}
