package selenide.pages;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.*;

/**
 * Class CompleteReservationPage contains all complete reservation locators and methods.
 */
public class CompleteReservation extends Page {

    //locators
    private static final By reserveNowBtn = By.xpath("//*[@data-qa='reservation-submit']");
    private static final By promoCodeText = By.xpath("//*[@data-qa='input-promo-code']");

    //methods
    public CheckoutSummaryPage checkOnReserveNowBtn() {
        $(promoCodeText).shouldHave(Condition.visible);
        $(reserveNowBtn).should(Condition.appear).click();
        if ($$(reserveNowBtn) != null) {
            System.out.println("reservBtn");
        }
        return page(CheckoutSummaryPage.class);
    }
}