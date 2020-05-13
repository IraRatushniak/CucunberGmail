import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
    @Before
    public void openWebBrowser(){
        WebController.open("https://accounts.google.com/ServiceLogin/identifier");
    }

    @After
    public void quitDriver(){
        WebController.quit();
    }
}
