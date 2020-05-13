package page;

import com.codeborne.selenide.SelenideElement;
import lombok.extern.slf4j.Slf4j;

import static com.codeborne.selenide.Selenide.$;

@Slf4j
public class LoginPage {
    private SelenideElement ipfEmail = $("input[type*='email']");
    private SelenideElement btnNext = $("#identifierNext");

    private static final String VERIFICATION_PREFIX = "[Log in page] ";

    public static void log(String msg, Object... args) {
        log.info(VERIFICATION_PREFIX + String.format(msg, args));
    }

    public LoginPage setIpfEmail(String email) {
        log("Set ipf email with value '%s'", email);
        ipfEmail.setValue(email);
        return this;
    }

    public PasswordPage clickBtnNext() {
        log("Click btn 'Next'");
        btnNext.click();
        return new PasswordPage();
    }

    public SelenideElement getIpfEmail() {
        return ipfEmail;
    }

    public SelenideElement getBtnNext() {
        return btnNext;
    }
}
