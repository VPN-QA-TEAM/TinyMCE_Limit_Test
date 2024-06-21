package StepDef;

import hooks.Hooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pageObject.LandingPage;
import org.openqa.selenium.WebDriver;

public class LandingPageSteps {

    private final WebDriver driver = Hooks.driver;
    LandingPage landingPage = new LandingPage(driver);

    @Given("User go to Portal Sekolah login page")
    public void userGoToPortalSekolahLoginPage(){
        landingPage.clickLoginBtn();
    }

    @When("User login with {string} as username and {string} as password")
    public void userLoginWithAsUsernameAndAsPassword(String username, String password) {
        landingPage.userLogin(username, password);
    }
}
