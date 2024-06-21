package org.example.pageObject;

import io.cucumber.messages.types.Scenario;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.time.Duration;

public class CreateAssessmentPage {

    public static WebDriver driver;
    public CreateAssessmentPage(WebDriver driver) {
        CreateAssessmentPage.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//span[.='Create Assessment' or .='Buat Penilaian']")
    private WebElement createAssessmentPageTitle;

    @FindBy(xpath = "//div[@class='tox tox-tinymce']")
    private WebElement tinyTextEditorField;

    @FindBy(xpath = "//iframe[1]")
    private WebElement instructionBoxTinyMCE;

    @FindBy(xpath = "//body[@id='tinymce']")
    private WebElement instructionBoxTextArea;

    public boolean verifyCreateAssessmentPage() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOf(createAssessmentPageTitle));
        wait.until(ExpectedConditions.visibilityOf(tinyTextEditorField));
        return createAssessmentPageTitle.isDisplayed();
    }

    public void refreshCreateAssessmentPage(int n) throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        for (int i = 0; i<n; i++){
            System.out.println("Refresh " + (i+1));
            driver.navigate().refresh();
            Thread.sleep(1500);
            wait.until(ExpectedConditions.visibilityOf(tinyTextEditorField));
        }
    }

    public void testInstructionBoxTinyMCE(String text) throws InterruptedException {
        driver.switchTo().frame(instructionBoxTinyMCE);
        instructionBoxTextArea.sendKeys(text);
        driver.switchTo().defaultContent();
        Thread.sleep(1000);

    }

}
