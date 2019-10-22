package com.company;
public class ByteShortLongExe {

    public static void main(String[] args) {
        byte byteNumber = 10;
        short shortNumber = 20;
        int inyNumber = 50;

        long myLong = 50000L + (10L * (byteNumber + shortNumber + inyNumber));
        System.out.println(myLong);
    }


}
