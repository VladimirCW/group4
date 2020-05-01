package main.java.lesson3;

public class N_Functions {
    public static void main(String[] args) {
        greet("Vova", 50);
        //greet(50, "Vaa"); error
        greet("Petr");
        greet(80);
        /*int age = getAge();
        System.out.println(age);*/
        System.out.println(getAge());
    }

    public static void greet(String name, int number) {
        System.out.println("Hello, " + name + " your number is " + number);
        System.out.println("Good by");
    }
    public static void greet(String name) {
        System.out.println("Hello, " + name);
        System.out.println("Good by");
    }
    public static void greet(int number) {
        System.out.println("Hello, user your number is " + number);
        System.out.println("Good by");
    }

    public static int getAge() {
        return 50;
    }
    public static boolean isValid() {
        return 1 == 1;
    }
}
