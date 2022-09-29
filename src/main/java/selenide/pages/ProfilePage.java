package selenide.pages;

import com.codeborne.selenide.Condition;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

/**
 *This class contains all Profile page locators and methods.
 */
public class ProfilePage extends Page{

    //constants
    public static String CHANGENAME = "Welcome back, Андрей";

    //locators
    private static final By firstNameField = By.xpath("//*[@data-qa='edit-first-name']");
    private static final By lastNameField = By.xpath("//*[@data-qa='edit-last-name']");
    private static final By saveChangesBtn = By.xpath("//*[@data-qa='edit-profile-btn']");
    private static final By reservationsBtn = By.xpath("//*[@data-qa='navigation-reservations']");
    private static final By welcomeBackText = By.xpath("//span/span");

    public void  changeData() {
        faker = new Faker();
        $(firstNameField).clear();
        $(firstNameField).setValue(faker.name().firstName());
        $(lastNameField).clear();
        $(lastNameField).setValue(faker.name().lastName());
        $(saveChangesBtn).click();
    }

    public ReservationsPage clickOnReservationsBtn() {
        $(reservationsBtn).click();
        return page(ReservationsPage.class);
    }

    public void checkName() {
        $(welcomeBackText).shouldHave(Condition.text(CHANGENAME));
    }
}
