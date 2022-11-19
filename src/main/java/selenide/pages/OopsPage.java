package selenide.pages;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class OopsPage {

    //locators
    private static final By pageNotFoundMessage = By.xpath("//h2");

    // methods
    public void pageNotFoundMessageExists() {
        $(pageNotFoundMessage).shouldBe(Condition.visible);
    }
}
