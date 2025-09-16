

public class Mammal extends Animal {

    public String furType;

    @Override
    public void makeSound(){
        
        System.out.println("Generic mammal makes sound");
    }

    @Override
    public void getDiet() {
        System.out.println("Omnivore");
    }

    

}