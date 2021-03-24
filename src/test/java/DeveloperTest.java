import org.junit.Before;
import org.junit.Test;
import staff.techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer developer;

    @Before
    public void before() {
        developer = new Developer("John", "23HA567C", 9000);
    }

    @Test
    public void getName(){
        assertEquals("John", developer.getName());
    }

    @Test
    public void getNiNumber(){
        assertEquals("23HA567C", developer.getNiNumber());
    }

    @Test
    public void getSalary() {
        assertEquals(9000, developer.getSalary(), 0.0);
    }

    @Test
    public void canIncreaseSalary() {
        developer.raiseSalary(500);
        assertEquals(9500.0, developer.getSalary(), 0.0);
    }

    @Test
    public void canPayBonus() {
        assertEquals(90,developer.payBonus(), 0.0);
    }
}
