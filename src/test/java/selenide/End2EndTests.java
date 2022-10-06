package selenide;

import org.junit.jupiter.api.Test;
import selenide.pages.*;

import static com.codeborne.selenide.Selenide.open;
import static selenide.pages.Page.*;

/**
 * Class End2EndTests contains End2End tests for Quandoo
 */
public class End2EndTests {

    //classes
    private Homepage homepage;
    private LoginPage loginPage;
    private FilterPage filterPage;
    private RestaurantPage restaurantPage;
    private CompleteReservation completeReserv;
    private CheckoutSummaryPage checkoutSumPage;
    private ProfilePage profilePage;
    private UserReservationsPage userReservPage;
    private EditReservationPage editReservPage;


    @Test
    /**
     * This test checks edited user's name in the existing reservation
     */
    public void makeReservationAndChangeName() {
        homepage = open(BASE_URL, Homepage.class);
        homepage.accCookies();
        loginPage = homepage.clickOnLoginBtn();
        loginPage.fillInValidCred();
        homepage = loginPage.clickOnLoginBtnHP();
        filterPage = homepage.searchRestaurant(SAMPLE_RESTAURANT,SAMPLE_CITY);
        restaurantPage = filterPage.clickOnFirstRestaurantBtn();
        restaurantPage.chooseReservationDate();
        completeReserv = restaurantPage.clickOnReserveTable();
        checkoutSumPage = completeReserv.clickOnReserveNowBtn();
        profilePage = checkoutSumPage.clickOnProfileBtn();
        profilePage.changeFirstAndLastName(USER_FIRST_NAME,USER_LAST_NAME);
        userReservPage = profilePage.clickOnReservationsBtn();
        editReservPage = userReservPage.clickOnEditReservation();
        editReservPage.checkName(USER_FIRST_NAME);
    }
}
