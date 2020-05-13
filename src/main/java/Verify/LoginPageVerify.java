package Verify;

import com.codeborne.selenide.Condition;
import page.LoginPage;

public class LoginPageVerify extends Verify {
    private LoginPage loginPage = new LoginPage();

    public LoginPageVerify verifyIpfEmailIsEmpty() {
        log("Ipf email is empty");
        loginPage.getIpfEmail().shouldBe(Condition.visible).shouldBe(Condition.empty);
        return this;
    }

    public LoginPageVerify verifyIpfEmailHasText(String email) {
        log("Ipf email has text %s", email);
        loginPage.getIpfEmail().shouldBe(Condition.visible).shouldHave(Condition.attribute(
                "data-initial-value", email));
        return this;
    }

    public LoginPageVerify verifyBtnNextIsVisible() {
        log("Btn 'Next' is visible");
        loginPage.getBtnNext().shouldBe(Condition.visible);
        return this;
    }
}
