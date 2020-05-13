package Verify;

import com.codeborne.selenide.Condition;
import page.AccountPage;

public class AccountPageVerify extends Verify {
    private AccountPage accountPage = new AccountPage();

    public AccountPageVerify verifyPageTitle(String userName) {
        log("Account page with title %s is displayed", userName);
        accountPage.getPageTitle().shouldHave(Condition.text("Welcome, " + userName));
        return this;
    }
}
