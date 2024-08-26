package JULY.ex_14072024;

public class Lab074 {
    public static void main(String[] args) {
        String name = "The Academy"; // SCP
        String name1 = "The Academy"; // SCP

        String name2 = new String("The Academy"); // Heap area (OA)

//        System.out.println(name == name1); // Check for the Ref
//        System.out.println(name.equals(name1)); // Check for the Content


        System.out.println(name1 == name2); // Check for the Ref
        System.out.println(name1.equals(name2)); // Check for the Content
    }
}
