package selenide.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

/**
 * Class Homepage contains all homepage locators and methods.
 */
public class Homepage extends Page {

    // locators
    private static final By signUpBtn = By.xpath("//*[@data-qa='header-register-btn']");
    private static final By userIcon = By.xpath("//*[@data-qa='header-navigation-button']");
    private static final By loginBtn = By.xpath("//*[@data-qa='header-login-btn']");
    private static final By findBtn = By.xpath("//*[@data-qa='button-search-find-hero']");
    private static final By showAllBtn = By.xpath("//*[@data-qa='show-all-button']");
    private static final By italianLabel = By.xpath("//*[@data-qa='filter-cuisine-label-0c6e9969-c50e-4ae9-ba22-a9b6b1a1f047']");
    private static final By firstRestaurantBtn = By.xpath("//a[contains(.,'Cavallino Rosso')]");

    // methods
    public SignUpPage clickOnSignUpBtn() {
        $(signUpBtn).click();
        return Selenide.page(SignUpPage.class);
    }

    public LoginPage clickOnLoginBtn() {
        $(loginBtn).click();
        return page(LoginPage.class);
    }

    public void userIconPresent() {
        $(userIcon).should(Condition.exist);
    }

    public FilterPage searchRestaurant(String restaurantName, String cityName) {
        $$(searchRestaurantField).get(1).setValue(restaurantName);
        $$(searchCityField).get(1).setValue(cityName);
        $(findBtn).click();
        return page(FilterPage.class);
    }

    public Homepage clickOnShowAllBtn() {
        $(showAllBtn).click();
        return Selenide.page(Homepage.class);
    }

    public Homepage clickOnItalianLabel() {
        $(italianLabel).click();
        return Selenide.page(Homepage.class);
    }

    public RestaurantPage clickOnFirstRestaurantBtn() {
        $(firstRestaurantBtn).click();
        return Selenide.page(RestaurantPage.class);
    }
}