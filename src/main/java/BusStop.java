import java.util.ArrayList;

public class BusStop {
    private String name;
    private ArrayList<Person> queue;
    
    public BusStop(String name) {
        this.name = name;
        this.queue = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int queueCount() {
        return queue.size();
    }

    public void addPersonToQueue(Person person) {
        queue.add(person);
    }

    public Person removePersonFromQueue() {
        return queue.remove(0);
    }
}
