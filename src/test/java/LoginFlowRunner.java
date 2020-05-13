import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = "/Users/jenkins-ra-macmini/CucunberGmail/src/test/resources/GmailLogin.feature",
        glue = "", plugin = "html:target/html-report.xml")
public class LoginFlowRunner extends AbstractTestNGCucumberTests {
}
