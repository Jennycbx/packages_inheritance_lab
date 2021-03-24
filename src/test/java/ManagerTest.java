import org.junit.Before;
import org.junit.Test;
import staff.management.Manager;

import static org.junit.Assert.assertEquals;

public class ManagerTest {
    Manager manager;

    @Before
    public void before() {
        manager = new Manager("Harrison", "23HA567B", 5000, "CodeClan");
    }

    @Test
    public void getName(){
        assertEquals("Harrison", manager.getName());
    }

    @Test
    public void getNiNumber(){
        assertEquals("23HA567B", manager.getNiNumber());
    }

    @Test
    public void getSalary(){
        assertEquals(5000, manager.getSalary(), 0.0);
    }

    @Test
    public void getDepName(){
        assertEquals("CodeClan", manager.getDepName());
    }

    @Test
    public void canIncreaseSalary() {
        manager.raiseSalary(500);
        assertEquals(5500.0, manager.getSalary(), 0.0);
    }

    @Test
    public void canPayBonus() {
        assertEquals(50,manager.payBonus(), 0.0);
    }
    
    @Test
    public void willNotRunIfNegativeIncrease() {
        manager.raiseSalary(-500);
        assertEquals(5000, manager.getSalary(), 0.0);
    }

}
