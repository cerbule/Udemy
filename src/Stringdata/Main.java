package Stringdata;

public class Main {

    public static void main(String[] args) {
        String myString = "this is a string";

        System.out.println("my string is equal to = " + myString);
        myString = myString + " \u00A9 2019";
        System.out.println("my string is equal to = " + myString);
        String numberString = "250.55";
        numberString = numberString + "48.95";
        System.out.println(numberString);
        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println("Last string = " + lastString);
        double doubleNumber = 1230.47d;
        lastString = lastString + doubleNumber;
        System.out.println("Last last string = " + lastString);
    }

}
