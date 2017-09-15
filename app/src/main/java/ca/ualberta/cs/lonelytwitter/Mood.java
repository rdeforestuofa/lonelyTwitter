package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by deforest on 9/14/17.
 */

public abstract class Mood {
    private Date date;

    public Mood(){
        date = new Date();
    }

    public Mood(Date d) {
        date = d;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public abstract String getMood();
}
