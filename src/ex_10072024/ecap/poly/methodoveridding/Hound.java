
package ex_10072024.ecap.poly.methodoveridding;

public class Hound extends Dog {

    @Override
    void bark(){
        System.out.println("I am Hound, i will Bark!!");
    }

    void bike(){
        System.out.println("Biked");
    }

}
