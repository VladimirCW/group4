package main.java.lesson5.app;

public class Server {
    private String[] arr = {"Vova", "Andrey", "Alexandr"};

    public String getUsers() {
        char a = 'ы';
        String result = "";
        for (int i = 0; i < this.arr.length; i++) {
            result += this.arr[i] + (i < this.arr.length - 1 ? ", " : "");
        }
        return result;
    }
}
