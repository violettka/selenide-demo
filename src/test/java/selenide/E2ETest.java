package selenide;

import org.junit.jupiter.api.Test;

import selenide.pages.*;

import static com.codeborne.selenide.Selenide.open;
import static selenide.pages.Page.*;

public class E2ETest {

    Homepage homePage;
    LoginPage loginPage;
    FilterPage filterPage;
    RestaurantPage restaurantPage;
    ReservationPage reservationPage;
    UserReservationsPage userReservationsPage;


    @Test
   public void LogInBookingChangeCancellationOfBooking() {
        homePage = open(BASE_URL, Homepage.class);
        homePage.accCookies();
        homePage.fillRestaurantField(NAME);
        homePage.fillDestinationField(CITY);
        loginPage = homePage.clickOnLoginBtn();
        loginPage.fillInValidCred();
        loginPage.clickOnLoginBtnHP();




    }
}

