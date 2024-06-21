package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.messages.types.Scenario;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Hooks {

    public static WebDriver driver;
    public static ChromeOptions GenerateDriverChrome() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--no-sandbox",
//               "--single-process",
                "--ignore-ssl-errors=yes",
                "--ignore-certificate-errors",
                "--window-size=1280,800",
                "--remote-allow-origins=*"
                            , "headless"
        );
        return options;
    }

    @Before
    public void openBrowser(){
        //Selenium library initiation
        driver = new ChromeDriver(GenerateDriverChrome());

        String appUrl = "https://portalsiswa.id/";
        driver.get(appUrl);
        driver.manage().window().maximize();
    }

    @After
    public void closeBrowser(){
        driver.close();
        driver.quit();
    }

}
