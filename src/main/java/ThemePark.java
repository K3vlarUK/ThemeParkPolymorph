import behaviours.IReviewed;

import java.util.ArrayList;

public class ThemePark {

    String name;
    ArrayList<IReviewed> reviewedSites;

    public ThemePark(String name) {
        this.name = name;
        reviewedSites = new ArrayList<IReviewed>();
    }

    public String getName() {
        return this.name;
    }

    public ArrayList<IReviewed> getAllReviewed() {
        return this.reviewedSites;
    }

    public int numberOfReviewedSites(){
        return this.reviewedSites.size();
    }

    public void addReviewedSitesToPark(IReviewed site){
        this.reviewedSites.add(site);
    }
}
