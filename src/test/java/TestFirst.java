package test.java;

import io.qameta.allure.*;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import test.java.po.ContactPage;
import test.java.po.FaqPage;
import test.java.po.HomePage;
import test.java.utils.RetryAnalyzer;

import static org.testng.Assert.assertTrue;
import static org.testng.Assert.fail;

@TmsLink("TMS-123")
@Epic("Card")
public class TestFirst extends TestBaseSetup {
    HomePage homePage;
    ContactPage contactPage;
    FaqPage faqPage;

    @BeforeMethod
    public void initialize() {
        homePage = new HomePage(driver);
        contactPage = new ContactPage(driver);
        faqPage = new FaqPage(driver);
    }

    @Feature("Add to the card")
    @Story("Positive test 1")
    @Issue("AAA-456")
    @Test
    public void testB(String userName, int userAge) {
        System.out.println(String.format("User name'%s' and age is '%d'", userName, userAge));
        homePage.open().clickContacts();
        contactPage.clickFaq();
        faqPage.getQuestions();
    }

    @Link("https://google.com")
    @Feature("Add to the card")
    @Story("Positive test 2")
    @Issues({
            @Issue("AAA-7"),
            @Issue("AAA-8")
    })
    @Test
    public void testC() {
        homePage.open2("https://google.com");
    }

    @Feature("Remove from the card")
    @Test
    public void testD() {
        homePage.open().clickContacts();
        contactPage.clickFaq();
        faqPage.getQuestions();
        assertTrue(false);
    }

    @Feature("Remove from the card")
    @Story("Positive test 3")
    @Test
    public void testE() {
        homePage.open().clickContacts();
        driver.findElement(By.id("AAAA")).click();
        contactPage.clickFaq();
        faqPage.getQuestions();
        assertTrue(true);
    }

    @Feature("Switch product")
    @Story("Positive test 4")
    @Test
    public void testF() {
        homePage.open().clickContacts();
        if(true) throw new Error("Custom error");
        contactPage.clickFaq();
        faqPage.getQuestions();
        assertTrue(true);
    }
}
