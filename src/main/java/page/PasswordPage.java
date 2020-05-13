package page;

import com.codeborne.selenide.SelenideElement;
import lombok.extern.slf4j.Slf4j;

import static com.codeborne.selenide.Selenide.$;

@Slf4j
public class PasswordPage {
    private SelenideElement ipfPassword = $("input[type*='password']");
    private SelenideElement btnNext = $("#passwordNext");

    private GmailPage gmailPage;

    private static final String VERIFICATION_PREFIX = "[Log in page] ";

    public static void log(String msg, Object... args) {
        log.info(VERIFICATION_PREFIX + String.format(msg, args));
    }

    public PasswordPage setIpfPassword(String password) {
        log("Set ipf password with value '%s'", password);
        ipfPassword.setValue(password);
        return this;
    }

    public GmailPage clickBtnNext() {
        log("Click btn 'Next'");
        btnNext.click();
        return gmailPage;
    }

    public SelenideElement getIpfPassword() {
        return ipfPassword;
    }

    public SelenideElement getBtnNext() {
        return btnNext;
    }
}
