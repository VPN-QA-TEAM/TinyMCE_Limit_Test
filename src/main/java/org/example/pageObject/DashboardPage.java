package org.example.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DashboardPage {

    public static WebDriver driver;
    public DashboardPage(WebDriver driver) {
        DashboardPage.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//li[@class='menu-item icon-ujian']")
    private WebElement assessmentSideMenuBtn;

    @FindBy(xpath = "//span[.='Add Assessment' or .='Tambah Penilaian']/ancestor::button")
    private WebElement addAssessmentMenuBtn;

    public void goToCreateAssessmentPage(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.elementToBeClickable(assessmentSideMenuBtn));
        assessmentSideMenuBtn.click();
        addAssessmentMenuBtn.click();
    }

}
