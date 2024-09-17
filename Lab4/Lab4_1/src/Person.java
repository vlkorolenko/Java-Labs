import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private List<Person> friends;

    public Person(String name) {
        this.name = name;
        this.friends = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<Person> getFriends() {
        return friends;
    }

    public void addFriend(Person friend) {
        this.friends.add(friend);
    }
}
