package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by deforest on 9/14/17.
 */

public class MoodHappy extends Mood {

    public MoodHappy() {
        super();
    }

    public MoodHappy(Date d) {
        super(d);
    }

    @Override
    public String getMood() {
        return "Happy";
    }
}
