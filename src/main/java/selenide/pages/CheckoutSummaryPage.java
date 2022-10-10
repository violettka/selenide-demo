package selenide.pages;


import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

/**
 * Class CheckoutSummaryPage contains all checkout summary page locators and methods.
 */
public class CheckoutSummaryPage extends Page {

    //locators
    private static final By reservationBtn = By.xpath("//*[@data-qa='header-navigation-menu']/div[2]");

    //methods
    public UserReservationsPage clickOnUserIcon() {
        $(userIcon).shouldHave(Condition.visible);
        $(userIcon).click();
        $(reservationBtn).shouldHave(Condition.visible);
        $(reservationBtn).click();
        Selenide.sleep(3000);
        return page(UserReservationsPage.class);
    }
}
