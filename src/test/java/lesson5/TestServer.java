package test.java.lesson5;

import main.java.lesson5.app.Server;
import org.testng.annotations.*;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class TestServer {
    Server server;

    @AfterClass
    public void tearDown() {
        System.out.println("I am a After Class");
    }

    @BeforeClass
    public void setUp() {
        System.out.println("I am a Before Class");
    }

    @BeforeMethod
    public void initialize() {
        server = new Server();
        System.out.println("I am a Before Method hook");
    }


    @Test
    public void getUsersShouldReturnProperAmount() {
        String usersNames = server.getUsers(); // "Vova, Petya"
        int actualUsersAmount = usersNames.split(", ").length;
        int expectedUsersAmount = 3;
        assertEquals(
                actualUsersAmount,
                expectedUsersAmount,
                "Expected amount of users to be " + expectedUsersAmount + " but got " + actualUsersAmount
        );
    }

    @Test
    public void getUsersShouldReturnAllNamesInUpperCase() {
        String[] usersNames = server.getUsers().split(", "); // {"Vova, Petya"}
        for (String name: usersNames) {
            String actualFirstChar = String.valueOf(name.charAt(0)); //v
            String expectedFirstChar = String.valueOf(name.charAt(0)).toUpperCase(); // v => V
            assertTrue(
                    actualFirstChar.equals(expectedFirstChar),
                    "Expected fist char " + actualFirstChar + " in name " + name + " to be upper case."
            );
        }
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("I am a After method");
    }

}
