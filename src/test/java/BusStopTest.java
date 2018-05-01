import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusStopTest {

    BusStop busstop;
    Person person;
    Bus bus;

    @Before
    public void before() {
        busstop = new BusStop("Glasgow");
        bus = new Bus("Glasgow", 20);
        person = new Person();
    }

    @Test
    public void hasName() {
        assertEquals("Glasgow", busstop.getName());
    }

    @Test
    public void hasEmptyQueue() {
        assertEquals(0, busstop.queueCount());
    }

    @Test
    public void addPersonToQueue() {
        busstop.addPersonToQueue(person);
        assertEquals(1, busstop.queueCount());
    }

    @Test
    public void removePersonToQueue() {
        busstop.addPersonToQueue(person);
        busstop.removePersonFromQueue();
        assertEquals(0, busstop.queueCount());
    }
}
