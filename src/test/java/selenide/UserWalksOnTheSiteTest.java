package selenide;

import org.junit.jupiter.api.Test;

import selenide.pages.*;

import static com.codeborne.selenide.Selenide.open;
import static selenide.pages.Page.BASE_URL;


/**
 * This class contains tests where the user walks on the site
 */
public class UserWalksOnTheSiteTest {

    //classes
    private Homepage homePage;
    private LoginPage loginPage;
    private RestInCharlottePage restInCharlottePage;
    private TwoFriendsPage twoFriendsPage;
    private ColnPage colnPage;

    @Test
    /**
     * The test where a registered user walks on the site and clicks on different filters
     */
    public void userWalksOnSite() {
        homePage = open(BASE_URL, Homepage.class);
        homePage.accCookies();
        loginPage = homePage.clickOnLoginBtn();
        loginPage.fillInValidCred();
        loginPage.clickOnLoginBtnHP();
        restInCharlottePage = homePage.clickOnCharlotte();
        twoFriendsPage = restInCharlottePage.chooseBurgersFilter();
        homePage = twoFriendsPage.exploreTwoFriends();
        colnPage = homePage.clickOnColnBtn();
        homePage = colnPage.outdoorSeating();
    }
}
