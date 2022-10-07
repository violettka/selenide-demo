package selenide.pages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

/**
 * Class CancelReservationPage contains all cancel reservation page locators and methods.
 */
public class CancelReservationPage {

    //locators
    private static final By confirmCancelBtn = By.xpath("//*[@data-qa='cancel_no']");

    //methods
    public void clickOnConfirmCancelBtn() {
        $(confirmCancelBtn).click();
    }
}
