package org.example;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.time.LocalDate;
import java.sql.Date;
import java.util.Properties;
import java.util.Scanner;

public class Main {
    // Метод для зчитування конфігурації
    public static Properties readConfiguration(String fileName) {
        Properties prop = new Properties();
        try (InputStream input = Main.class.getClassLoader().getResourceAsStream(fileName)) {
            if (input == null) {
                System.out.println("Не вдалось знайти файл " + fileName);
                return null;
            }
            prop.load(input);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return prop;
    }

    public static void main(String[] args) {
        // Читання конфігурації з файлу
        Properties prop = readConfiguration("db.properties");

        // Перевірка підключення
//        if (prop != null) {
//            try (Connection connection = DatabaseConnector.getConnection(prop)) {
//                if (connection != null) {
//                    System.out.println("Підключення успішне!");
//                } else {
//                    System.out.println("Не вдалось підключитись до бази даних.");
//                }
//            } catch (SQLException e) {
//                e.printStackTrace();
//            }
//        }
//        System.out.println("1. Register");
//        System.out.println("2. Login");
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter option: ");
//        String option = scanner.nextLine();
//        if (option.equals("1")) {
//            System.out.println("Enter username: ");
//            String username = scanner.nextLine();
//            System.out.println("Enter password: ");
//            String password = scanner.nextLine();
//            UserService userService = new UserService();
//            userService.registerUser(username, password);
//        } else if (option.equals("2")) {
//            System.out.println("Enter username: ");
//            String username = scanner.nextLine();
//            System.out.println("Enter password: ");
//            String password = scanner.nextLine();
//            UserService userService = new UserService();
//            if (userService.authenticateUser(username, password)){
//                System.out.println("Успішна авторизація!");
//            }
//        }
        ClientService clientService = new ClientService();

        // Запитуємо інформацію про нового клієнта
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть ПІБ клієнта: ");
        String fullName = scanner.nextLine();

        System.out.println("Введіть дату народження клієнта (у форматі YYYY-MM-DD): ");
        String birthDateStr = scanner.nextLine();
        LocalDate birthDate = LocalDate.parse(birthDateStr);

        // Перетворюємо LocalDate у java.sql.Date для вставки в базу
        Date sqlBirthDate = Date.valueOf(birthDate);// Конвертуємо рядок в SQL Date

        // Додаємо клієнта через сервіс
        clientService.addClient(fullName, sqlBirthDate, prop);

        System.out.println("Клієнта успішно додано!");
    }
}
