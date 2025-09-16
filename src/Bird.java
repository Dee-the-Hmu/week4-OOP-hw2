

public class Bird extends Animal implements Trainable {

    public double wingspan;

    @Override
    public void getDiet(){
        System.out.println("Insectivore");
    }

    @Override
    public void performTrick() {
        System.out.println("flying in circles");
    }
}