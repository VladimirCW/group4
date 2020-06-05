package test.java;

import org.testng.annotations.DataProvider;

public class DataProviders {

    @DataProvider(name="users")
    public Object[][] dataProvider1() {
        return new Object[][] {
                {"Vova", 20},
                {"Petr", 30},
                {"Vasyliy", 40}
        };
    }

    @DataProvider(name="usersSmoke")
    public Object[][] dataProvider2() {
        return new Object[][] {
                {"Vova", 20}
        };
    }
}
