package main.java.lesson5.app;

public class Server {
    private String[] arr = {"Vova", "Andrey", "Alexandr"};

    public String getUsers() {
        char a = 'ы';
        String result = "";
        for (int i = 0; i < this.arr.length; i++) {
            result += this.arr[i] + (i < this.arr.length - 1 ? ", " : "");
        }
        return result;  //"Vova, Andrey, Alexandr"
    }

    public String getStatus(int age) {
        if(age <= 0 ) {
            return "Not valid input";
        } else if ( age < 18) {
            return "Student";
        } else if ( age < 60 ) {
            return "Worker";
        } else if( age <= 90 ) {
            return "Pensioner";
        } else {
            return "Not valid input";
        }
    }
}
