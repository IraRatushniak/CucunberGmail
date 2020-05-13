import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class WebController {
    public static void open(String relativeOrAbsoluteUrl) {
        log.info("ChromeDriver loaded.");
        System.setProperty("webdriver.chrome.driver",
                "/opt/jenkins/slave/workspace/webdriver/chromedriver");
        System.setProperty("selenide.browser", "Chrome");
        Selenide.open(relativeOrAbsoluteUrl, "", "", "");
    }

    public static void quit() {
        WebDriverRunner.getWebDriver().quit();
    }
}
