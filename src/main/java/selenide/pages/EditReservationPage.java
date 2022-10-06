package selenide.pages;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

/**
 * Class EditReservationPage contains all edit reservation page locators and methods.
 */
public class EditReservationPage {

    //locators
    private static final By userGreeting = By.xpath("//*[@id='root']/section/div[3]/div/div[2]/h1");

    //methods
    public void checkName(String userName) {
        $(userGreeting).shouldHave(Condition.text("Hi " + userName));
    }
}
