package pages;
import com.codeborne.selenide.Selenide;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class Homepage extends Page {

    Homepage homePage;
    FilterPage filterPage;

    // locators
    private static By signUpBtn = By.xpath("//*[@data-qa='header-register-btn']");
    private static By userIcon = By.xpath("//*[@data-qa='header-navigation-button']");
    private static By loginBtn = By.xpath("//*[@data-qa='header-login-btn']");

    private static By restaurantField = By.xpath("//input[@name='dining'])[2]");
    private static By destinationField = By.xpath("//input[@name='destination'])[2]");
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
        $(userIcon).isDisplayed();
    }

    public void fillRestaurantField(String what) {
        $(restaurantField).sendKeys(what);
    }

    public void fillDestinationField(String where) {
        $(destinationField).sendKeys(where);
    }

    public FilterPage clickOnFindBtn() {
        $(findBtn).click();
        return Selenide.page(FilterPage.class);
    }

    public void fillInTheRestaurant() {
        homePage.fillDestinationField(CITY);
        homePage.fillRestaurantField(NAME);
        filterPage = homePage.clickOnFindBtn();
    }
}

