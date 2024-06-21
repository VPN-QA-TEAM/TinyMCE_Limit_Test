package StepDef;

import hooks.Hooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.example.pageObject.CreateAssessmentPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class CreateAssessmentPageSteps {

    private final WebDriver driver = Hooks.driver;
    CreateAssessmentPage createAssessmentPage = new CreateAssessmentPage(driver);

    @Then("User already on create assessment page")
    public void userAlreadyOnCreateAssessmentPage() {
        Assert.assertTrue(createAssessmentPage.verifyCreateAssessmentPage());
    }

    @And("User refresh create assessment page {int} times")
    public void userRefreshCreateAssessmentPageTimes(int n) throws InterruptedException {
        createAssessmentPage.refreshCreateAssessmentPage(n);
    }

    @And("User success to input text {string} Instuction Box TinyMCE")
    public void userSuccessToInputTextInstuctionBoxTinyMCE(String text) throws InterruptedException {
        createAssessmentPage.testInstructionBoxTinyMCE(text);
    }
}
