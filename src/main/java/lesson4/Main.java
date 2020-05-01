package main.java.lesson4;

public class Main {
    public static void main(String[] args) {
        /*Cat vasiliy = new Cat();
        Cat victor = new Cat();
        Cat petr = victor;
        petr.age = -100;
        System.out.println("Vasiliy age is " + vasiliy.age);
        System.out.println("Petr age is " + petr.age);
        vasiliy.meov();
        System.out.println("was created " + Cat.counter);
        Cat.printCount();*/
        //System.out.println(vasiliy.equals(victor));;
        //Dog bobik = new Dog();
        Cat cat1 = new Cat("Vasiliy"); //constructor
        Cat cat2 = new Cat("Victor");
        Cat cat3 = new Cat("not defined");
        //cat1.name = "Petr";
        System.out.println("First cat " + cat1.name);
        System.out.println("Second cat " + cat2.name);
        cat2.greet("Vova");
        cat3.greet("Vova");

        //System.out.println(Cat.counter);
    }
}
