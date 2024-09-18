import java.util.Scanner;

public class Main {

    // TASK 2

//    public static void main(String[] args) {
//        TrainRoute trainRoute = new TrainRoute();
//
//        // Додаємо кілька зупинок до маршруту
//        trainRoute.addStop("Київ");
//        trainRoute.addStop("Львів");
//        trainRoute.addStop("Одеса");
//        trainRoute.addStop("Харків");
//
//        // Виводимо маршрут
//        trainRoute.display();
//
//        // Видаляємо одну зупинку
//        trainRoute.removeStop("Львів");
//
//        // Спробуємо видалити зупинку, якої немає в маршруті
//        trainRoute.removeStop("Дніпро");
//
//        // Виводимо маршрут після видалення
//        trainRoute.display();
//    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double number;

        while (true) {
            try {
                // Запитуємо у користувача число
                System.out.print("Введіть число для обчислення квадратного кореня: ");
                number = scanner.nextDouble();

                // Обчислюємо квадратний корінь
                double result = calculateSquareRoot(number);
                System.out.println("Квадратний корінь з числа " + number + " дорівнює " + result);
                break;
            } catch (IllegalArgumentException e) {
                // Обробляємо виключення і пропонуємо ввести нове число
                System.out.println(e.getMessage());
                System.out.println("Введіть невід’ємне число.");
            }
        }
    }

    // Метод для обчислення квадратного кореня
    public static double calculateSquareRoot(double number) {
        if (number < 0) {
            // Викидаємо IllegalArgumentException, якщо число від’ємне
            throw new IllegalArgumentException("Число не може бути від’ємним!");
        }
        return Math.sqrt(number);
    }
}