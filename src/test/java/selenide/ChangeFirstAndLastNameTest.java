package selenide;

import org.junit.jupiter.api.Test;
import selenide.pages.*;

import static com.codeborne.selenide.Selenide.open;
import static selenide.pages.Page.BASE_URL;

/**
 * This class contains tests for Profile functionality
 */
public class ChangeFirstAndLastNameTest {

    //classes
    private Homepage homePage;
    private LoginPage loginPage;
    private ProfilePage profilePage;
    private ReservationsPage reservationsPage;
    private RestaurantsBerlinPage restaurantsBerlinPage;
    private LaBandidaPage laBandidaPage;

    @Test
    /**
     *The negative test where a registered user changes his first and last name, searches for restaurants with Argentinean food and then changes his name and last name again
     */
    public void changeFirstAndLastName() {
        homePage = open(BASE_URL, Homepage.class);
        homePage.accCookies();
        loginPage = homePage.clickOnLoginBtn();
        loginPage.fillInValidCred();
        loginPage.clickOnLoginBtnHP();
        profilePage = homePage.userAcc();
        profilePage.changeData();
        reservationsPage = profilePage.clickOnReservations();
        restaurantsBerlinPage = reservationsPage.clickOnDiscoverRestBtn();
        laBandidaPage = restaurantsBerlinPage.chooseFilter();
        profilePage = laBandidaPage.clickOnProfile();
        profilePage.changeDataAgain();
        profilePage.checkName();
    }
}
