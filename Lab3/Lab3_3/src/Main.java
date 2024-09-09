
public class Main {
    public static void main(String[] args) {
        Box<Integer> integerBox = new Box<>();
        integerBox.put(123);
        Integer intItem = integerBox.get();

        Box<String> stringBox = new Box<>();
        stringBox.put("Hello");
        String stringItem = stringBox.get();

        Box<Person> personBox = new Box<>();
        personBox.put(new Person("John", 30));  // Поміщаємо об'єкт Person в коробку
        Person personItem = personBox.get();  // Вилучаємо об'єкт Person з коробки
    }
}
