package JULY.ex_14072024;

public class Lab057 {
    public static void main(String[] args) {
        long phone_no = 7904004879L;
        // short s = phone_no; // Implicit Narrowing - JVM?
        short s = (short) phone_no;
        System.out.println(s);
        // JVM - GC -
    }
}
