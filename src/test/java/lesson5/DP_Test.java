package test.java.lesson5;

import main.java.lesson5.app.Server;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class DP_Test {
    Server server;

    @BeforeMethod
    public void beforeMethod() {
        server = new Server();
    }

    @Test(dataProvider = "statuses")
    public void testStatus(int age, String expectedStatus) {
        String actualStatus = server.getStatus(age);
        System.out.println(" age " + age + " status " + expectedStatus);
        assertEquals(
                actualStatus,
                expectedStatus,
                "Expected status " + expectedStatus + " with age " + age
        );
    }
    //int[] arr = {2,4,6}
    //Object[][] matrix = {{2,"A"}, {6,8}};
    @DataProvider(name = "statuses")
    public Object[][] getData() {
        return new Object[][] {
                {10, "Student"},
                {18, "Worker"},
                {19, "Worker"},
                {25, "Worker"},
                {60, "Pensioner"},
                {70, "Pensioner"},
                {90, "Pensioner"},
                {91, "Not valid input"},
                {-10, "Not valid input"},
        };
    }
}
