import org.junit.Before;
import org.junit.Test;
import staff.management.Director;
import staff.management.Manager;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;

    @Before
    public void before() {
        director = new Director("Harrison", "23HA567B", 5000, "CodeClan", 50000.00);
    }

    @Test
    public void getName(){
        assertEquals("Harrison", director.getName());
    }

    @Test
    public void getNiNumber(){
        assertEquals("23HA567B", director.getNiNumber());
    }

    @Test
    public void getSalary(){
        assertEquals(5000, director.getSalary(), 0.0);
    }

    @Test
    public void getDepName(){
        assertEquals("CodeClan", director.getDepName());
    }

    @Test
    public void getBudget() {
        assertEquals(50000.00, director.getBudget(), 0.0);
    }

    @Test
    public void canIncreaseSalary() {
        director.raiseSalary(500);
        assertEquals(5500.0, director.getSalary(), 0.0);
    }

    @Test
    public void canPayBonus() {
        assertEquals(100,director.payBonus(), 0.0);
    }

}
