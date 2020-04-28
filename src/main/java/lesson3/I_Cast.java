package main.java.lesson3;

public class I_Cast {
    public static void main(String[] args) {
       // System.out.println(5/3); //0.3333
        int a = 10;
        int a1 = 22;
        long d = a;
        long b = 21474836479L;
        int c = (int)b;
//        System.out.println((float) 5/3);//5.0
//        System.out.println((float) 5/(float) 3);
//        System.out.println( 5/(float) 3);
       // System.out.println( 5.0/3);
        System.out.println((float) a/b);
        System.out.println(10.0/b);


    }
}
