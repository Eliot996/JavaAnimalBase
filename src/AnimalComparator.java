import java.util.Comparator;

public class AnimalComparator  implements Comparator<Animal> {

    private final String direction;
    private final String sortBy;

    public AnimalComparator(String sortBy, String direction) {
        this.sortBy = sortBy;
        this.direction = direction;
    }

    @Override
        public int compare(Animal o1, Animal o2) {

        // depending on the sortBy category, assign proper result to result
        int result = switch (sortBy) {
            case "age" -> Integer.compare(o1.getAge(), o2.getAge());
            case "name" -> o1.getName().compareToIgnoreCase(o2.getName());
            case "type" -> o1.getType().compareToIgnoreCase(o2.getType());
            default -> 0;
        };

        // if descending order is prefered
        if (direction.equals("DESC")){
            result *= -1;
        }

        return result;
    }
}
