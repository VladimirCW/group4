package test.java.lesson9;

public class A_First {
    public static void main(String[] args) {
        String tel = "+38(050) asdas1-135-45 45"; //38050XXXXXXXXX
        String res = tel
                .replace("+", "")
                .replace("(", "")
                .replace(")", "")
                .replace(" ", "")
                .replace("-", "");
        String res2 = tel.replaceAll("^", "");
        System.out.println(res);
        System.out.println(res2);
    }
}
