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
    }
}
