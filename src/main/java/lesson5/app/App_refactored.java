package main.java.app;

public class App_refactored {
    public static void main(String[] args) {
        String s = "Vladimir";
        System.out.println(
                s + " " + s + " " + s + " " + s + " " + s + " " + s + " " + s + " " + s + " " + s + " "
                        + s);
        System.out.println(
                s + " " + s + " " + s + " " + s + " " + s + " " + s + " " + s + " " + s + " " + s + " "
                        + s);
        System.out.println(
                s + " " + s + " " + s + " " + s + " " + s + " " + s + " " + s + " " + s + " " + s + " "
                        + s);
        System.out.println(
                s + " " + s + " " + s + " " + s + " " + s + " " + s + " " + s + " " + s + " " + s + " "
                        + s);
        System.out.println(
                s + " " + s + " " + s + " " + s + " " + s + " " + s + " " + s + " " + s + " " + s + " "
                        + s);
    }

    public String someMethod() {
        String s = "Vladimir";
        int i = 10;
        for (int j = 0; j < i; j++) {
            s += s;
        }
        return s;
    }
}
