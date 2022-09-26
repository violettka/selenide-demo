package selenide.pages;

import com.codeborne.selenide.Selenide;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

/**
 *This class contains LaBandida page locators and methods.
 */
public class LaBandidaPage extends Page{

    //locators
    private static final By iconBtn = By.xpath("//*[@data-qa='header-navigation-button']");
    private static final By profileBtn = By.xpath("//*[@data-qa='header-navigation-profile']");

    public ProfilePage clickOnProfile() {
        Selenide.sleep(3000);
        $(iconBtn).doubleClick();
        $(profileBtn).click();
        return page(ProfilePage.class);
    }
}
