package main.java.lesson3;

public class G_System_formating {
    public static void main(String[] args) {
        String greet = "Hello %s, my name is %s and my age is %d";

        System.out.println("Hello");
        System.out.print("Hello");
        System.out.println("by");

        System.out.println(greet);
        System.out.printf(greet, "Vasiliy", "Vova", 50);
        //System.out.println();
        System.out.printf(greet, "Petr", "Vova", 40);
        //System.out.println();
        System.out.printf(greet, "Maxim", "Vova", 40);
        System.out.println();

        System.out.println("Hello\\\\ \"Vova\" \n\rHello\tPetr");
    }
}
