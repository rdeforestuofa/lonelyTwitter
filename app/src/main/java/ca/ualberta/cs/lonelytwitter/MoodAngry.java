/*
 * Class Name: MoodAngry
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
 * Represents an Angry Mood
 *
 * @author Ryan De Forest
 * @version 1.0
 * @since 1.0
 */

public class MoodAngry extends Mood {

    /**
     * Constructs a MoodAngry object
     */

    public MoodAngry() {
        super();
    }


    /**
     * Constructs a MoodAngry object with a given date
     * @param d date
     */
    public MoodAngry(Date d) {
        super(d);
    }


    /**
     * Returns the type of Mood object as a string
     * @return the text "Angry"
     */

    @Override
    public String getMood() {
        return "Angry";
    }
}
