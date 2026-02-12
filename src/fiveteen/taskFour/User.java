package fiveteen.taskFour;

public class User {
    Long id;
    String name;

    public User(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public String toString() {
        return "User{id=" + id + ", name='" + name + "'}";
    }
}