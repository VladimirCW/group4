package main.java.lesson3;

public class K_logic {
    public static void main(String[] args) {
        String name = "Vova3";
        int age = 2;

        /*if(age > 18 || name == "Vova") { // true && true ; true || true if(age > 18 && name == "Vova") {
            System.out.println("Hello user");
        } else if(age > 10) {
            System.out.println("User age is more that 10");
        } else {
            System.out.println("Access denied");
        }

        if(age == 18) {
            System.out.println("Your age is 18");
        }*/
        /*String status;
        if(age > 18) {
            status = "Worker";
        } else {
            status = "Student";
        }*/
        String status = (age > 18) ? "Worker" : "Student";

        if(age > 18) status = "Worker";
        else status = "Student";

        int dayOfWeek = 1;
        /*if(dayOfWeek == 0) {
            System.out.println("Monday");
        } else if(dayOfWeek == 1) {
            System.out.println("Thursday");
        } else {}*/
        switch (dayOfWeek) {
            case 0:
                System.out.println("Monday");
                break;
            case 1:
                System.out.println("Thursday");
                break;
            case 2:
                System.out.println("Wednesday");
                break;
            default:
                System.out.println("No such day");
        }
        switch (dayOfWeek) {
            case 0:
            case 1:
            case 2:
                System.out.println("----");
                break;
            case 6:
            case 7:
                System.out.println("holiday");
        }
    }
}
