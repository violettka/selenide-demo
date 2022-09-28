package selenide.pages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;


/**
 * Class CheckoutSummaryPage contains all checkout summary page locators and methods.
 */
public class CheckoutSummaryPage extends Page {

    // locators
    private static final By loginIcon = By.xpath("//*[@data-qa='header-navigation-button");
    private static final By reservations = By.xpath("//*[@data-qa='header-navigation-button");

    // methods
    public UserReservationsPage clickOnLoginIcon() {
        $(loginIcon).click();
        $(reservations).click();
        return page(UserReservationsPage.class);
    }
}
