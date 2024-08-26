package ex_11082024.RealLIFEex.ex_interface.ex2.multipleinheritnace;

public class WagonR implements Engine{

    void drive(){
        startEngine();
        stopEngine();
    }

    @Override
    public void startEngine() {
        System.out.println("Wagon R i starting");
    }

    @Override
    public void stopEngine() {
        System.out.println("Wagon R i Stopping");
    }
}