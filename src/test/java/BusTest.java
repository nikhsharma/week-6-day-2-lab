import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTest {

    Bus bus;
    Person person;
    BusStop busstop;

    @Before
    public void before() {
        bus = new Bus("Glasgow", 10);
        person = new Person();
        busstop =  new BusStop("Glasgow");
        busstop.addPersonToQueue(person);

    }

    @Test
    public void hasDestination(){
        assertEquals("Glasgow", bus.getDestination());
    }

    @Test
    public void hasCapacity(){
        assertEquals(10, bus.getCapacity());
    }

    @Test
    public void passangerCount(){
        assertEquals(0, bus.passengerCount());
    }

    @Test
    public void addPassengerIfSpaceOnBus(){

        bus.pickUp(busstop);
        assertEquals(1, bus.passengerCount());
    }

//    @Test
//    public void removePassengerFromBus(){
//        bus.addPassenger(person);
//        bus.removePassenger();
//        assertEquals(0, bus.passengerCount());
//    }

}
