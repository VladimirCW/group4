package main.java.lesson5.inheritance;

public class Dog extends Animal implements IAtackable {

    public Dog(String name) {
        super(name);
        //this.health = 100;
    }

    @Override
    public String getName(String name) {
        System.out.println("Dog gives user it's name");
        //return super.getName();
        return "Overriden method name";
    }

    @Override
    public String greet() {
        return "Hello I am a Dog";
    }

    @Override
    public int getHealth() {
        return 0;
    }
}
