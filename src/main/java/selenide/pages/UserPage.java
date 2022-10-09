package selenide.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class UserPage extends Page{

    // Locators
    private static final By reservationCard = By.xpath("//*[@data-qa='reservation-card-0']");
    private static final By cancelBtn = By.xpath("//div[2]/button");
    private static final By cancelReservation = By.xpath("//*[@data-qa='cancel_no']");

    // Methods
    public UserPage clickOnCancelPresentReservation(){
        $(reservationCard).shouldBe(Condition.visible);
        $(reservationsBtn).shouldHave(Condition.visible);
        $(reservationsBtn).click();
        Selenide.sleep(3000);
        $(cancelBtn).click();
        $(cancelReservation).shouldHave(Condition.visible);
        Selenide.sleep(3000);
        $(cancelReservation).click();
        return page(UserPage.class);

    }

}
