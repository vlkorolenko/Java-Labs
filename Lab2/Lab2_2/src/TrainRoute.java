import java.util.LinkedList;
import java.util.NoSuchElementException;

public class TrainRoute {
    private LinkedList<String> route;

    public TrainRoute() {
        route = new LinkedList<>();
    }

    public void addStop(String stop) {
        route.add(stop);
    }

    public void removeStop(String stop) {
        try {
            if (route.contains(stop)) {
                route.remove(stop);
            } else {
                throw new NoSuchElementException("Зупинку " + stop + " не знайдено в маршруті");
            }
        } catch (NoSuchElementException e) {
            System.out.println(e.getMessage());
        }
    }

    public void display() {
        System.out.println("Маршрут поїзда: " + route);
    }
}
