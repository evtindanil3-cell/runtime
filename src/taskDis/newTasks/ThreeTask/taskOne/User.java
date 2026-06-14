package taskDis.newTasks.ThreeTask.taskOne;

abstract class User {
    private final String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
