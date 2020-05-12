package main.java.lesson5.inheritance;

public class Invoke {
    public static void main(String[] args) {
        Cat vasiliy = new Cat("Vasiliy");
        Cat victor = new Cat("Victor");
        Dog bobik = new Dog("Bobik");
        //Animal animal = new Animal("Vova");
       //vasiliy.setName("Vaili2");
//        System.out.println(vasiliy.getName());
//        System.out.println(bobik.getName());
        /*String info = vasiliy.toString();
        System.out.println(info);*/
        System.out.println(vasiliy);
        //4 == 4;
        System.out.println(vasiliy.equals(victor));
        //System.out.println(vasiliy.toString());
        Animal cat = new Cat("AA");
        Cat cat2 = (Cat) cat;
        Animal[] cats = {new Cat("A"), new Cat("B"), new Dog("C")};
        IAtackable[] atackable = {new Dog("B"), new Mouse("C")};
        IAtackable animal = new Dog("DD");
        Mouse mouse = new Mouse("sd");
        bobik.attack(mouse);
        //int a = 2;
        //long b = a
        //int c = (int)b
    }
}
