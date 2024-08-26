package JULY.ex_14072024;

public class Lab076 {
    public static void main(String[] args) {
        String s1 = "Lokesh";
        //String s1 = "L o k e s h";
        //          |0|1|2|3|4|5|
        char c = s1.charAt(5);
        System.out.println(c);
        s1 = s1.concat("Sriram"); // Lokesh Sriram
        System.out.println(s1);

    }
}
