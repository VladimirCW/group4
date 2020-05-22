package test.java;

import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import test.java.po.ContactPage;
import test.java.po.FaqPage;
import test.java.po.HomePage;

import java.util.List;

import static org.testng.Assert.assertEquals;

public class Test_PO_Rozetka extends TestBaseSetup {
    HomePage homePage;
    ContactPage contactPage;
    FaqPage faqPage;

    @BeforeMethod
    public void initialize() {
        homePage = new HomePage(driver);
        contactPage = new ContactPage(driver);
        faqPage = new FaqPage(driver);
    }

    @Test
    public void testA() {
        homePage.open();
        //homePage.search("iPhone");
       /*         .search("meizu")
                .search("xiaomi");
        homePage.clickContacts();
        contactPage.clickFaq();
        *//*homePage.open();
        homePage.search("iPhone")
                .search("meizu")
                .search("xiaomi");
        homePage.clickContacts();
        contactPage.clickFaq();*//*
        List<WebElement> webLinks = faqPage.getQuestions();
        for (WebElement element: webLinks) {
            String expectedColor = "rgba(62, 119, 170, 1)";
            String actualColor = element.getCssValue("color");
            assertEquals(expectedColor, actualColor);
        }*/
    }

    @Test
    public void testB() {
        homePage
                .open()
                .search("iPhone")
                .clickContacts();
        contactPage.clickFaq();
        faqPage.getQuestions();
    }
}
