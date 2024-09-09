public class Main {
    public static <T extends Comparable<T>> T findMax(T[] array) {
        if(array == null || array.length == 0){
            throw new IllegalArgumentException("Array is null or empty");
        }
        T max = array[0];
        for(T element : array){
            if(element.compareTo(max) > 0){
                max = element;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        // Масив цілих чисел
        Integer[] intArray = {1, 5, 3, 7, 2};
        System.out.println("Максимальний елемент у масиві цілих чисел: " + findMax(intArray));

        // Масив чисел з плаваючою комою
        Double[] doubleArray = {1.5, 3.2, 0.7, 2.8};
        System.out.println("Максимальний елемент у масиві чисел з плаваючою комою: " + findMax(doubleArray));

        // Масив символів
        Character[] charArray = {'a', 'z', 'b', 'm'};
        System.out.println("Максимальний елемент у масиві символів: " + findMax(charArray));

        // Масив рядків
        String[] stringArray = {"apple", "orange", "banana", "pear"};
        System.out.println("Максимальний елемент у масиві рядків: " + findMax(stringArray));
    }
}