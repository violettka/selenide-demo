package selenide.pages;

import com.codeborne.selenide.Selenide;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

/**
 * Class CompleteReservationPage contains all complete reservation locators and methods.
 */
public class CompleteReservation extends Page {

    //locators
    private static final By reserveNowBtn = By.xpath("//*[@data-qa='reservation-submit']");

    //methods
    public CheckoutSummaryPage clickOnReserveNowBtn() {
        Selenide.sleep(3000);
        $(reserveNowBtn).click();
        return page(CheckoutSummaryPage.class);
    }
}
