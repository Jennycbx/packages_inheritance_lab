import org.junit.Before;
import org.junit.Test;
import staff.techStaff.DatabaseAdmin;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    DatabaseAdmin databaseAdmin;

    @Before
    public void before() {
        databaseAdmin = new DatabaseAdmin("Harrison", "23HA567B", 8000);
    }

    @Test
    public void getName(){
        assertEquals("Harrison", databaseAdmin.getName());
    }

    @Test
    public void getNiNumber(){
        assertEquals("23HA567B", databaseAdmin.getNiNumber());
    }

    @Test
    public void getSalary(){
        assertEquals(8000, databaseAdmin.getSalary(), 0.0);
    }

    @Test
    public void canIncreaseSalary() {
        databaseAdmin.raiseSalary(500);
        assertEquals(8500.0, databaseAdmin.getSalary(), 0.0);
    }

    @Test
    public void canPayBonus() {
        assertEquals(80,databaseAdmin.payBonus(), 0.0);
    }

}
