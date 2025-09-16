

public class Parrot extends Bird {

    @Override 
    public void makeSound(){
        System.out.println("Squawk");
    }

    @Override 
    public void getDiet(){
        System.out.println("Herbivore");
    }
    @Override 
    public void performTrick(){
        System.out.println("the Parrot is mimicking sounds!");
    }
}