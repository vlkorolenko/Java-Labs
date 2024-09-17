import java.util.*;
import java.util.stream.Collectors;

public class Main {

    // TASK 1

//    public static void main(String[] args) {
//        List<String> str = Arrays.asList("Xya", "Xyy", "Charlie", "David");
//        Optional<String> filteredStrings = str.stream()
//                .filter(s -> s.length() > 5 && s.startsWith("X"))
//                .findFirst(); // Знаходимо перший рядок, що відповідає умовам
//        String result = filteredStrings.orElse("Default");
//        System.out.println("Default");
//    }

    // TASK 3

    //public static void main(String[] args) {
//    List<String> names = Arrays.asList("Xya", "Xyy", "Charlie", "Daviddd");
//    Optional<String> filteredNames = names.stream()
//            .max((name1, name2) -> Integer.compare(name1.length(), name2.length()));
//    System.out.println("Найдовше ім'я: " + filteredNames.orElse(""));
//}

    // TASK 2

    //    public static void main(String[] args) {
//        List<Optional<Integer>> optionalList = Arrays.asList(
//                Optional.of(10),
//                Optional.empty(),
//                Optional.of(30),
//                Optional.empty(),
//                Optional.of(50)
//        );
//        List<Integer> integerList = convertToIntegerList(optionalList);
//        System.out.println(integerList);
//    }
//    public static List<Integer> convertToIntegerList(List<Optional<Integer>> optionalList) {
//        return optionalList.stream()
//                .filter(Optional::isPresent)
//                .map(Optional::get)
//                .collect(Collectors.toList());
//    }

    //TASK 4

//    public static void main(String[] args) {
//        // Клас Employee
//        class Employee {
//            private String name;
//            private double salary;
//
//            public Employee(String name, double salary) {
//                this.name = name;
//                this.salary = salary;
//            }
//
//            public String getName() {
//                return name;
//            }
//
//            public double getSalary() {
//                return salary;
//            }
//
//            @Override
//            public String toString() {
//                return name + ": " + salary;
//            }
//        }
//
//        // Створюємо список співробітників
//        List<Employee> employees = Arrays.asList(
//                new Employee("John", 2500),
//                new Employee("Anna", 4000),
//                new Employee("Max", 5500),
//                new Employee("Sophia", 3000),
//                new Employee("Emma", 6000),
//                new Employee("Alex", 4500)
//        );
//
//        // Згрупувати співробітників за діапазонами зарплат і знайти в кожній групі працівника з найбільшою зарплатою
//        Map<String, Optional<Employee>> groupedBySalaryRange = employees.stream()
//                .collect(Collectors.groupingBy(
//                        employee -> {
//                            if (employee.getSalary() < 3000) {
//                                return "< 3000";
//                            } else if (employee.getSalary() <= 5000) {
//                                return "3000–5000";
//                            } else {
//                                return "> 5000";
//                            }
//                        },
//                        Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)) // Знаходимо працівника з найбільшою зарплатою у кожній групі
//                ));
//
//        // Виводимо результати
//        groupedBySalaryRange.forEach((range, employee) -> {
//            System.out.println("Діапазон зарплати: " + range + " -> Найвища зарплата: " + employee.orElse(null));
//        });
//    }

    //task 5

//    public static void main(String[] args) {
//        // Створюємо список цілих чисел
//        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
//
//        // Обчислюємо добуток усіх непарних чисел
//        Optional<Integer> productOfOdds = calculateProductOfOddNumbers(numbers);
//
//        // Виводимо результат
//        System.out.println("Добуток непарних чисел: " + productOfOdds.orElse(null));
//    }
//
//    // Метод для обчислення добутку непарних чисел і загортання результату в Optional
//    public static Optional<Integer> calculateProductOfOddNumbers(List<Integer> numbers) {
//        return numbers.stream()
//                .filter(n -> n % 2 != 0)            // Фільтруємо тільки непарні числа
//                .reduce((a, b) -> a * b);           // Обчислюємо добуток
//    }

    //task 6

    public static void main(String[] args) {
        // Створюємо об'єкти Person
        Person john = new Person("John");
        Person anna = new Person("Anna");
        Person max = new Person("Max");
        Person sophia = new Person("Sophia");

        // Додаємо друзів
        john.addFriend(anna);
        john.addFriend(max);
        anna.addFriend(sophia);
        max.addFriend(sophia);
        max.addFriend(john);

        // Створюємо список людей
        List<Person> people = Arrays.asList(john, anna, max);

        // Отримуємо унікальні імена друзів у верхньому регістрі
        List<String> uniqueFriendsNames = getUniqueFriendsNamesInUpperCase(people);

        // Виводимо результат
        System.out.println(uniqueFriendsNames);
    }

    // Метод для отримання унікальних імен друзів у верхньому регістрі
    public static List<String> getUniqueFriendsNamesInUpperCase(List<Person> people) {
        return people.stream()
                .flatMap(person -> person.getFriends().stream()) // Отримуємо друзів кожної людини
                .map(friend -> friend.getName().toUpperCase())   // Перетворюємо імена на верхній регістр
                .distinct()                                     // Залишаємо тільки унікальні імена
                .collect(Collectors.toList());                  // Збираємо результат у список
    }
}