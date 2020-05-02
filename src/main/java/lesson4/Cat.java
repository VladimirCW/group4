package main.java.lesson4;

public class Cat {
    private static int counter = 0;
    private int age;
    String name;
    public final String COLOR_OF_CAT = "red";

    public Cat() {//constructor
        this("not defined");
    }

    public Cat(String name) { //constructor
        System.out.println("Cat was created");
        counter++;
        this.name = name;
        this.age = 10;
    }

    public void setAge(int age) {
        if (age > 1) { //CTRL+ALT+L
            this.age = age;
        } else {
            System.out.println("You can't set age " + age);
            this.age = 0;
        }
    }

    public int getAge() {
        return this.age;
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
