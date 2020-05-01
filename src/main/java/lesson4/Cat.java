package main.java.lesson4;

public class Cat {
    private static int counter = 0;
    private int age;
    String name;
    public String color = "red";

    public Cat() {//constructor
        this("not defined");
    }

    public Cat(String name){ //constructor
        System.out.println("Cat was created");
        counter++;
        this.name = name;
        this.age = 10;
    }

    void greet(String userName) {
        System.out.println("Hello user " + userName + ". My name is " + this.name);
    }

    public void meov() {
        System.out.println("MEOV");
    }

    public static void printCount() {
        System.out.println("Was created " + counter + " cats");
    }
}
