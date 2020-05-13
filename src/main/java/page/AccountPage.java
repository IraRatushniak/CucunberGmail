package page;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class AccountPage {
    SelenideElement pageTitle = $("h1");

    public SelenideElement getPageTitle() {
        return pageTitle;
    }
}
