package selenide.pages;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;


/**
 * Class CheckoutSummaryPage contains all checkout summary page locators and methods.
 */
public class CheckoutSummaryPage extends Page {

    public static String specialName = "";

    // locators
    private static final By loginIcon = By.xpath("//*[@data-qa='header-navigation-button");
    private static final By reservations = By.xpath("//*[@data-qa='header-navigation-button");
    private static By restaurantName = By.xpath("//*[@data-qa='reservation-details-merchant-name']");
    private static final By upcomingReservations = By.xpath("//*[@data-qa='cards-upcoming-reservations']");

    // methods
    public UserReservationsPage clickOnLoginIcon() {
        specialName = $(restaurantName).getText();
        $(loginIcon).click();
        $(reservations).click();
        $(upcomingReservations).shouldHave(Condition.text(specialName));
        return page(UserReservationsPage.class);
    }
}
