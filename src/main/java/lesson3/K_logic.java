package main.java.lesson3;

public class K_logic {
    public static void main(String[] args) {
        String name = "Vova3";
        int age = 2;

        if(age > 18 || name == "Vova") { // true && true ; true || true
            System.out.println("Hello user");
        } else if(age > 10) {
            System.out.println("User age is more that 10");
        } else {
            System.out.println("Access denied");
        }

        if(age == 18) {
            System.out.println("Your age is 18");
        }
    }
}
