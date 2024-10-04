import java.util.List;
import java.util.Objects;
import java.util.ArrayList;


//4 TASK

//public class Main {
//    public static <T extends Comparable<T>> T findMax(T[] array) {
//        if(array == null || array.length == 0){
//            throw new IllegalArgumentException("Array is null or empty");
//        }
//        T max = array[0];
//        for(T element : array){
//            if(element.compareTo(max) > 0){
//                max = element;
//            }
//        }
//        return max;
//    }
//
//    public static void main(String[] args) {
//        // Масив цілих чисел
//        Integer[] intArray = {1, 5, 3, 7, 2};
//        System.out.println("Максимальний елемент у масиві цілих чисел: " + findMax(intArray));
//
//        // Масив чисел з плаваючою комою
//        Double[] doubleArray = {1.5, 3.2, 0.7, 2.8};
//        System.out.println("Максимальний елемент у масиві чисел з плаваючою комою: " + findMax(doubleArray));
//
//        // Масив символів
//        Character[] charArray = {'a', 'z', 'b', 'm'};
//        System.out.println("Максимальний елемент у масиві символів: " + findMax(charArray));
//
//        // Масив рядків
//        String[] stringArray = {"apple", "orange", "banana", "pear"};
//        System.out.println("Максимальний елемент у масиві рядків: " + findMax(stringArray));
//    }
//}

// TASK 5

//class Pair<T, U> {
//    private T first;
//    private U second;
//
//    // Конструктор
//    public Pair(T first, U second) {
//        this.first = first;
//        this.second = second;
//    }
//
//    // Геттери для доступу до значень
//    public T getFirst() {
//        return first;
//    }
//
//    public U getSecond() {
//        return second;
//    }
//
//    // Метод для порівняння двох пар
//    public boolean isEqual(Pair<T, U> otherPair) {
//        return Objects.equals(this.first, otherPair.first) &&
//                Objects.equals(this.second, otherPair.second);
//    }
//
//    // Метод для гарного відображення пари
//    @Override
//    public String toString() {
//        return "Pair{" + "first=" + first + ", second=" + second + '}';
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//        // Приклад використання Pair з типами Integer і String
//        Pair<Integer, String> pair1 = new Pair<>(1, "Apple");
//        Pair<Integer, String> pair2 = new Pair<>(2, "Banana");
//        Pair<Integer, String> pair3 = new Pair<>(1, "Apple");
//
//        System.out.println("Пара 1: " + pair1);
//        System.out.println("Пара 2: " + pair2);
//        System.out.println("Пара 3: " + pair3);
//
//        // Порівняння пар
//        System.out.println("Пара 1 рівна Парі 2? " + pair1.isEqual(pair2));
//        System.out.println("Пара 1 рівна Парі 3? " + pair1.isEqual(pair3));
//
//        // Приклад використання Pair з типами String і List<Integer>
//        Pair<String, List<Integer>> pair4 = new Pair<>("Numbers", List.of(1, 2, 3));
//        System.out.println("Пара 4: " + pair4);
//    }
//}

// TASK 6

//// Абстрактний клас Shape
//abstract class Shape {
//    // Абстрактний метод для обчислення площі
//    public abstract double getArea();
//}
//
//// Підклас Circle
//class Circle extends Shape {
//    private double radius;
//
//    // Конструктор
//    public Circle(double radius) {
//        this.radius = radius;
//    }
//
//    // Реалізація методу getArea() для кола
//    @Override
//    public double getArea() {
//        return Math.PI * radius * radius;
//    }
//}
//
//// Підклас Rectangle
//class Rectangle extends Shape {
//    private double width;
//    private double height;
//
//    // Конструктор
//    public Rectangle(double width, double height) {
//        this.width = width;
//        this.height = height;
//    }
//
//    // Реалізація методу getArea() для прямокутника
//    @Override
//    public double getArea() {
//        return width * height;
//    }
//}
//
//// Основний клас
//public class Main {
//    public static void main(String[] args) {
//        // Створюємо список форм
//        List<Shape> shapes = List.of(
//                new Circle(5),           // коло з радіусом 5
//                new Rectangle(4, 6),     // прямокутник з шириною 4 і висотою 6
//                new Circle(3)            // коло з радіусом 3
//        );
//
//        // Обчислюємо загальну площу всіх форм у списку
//        double totalArea = calculateTotalArea(shapes);
//
//        // Виводимо результат
//        System.out.println("Загальна площа всіх форм: " + totalArea);
//    }
//
//    // Метод для обчислення загальної площі з використанням Upper-bounded wildcard
//    public static double calculateTotalArea(List<? extends Shape> shapes) {
//        return shapes.stream()
//                .mapToDouble(Shape::getArea)  // Отримуємо площу кожної форми
//                .sum();                      // Обчислюємо загальну площу
//    }
//}

// TASK 7

public class Main {
    public static void main(String[] args) {
        // Створюємо списки різних типів
        List<Integer> integerList = new ArrayList<>();
        List<Number> numberList = new ArrayList<>();

        // Додаємо числа до списків
        addToList(integerList);
        addToList(numberList);

        // Виводимо списки
        System.out.println("Список Integer: " + integerList);
        System.out.println("Список Number: " + numberList);
    }

    // Метод для додавання цілих чисел від 1 до 10 до списку
    public static void addToList(List<? super Integer> list) {
        for (int i = 1; i <= 10; i++) {
            list.add(i); // Додаємо цілі числа від 1 до 10
        }
    }
}