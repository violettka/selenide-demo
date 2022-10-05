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
    private static final By profileFiels = By.xpath("//*[@data-qa='header-navigation-profile']");

    private static By restaurantField = By.xpath("(//input[@name='dining'])[2]");
    private static By destinationField = By.xpath("(//input[@name='destination'])[2]");
    private static By findBtn = By.xpath("//*[@data-qa='button-search-find-hero']");

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

    public FilterPage searchRestaurant(String restaurantName,String cityName){
        $$(searchRestaurantField).get(1).setValue(restaurantName);
        $$(searchCityField).get(1).setValue(cityName);
        $(findBtn).click();
        return page(FilterPage.class);
    }

    public RestInCharlottePage clickOnCharlotte() {
        $(charlottenburgBtn).click();
        return page(RestInCharlottePage.class);
    }

    public ColnPage clickOnColnBtn() {
        $(colnBtn).click();
        return page(ColnPage.class);
    }

    public ProfilePage userAcc() {
        Selenide.sleep(3000);
        $(userIcon).doubleClick();
        $(profileFiels).click();
        return page(ProfilePage.class);
    }

    public void fillRestaurantField(String what) {
        $(restaurantField).sendKeys(what);
    }

    public void fillDestinationField(String where) {
        $(destinationField).sendKeys(where);
    }

    public FilterPage clickOnFindBtn() {
        $(findBtn).click();
        return page(FilterPage.class);
    }

    public FilterPage fillInTheRestaurantAndClickOnFindBtn() {
        fillDestinationField(RESTAURANT_CITY);
        fillRestaurantField(RESTAURANT_NAME);
        clickOnFindBtn();
        return page(FilterPage.class);
    }
}
