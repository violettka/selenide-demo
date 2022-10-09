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
    private static final By findBtn = By.xpath("//*[@data-qa='button-search-find-hero']");

    // methods
    public SignUpPage clickOnSignUpBtn() {
        $(signUpBtn).click();
        return page(SignUpPage.class);
    }

    public LoginPage clickOnLoginBtn() {
        $(loginBtn).click();
        return page(LoginPage.class);
    }

    public void userIconPresent() {
        $(userIcon).should(Condition.exist);
    }

    public FilterPage searchRestaurant(String restaurantName, String cityName){
        $$(searchRestaurantField).get(1).setValue(restaurantName);
        $$(searchCityField).get(1).setValue(cityName);
        $(findBtn).click();
        return page(FilterPage.class);
    }
    public FilterPage chooseCity(String cityName) {
        $$(searchCityField).get(1).setValue(cityName);
        Selenide.sleep(5000);
        $(findBtn).click();
        return page(FilterPage.class);
    }


}