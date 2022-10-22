package selenide.pages;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

/**
 * Class FilterPage contains all filter page locators and methods.
 */
public class FilterPage extends Page {

    //locators
    private static final By firstRestaurantBtn = By.xpath("//*[@id='tab-merchants']/div[2]/div[1]/a");
    private static By arabicCuisineFilter = By.xpath("//div[@data-qa='filter-cuisine-label-5e6ac69c-e488-46ef-9987-22f7a3e81fc2']");
    private static By sixthRestaurant = By.xpath("//*[@id='tab-merchants']/div[7]/div[1]/a");

    // methods
    public RestaurantPage clickOnFirstRestaurantBtn() {
        $(firstRestaurantBtn).click();
        return page(RestaurantPage.class);
    }
    public void clickOnArabicCuisine() {
        $(arabicCuisineFilter).should(Condition.visible).click();
    }
    public RestaurantPage clickOnChooseRestaurant() {
        $(sixthRestaurant).click();
        return page(RestaurantPage.class);
    }
}
