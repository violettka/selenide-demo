package selenide.pages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

/**
 * Class CompleteReservationPage contains all complete reservation locators and methods.
 */
public class CompleteReservationPage extends Page {

    //locators
    private static final By reserveNowBtn = By.xpath("//*[@data-qa='reservation-submit']");
    private static final By textOptional = By.xpath("//span[contains( text(),'Optional')]");
    //methods

    public CheckoutSummaryPage clickOnReserveNowBtn() {
        $(reserveNowBtn).click();
        if ($$(reserveNowBtn) != null) {
            return page(CheckoutSummaryPage.class);
        }
        return null;
    }
}
