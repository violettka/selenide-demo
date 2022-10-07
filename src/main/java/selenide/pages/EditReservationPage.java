package selenide.pages;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

/**
 * Class EditReservationPage contains all edit reservation page locators and methods.
 */
public class EditReservationPage {

    //locators
    private static final By userGreeting = By.xpath("//*[@id='root']/section/div[3]/div/div[2]/h1");
    private static final By cancelReservationBtn = By.xpath("//*[@id='root']/section/div[3]/div/div[2]/div[2]/div[2]/a");

    //methods
    public void checkName(String userName) {
        $(userGreeting).shouldHave(Condition.text("Hi " + userName));
    }

    public CancelReservationPage cancelReservation(){
        $(cancelReservationBtn).click();
        return page(CancelReservationPage.class);
    }
}
