/*
 * Class Name: Mood
 *
 * Version: Version 1.0
 *
 * Date : September 28, 2017
 *
 * Copyright (c) My Copyright, CMPUT301, University of Alberta - All Rights Reserved. You may use, distribute, or modify this code under terms and conditions of the Code of Students Behavior at University of Alberta
 */

package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Represents a Mood
 *
 * @author Ryan De Forest
 * @version 1.0
 * @see MoodAngry
 * @see MoodHappy
 * @since 1.0
 */

public abstract class Mood {
    private Date date;

    /**
     * Constructs a Mood object with current time for date
     */

    public Mood(){
        date = new Date();
    }

    /**
     * Constructs a Mood object with a given date
     * @param d date
     */

    public Mood(Date d) {
        date = d;
    }

    /**
     * Returns the date for the Mood object
     * @return date
     */

    public Date getDate() {
        return date;
    }


    /**
     * Sets the date for the Mood object
     * @param date date
     */

    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * Abstract function to return the type of Mood as a string
     * @return type of Mood
     */

    public abstract String getMood();
}
