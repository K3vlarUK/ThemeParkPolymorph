package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.*;

public class RollercoasterTest {

    RollerCoaster rollerCoaster;
    Visitor visitor1;
    Visitor visitor2;
    Visitor visitor3;

    @Before
    public void setUp() {
        rollerCoaster = new RollerCoaster("Blue Ridge", 10);
        visitor1 = new Visitor(11, 134, 15.00);
        visitor2 = new Visitor(19, 210, 40.00);
        visitor3 = new Visitor(19, 125, 40.00);
    }

    @Test
    public void hasName() {
        assertEquals("Blue Ridge", rollerCoaster.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(10, rollerCoaster.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, rollerCoaster.getVisitCount());
    }

    @Test
    public void allowedToEnter__True() {
        assertTrue(rollerCoaster.isAllowedTo(visitor2));
    }

    @Test
    public void allowedToEnter__False__Both() {
        assertFalse(rollerCoaster.isAllowedTo(visitor1));
    }

    @Test
    public void allowedToEnter__False__Height() {
        assertFalse(rollerCoaster.isAllowedTo(visitor3));
    }

    @Test
    public void hasADefaultPrice() {
        assertEquals(8.40, rollerCoaster.defaultPrice(), 0.01);
    }

    @Test
    public void hasDoublePriceForTallPeople() {
        assertEquals(16.80, rollerCoaster.priceFor(visitor2), 0.01);
    }
}
