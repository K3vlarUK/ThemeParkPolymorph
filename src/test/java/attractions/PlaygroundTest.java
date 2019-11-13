package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.*;

public class PlaygroundTest {
    Playground playground;
    Visitor visitor1;
    Visitor visitor2;

    @Before
    public void setUp() throws Exception {
        playground = new Playground("Fun Zone", 7);
        visitor1 = new Visitor(11, 134, 15.00);
        visitor2 = new Visitor(19, 185, 40.00);
    }

    @Test
    public void hasName() {
        assertEquals("Fun Zone", playground.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(7, playground.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, playground.getVisitCount());
    }

    @Test
    public void canGetInPlayground__Under16() {
        assertTrue(playground.isAllowedTo(visitor1));
    }

    @Test
    public void canGetInPlayground__Over16() {
        assertFalse(playground.isAllowedTo(visitor2));
    }
}
