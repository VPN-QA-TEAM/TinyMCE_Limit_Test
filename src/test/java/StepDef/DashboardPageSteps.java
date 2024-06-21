package StepDef;

import hooks.Hooks;
import io.cucumber.java.en.And;
import org.example.pageObject.DashboardPage;
import org.openqa.selenium.WebDriver;

public class DashboardPageSteps {

    private final WebDriver driver = Hooks.driver;
    DashboardPage dashboardPage = new DashboardPage(driver);

    @And("User go to create assessment page")
    public void userGoToCreateAssessmentPage(){
        dashboardPage.goToCreateAssessmentPage();
    }

}
