package main.java.lesson5.inheritance;

public class Exceptions {
    public static void main(String[] args) {
        a();
    }

    public static void a() {
        try {
            b();
        } catch (Exception e) {
            System.out.println("Exception was cauth");
        }
        System.out.println("A mehod");
    }

    /*public static void b() {

        try{
            System.out.println("B method - file was read");
            System.out.println("B method - file was read");
            int a = 7/0;
        } catch (Exception e) {
            System.out.println("File not found");
        }
    }*/
    public static void b() throws Exception {
        System.out.println("B method - file was read");
        System.out.println("B method - file was read");
        int a = 7/0;
        System.out.println("After exception");
    }
}
