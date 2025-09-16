

public class Main {
    public static void main(String[] args){


        Animal[] animals = new Animal[]{
            new Lion(),
            new Parrot(),
            new Mammal(),
            new Bird()
    };

        for(Animal animal : animals){

            animal.makeSound();
            animal.getDiet();

            if(animal instanceof Trainable){
                Trainable trainedAnimal = (Trainable) animal;

                trainedAnimal.performTrick();
            }

            System.out.println();
        }

    }
}