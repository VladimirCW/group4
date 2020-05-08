package test.java.lesson5;


import org.testng.annotations.Test;

public class FirstTest {

    @Test
    public static void successLogin() {
        System.out.println("First Hello");
    }

    @Test
    public static void successLogin2() {
        System.out.println("First Hello second method");
    }

    @Test
    public static void successLogin3() {
        System.out.println("First Hello third method");
    }

    @Test
    public static void wrongLogin() {
        System.out.println("First Hello wrong method");
    }
}
