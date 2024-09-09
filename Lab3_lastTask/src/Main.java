public class Main {
    public static void main(String[] args) {
        AnimalShelter shelter = new AnimalShelter();
        Dog dog1 = new Dog();
        Labrador lab1 = new Labrador();
        Cat cat1 = new Cat();

        shelter.addAnimals(dog1);
        shelter.addAnimals(lab1);
        shelter.addAnimals(cat1);

        shelter.printAnimalSounds();

    }
}