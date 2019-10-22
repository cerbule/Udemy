package com.company;

public class ByteShortLong {

    public static void main(String[] args) {

        int myValue = 10000;
        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        int mySecondNumber = Integer.reverseBytes(45);
        System.out.println(mySecondNumber);
        System.out.println("min: " + myMinIntValue + "\nmax: " + myMaxIntValue);
        System.out.println("Busted min: " + (myMinIntValue - 100));
        System.out.println("Busted max: " + (myMaxIntValue + 100));

        int myMaxIntTest = 2_141_432_143;

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("byte min: " + myMinByteValue + "\nbyte max: " + myMaxByteValue);
        
        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("short min: " + myMinShortValue + "\nshort max: " + myMaxShortValue);

        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("long min: " + myMinLongValue + "\nlong max: " + myMaxLongValue);

        int mytotal = (myMinIntValue / 2);
        byte myNewByteValue = (byte) (myMinByteValue / 2);
        short myNewShortValue = (short) (myMinShortValue /2);
    }
}
