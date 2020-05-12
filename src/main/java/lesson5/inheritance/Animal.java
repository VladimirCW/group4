package main.java.lesson5.inheritance;

public abstract class Animal {
    private String name;
    private int age;
    //private int health;

    public Animal(String name) {
        this.age = 50;
        this.name = name;
    }

    public String getName() {
        return this.name + "!";
    }

    public String getName(String user) {
        return this.name + "! " + user;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return "My name is " + this.name + " and my age is " + this.age;
    }

    public boolean equals(Animal obj) {
        return this.name.equals(obj.name);
    }

    public abstract String greet();

    public void attack(IAtackable animal) {
        //animal.health -= 10;
    }

}
