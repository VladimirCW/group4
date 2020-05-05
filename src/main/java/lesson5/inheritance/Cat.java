package main.java.lesson5.inheritance;

public class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    @Override
    public String greet() {
        return "Hello I am a Cat";
    }
}
