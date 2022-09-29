package selenide.pages;

import com.codeborne.selenide.Condition;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

/**
 *This class contains all Profile page locators and methods.
 */
public class ProfilePage extends Page {

    //locators
    private static final By firstNameField = By.xpath("//*[@data-qa='edit-first-name']");
    private static final By lastNameField = By.xpath("//*[@data-qa='edit-last-name']");
    private static final By saveChangesBtn = By.xpath("//*[@data-qa='edit-profile-btn']");
    private static final By welcomeBackText = By.xpath("//span/span");

    public void changeDataAndCheckIt() {
        faker = new Faker();
        String name = faker.name().firstName();
        $(firstNameField).clear();
        $(firstNameField).setValue(name);
        $(lastNameField).clear();
        $(lastNameField).setValue(faker.name().lastName());
        $(saveChangesBtn).click();
        $(welcomeBackText).shouldHave(Condition.text("Welcome back, " + name));
    }
}
