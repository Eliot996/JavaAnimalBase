public class Animal implements Comparable {
    private String name;
    private String desc;
    private String type;
    private int age;

    public Animal(String name, String desc, String type, int age) {
        this.name = name;
        this.desc = desc;
        this.type = type;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name + " the " + desc + " " + type + ", age " + age;
    }


    @Override
    public int compareTo(Object o) {
        Animal otheranimal = (Animal) o;
        return this.name.compareToIgnoreCase(otheranimal.name);
    }

    public int compareByName(Object o) {
        Animal otheranimal = (Animal) o;
        return this.name.compareToIgnoreCase(otheranimal.name);
    }

    public int compareBytype(Object o) {
        Animal otheranimal = (Animal) o;
        return this.type.compareToIgnoreCase(otheranimal.type);
    }

    public int compareByAge(Object o) {
        Animal otheranimal = (Animal) o;
        return this.age - otheranimal.age;
    }
}
