public class Main {
    public static void main(String[] args) {
        TrainRoute trainRoute = new TrainRoute();

        // Додаємо кілька зупинок до маршруту
        trainRoute.addStop("Київ");
        trainRoute.addStop("Львів");
        trainRoute.addStop("Одеса");
        trainRoute.addStop("Харків");

        // Виводимо маршрут
        trainRoute.display();

        // Видаляємо одну зупинку
        trainRoute.removeStop("Львів");

        // Спробуємо видалити зупинку, якої немає в маршруті
        trainRoute.removeStop("Дніпро");

        // Виводимо маршрут після видалення
        trainRoute.display();
    }
}