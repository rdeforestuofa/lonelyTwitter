/*
 * Class Name: NormalTweet
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
 * Represents a NormalTweet
 *
 * @author Ryan De Forest
 * @version 1.0
 * @since 1.0
 */
public class NormalTweet extends Tweet {
    /**
     * Constructs a NormalTweet object with only a given message
     * @param message tweet message
     */

    public NormalTweet(String message) {
        super(message);
    }

    /**
     * Constructs a NormalTweet object with a message and a date
     * @param message tweet message
     * @param date tweet date
     */

    public NormalTweet(String message, Date date) {
        super(message, date);
    }


    /**
     * Returns false for the overridden method as this is from a NormalTweet
     * @return false
     */
    @Override
    public Boolean isImportant() {
        return Boolean.FALSE;
    }

}
