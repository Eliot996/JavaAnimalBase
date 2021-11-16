import java.util.ArrayList;
import java.util.Collections;

public class AnimalBase {

    private ArrayList<Animal> animals;

    public AnimalBase() {
        animals = new ArrayList<>();
    }

    public void start() {
        UserInterface ui = new UserInterface(this);

        // test data - REMOVE LATER!
        createNewAnimal("d Toothless", "unholy offspring of lightning and death itself", "d night fury", 21);
        createNewAnimal("a Toothless", "unholy offspring of lightning and death itself", "c night fury", 25);
        createNewAnimal("b Toothless", "unholy offspring of lightning and death itself", "a night fury", 20);
        createNewAnimal("c Toothless", "unholy offspring of lightning and death itself", "b night fury", 19);

        ui.start();
    }

    public static void main(String[] args) {
        AnimalBase app = new AnimalBase();
        app.start();
    }

    public Iterable<Animal> getAllAnimals() {
        return animals;
    }

    public void sortBy(String sort) {
        switch (sort) {
            case "name" -> Collections.sort(animals, new NameComparator());
            case "type" -> Collections.sort(animals, new TypeComparator());
            case "age"  -> Collections.sort(animals, new AgeComparator());
        }

        /*switch (sort) {
            case "name" -> animals.sort((Animal::compareByName));
            case "type" -> animals.sort((Animal::compareBytype));
            case "age"  -> animals.sort((Animal::compareByAge));
        }*/

        System.out.println("TODO: Sort the list of animals by: " + sort);
    }

    public void createNewAnimal(String name, String description, String type, int age) {
        Animal animal = new Animal(name,description,type,age);
        animals.add(animal);
    }

    public void deleteAnimal(String name) throws NonExistingAnimalException {
        // find animal with this name
        Animal animal = findAnimalByName(name);
        if(animal == null) {
            throw new NonExistingAnimalException();
        } else {
            animals.remove(animal);
        }
    }

    private Animal findAnimalByName(String name) {
        for(Animal animal : animals) {
            if(animal.getName().equalsIgnoreCase(name)) {
                return animal;
            }
        }
        return null;
    }


    public void loadDatabase() {
        System.err.println("LOAD not yet implemented!");
    }

    public void saveDatabase() {
        System.err.println("SAVE not yet implemented!");
    }

}
