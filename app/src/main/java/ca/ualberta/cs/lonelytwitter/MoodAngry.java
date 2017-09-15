package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by deforest on 9/14/17.
 */

public class MoodAngry extends Mood {

    public MoodAngry() {
        super();
    }

    public MoodAngry(Date d) {
        super(d);
    }

    @Override
    public String getMood() {
        return "Angry";
    }
}
