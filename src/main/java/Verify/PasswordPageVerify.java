package Verify;

import com.codeborne.selenide.Condition;
import page.PasswordPage;

public class PasswordPageVerify extends Verify {
    private PasswordPage passwordPage = new PasswordPage();

    public PasswordPageVerify verifyIpfPasswordIsEmpty() {
        log("Ipf password is empty");
        passwordPage.getIpfPassword().shouldBe(Condition.visible).shouldBe(Condition.empty);
        return this;
    }

    public PasswordPageVerify verifyIpfPasswordHasText(String pass) {
        log("Ipf password has text %s", pass);
        passwordPage.getIpfPassword().shouldBe(Condition.visible).shouldHave(Condition.attribute(
                "data-initial-value", pass));
        return this;
    }

    public PasswordPageVerify verifyBtnNextIsVisible() {
        log("Btn 'Next' is visible");
        passwordPage.getBtnNext().shouldBe(Condition.visible);
        return this;
    }
}
