package main.java.lesson3;

public class M_Loops {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10};
//        for(int i = 0; i <= arr.length - 1; i++){
//            System.out.println(arr[i]);
//        }

//        for (int i = 0; i < 10; i++) {
//            for (int j = 0; j < 10; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        for(int el: arr) {
            System.out.println(el);
        }
    }
}
