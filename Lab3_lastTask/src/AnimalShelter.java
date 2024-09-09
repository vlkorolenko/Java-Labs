import java.util.ArrayList;
import java.util.List;

public class AnimalShelter {
    private List<Dog> dogList = new ArrayList<>();
    private List<Animal> otherAnimalsList = new ArrayList<>();
    public void addAnimals(Animal animal) {
        if (animal instanceof Dog) {
            dogList.add((Dog) animal);
            System.out.println("Собака додана до притулку.");
        } else {
            otherAnimalsList.add(animal);
            System.out.println("Інша тварина додана до притулку.");
        }
    }
    public void printAnimalSounds() {
        System.out.println("Собаки в притулку:");
        for (Dog dog : dogList) {
            dog.makeSound();
        }

        System.out.println("Інші тварини в притулку:");
        for (Animal animal : otherAnimalsList) {
            animal.makeSound();
        }
    }
}