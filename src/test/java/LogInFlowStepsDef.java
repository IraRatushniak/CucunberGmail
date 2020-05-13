import Verify.AccountPageVerify;
import Verify.GmailPageVerify;
import Verify.LoginPageVerify;
import Verify.PasswordPageVerify;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import page.GmailPage;
import page.LoginPage;
import page.PasswordPage;

public class LogInFlowStepsDef {

    @Given("^User stays on log in page$")
    public void userStaysOnLogInPage() {
        LoginPageVerify loginPageVerify = new LoginPageVerify();
        loginPageVerify.verifyIpfEmailIsEmpty();
        loginPageVerify.verifyBtnNextIsVisible();
    }

    @When("^User insert correct login \"([^\"]*)\"$")
    public void userInsertCorrectLogin(String email) {
        LoginPageVerify loginPageVerify = new LoginPageVerify();
        LoginPage loginPage = new LoginPage();
        loginPageVerify.verifyIpfEmailIsEmpty();
        loginPage.setIpfEmail(email);
        loginPageVerify.verifyIpfEmailHasText(email);
    }

    @And("^Click btn next for log in page$")
    public void clickBtnNextForLogInPage() {
        LoginPageVerify loginPageVerify = new LoginPageVerify();
        LoginPage loginPage = new LoginPage();
        loginPageVerify.verifyBtnNextIsVisible();
        loginPage.clickBtnNext();
    }

    @Then("^User is redirected to Password Page$")
    public void userIsRedirectedToPasswordPage() {
        PasswordPageVerify passwordPageVerify = new PasswordPageVerify();
        passwordPageVerify.verifyIpfPasswordIsEmpty();
        passwordPageVerify.verifyBtnNextIsVisible();
    }

    @When("^User insert correct password \"([^\"]*)\"$")
    public void userInsertCorrectPassword(String pass) {
        PasswordPage passwordPage = new PasswordPage();
        PasswordPageVerify passwordPageVerify = new PasswordPageVerify();
        passwordPageVerify.verifyIpfPasswordIsEmpty();
        passwordPage.setIpfPassword(pass);
        passwordPageVerify.verifyIpfPasswordHasText(pass);
    }

    @And("^Click btn next for gmail page$")
    public void clickBtnNextForGmailPage() {
        PasswordPage passwordPage = new PasswordPage();
        PasswordPageVerify passwordPageVerify = new PasswordPageVerify();
        passwordPageVerify.verifyBtnNextIsVisible();
        passwordPage.clickBtnNext();
    }

    @Then("^User is redirected to Account Page for user \"([^\"]*)\"$")
    public void userIsRedirectedToAccountPageForUser(String username) {
        AccountPageVerify accountPageVerify = new AccountPageVerify();
        accountPageVerify.verifyPageTitle(username);
    }
}
