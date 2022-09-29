package selenide.pages;

import com.codeborne.selenide.Selenide;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

/**
 *This class contains Restaurant page locators and methods.
 */
public class RestaurantPage extends Page{

    //methods
    public ProfilePage clickOnProfile() {
        Selenide.sleep(3000);
        $(userIcon).doubleClick();
        $(profileBtn).click();
        return page(ProfilePage.class);
    }
}
