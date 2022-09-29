package selenide;

import org.junit.jupiter.api.Test;
import selenide.pages.*;

import static com.codeborne.selenide.Selenide.open;
import static selenide.pages.Page.BASE_URL;

/**
 * This class contains tests for Profile functionality
 */
public class End2EndTests {

    //classes
    private Homepage homePage;
    private LoginPage loginPage;
    private ProfilePage profilePage;
    private ReservationsPage reservationsPage;
    private FilterPage FilterPage;
    private RestaurantPage restaurantPage;

    @Test
    /**
     *The test where a registered user changes his first and last name, searches for restaurants with Argentinean food and then changes his name and last name again
     */
    public void changeFirstAndLastName() {
        homePage = open(BASE_URL, Homepage.class);
        homePage.accCookies();
        loginPage = homePage.clickOnLoginBtn();
        loginPage.fillInValidCred();
        loginPage.clickOnLoginBtnHP();
        profilePage = homePage.clickOnProfileBtn();
        profilePage.changeDataAndCheckIt();
        reservationsPage = profilePage.clickOnReservationsBtn();
        FilterPage = reservationsPage.clickOnDiscoverRestBtn();
        restaurantPage = FilterPage.chooseArgentinianFilter();
        profilePage = restaurantPage.clickOnProfileBtn();
        profilePage.changeDataAndCheckIt();
    }
}
