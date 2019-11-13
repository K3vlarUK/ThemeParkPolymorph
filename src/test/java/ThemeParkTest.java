import attractions.Dodgems;
import attractions.Park;
import attractions.Playground;
import attractions.RollerCoaster;
import org.junit.Test;
import stalls.CandyflossStall;
import stalls.IceCreamStall;
import stalls.ParkingSpot;
import stalls.TobaccoStall;

import java.util.ArrayList;

import static junit.framework.TestCase.assertEquals;

public class ThemeParkTest {

    ThemePark themePark;
    RollerCoaster rollerCoaster;
    Dodgems dodgems;
    Park park;
    Playground playground;
    CandyflossStall candyflossStall;
    TobaccoStall tobaccoStall;
    IceCreamStall iceCreamStall;

    @Test
    public void canAddSitesToThemePark() {
        rollerCoaster = new RollerCoaster("Blue Ridge", 10);
        dodgems = new Dodgems("Bumper Cars", 5);
        themePark.addReviewedSitesToPark(rollerCoaster);
        themePark.addReviewedSitesToPark(dodgems);
        assertEquals(2, themePark.numberOfReviewedSites());
    }

    @Test
    public void canGetAllReviewed() {
        rollerCoaster = new RollerCoaster("Blue Ridge", 10);
        dodgems = new Dodgems("Bumper Cars", 5);
        park = new Park("Leafy Meadows", 9);
        playground = new Playground("Fun Zone", 7);
        tobaccoStall = new TobaccoStall("Jacks Drum", "Jack Jarvis", ParkingSpot.B1);
        iceCreamStall = new IceCreamStall("Dream Cones", "Vanilla Ice", ParkingSpot.A4);
        candyflossStall = new CandyflossStall("Candy Land", "Harry Belafonte", ParkingSpot.A1);
        themePark = new ThemePark("Fun Land");
        themePark.addReviewedSitesToPark(rollerCoaster);
        themePark.addReviewedSitesToPark(dodgems);
        themePark.addReviewedSitesToPark(park);
        themePark.addReviewedSitesToPark(playground);
        themePark.addReviewedSitesToPark(tobaccoStall);
        themePark.addReviewedSitesToPark(iceCreamStall);
        themePark.addReviewedSitesToPark(candyflossStall);
        assertEquals(, themePark.getAllReviewed());
    }


}
