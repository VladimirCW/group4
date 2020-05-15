package test.java.lesson5;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SecondTest {

    @Parameters({"browser", "version"})
    @Test
    public static void successLogin(@Optional("firefox") String browser, @Optional("v50") String version) {
        System.out.println("Second Hello " + browser + " " + version);
    }
}
