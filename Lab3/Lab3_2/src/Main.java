import java.util.List;
import java.util.Set;
import java.util.HashSet;

public class Main {
    public static <T> Set<T> getUniqueElements(List<T> list) {
        // Використовуємо HashSet для зберігання унікальних елементів
        return new HashSet<>(list);
    }

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 2, 3, 4, 4, 5);
        Set<Integer> uniqueNumbers = getUniqueElements(numbers);

        System.out.println("Унікальні елементи: " + uniqueNumbers);
    }
}
