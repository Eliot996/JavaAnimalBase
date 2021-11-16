import java.util.Comparator;

public class TypeComparator implements Comparator<Animal> {
    @Override
    public int compare(Animal o1, Animal o2) {
        return o1.getType().compareToIgnoreCase(o2.getType());
    }
}
