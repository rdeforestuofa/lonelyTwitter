/*
 * Class Name: ImportantTweet
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
 * Represents an ImportantTweet
 *
 * @author Ryan De Forest
 * @version 1.0
 * @since 1.0
 */

public class ImportantTweet extends Tweet {
    /**
     * Constructs an ImportantTweet object with only a message
     * @param message tweet message
     */

    public ImportantTweet(String message){
        super(message);
    }

    /**
     * Constructs an ImportantTweet object with a message and date
     * @param message tweet message
     * @param date tweet date
     */

    public ImportantTweet(String message, Date date) {
        super(message, date);
    }


    /**
     * Returns true for the overridden method as this is from an ImportantTweet
     * @return true
     */
    @Override
    public Boolean isImportant(){
        return Boolean.TRUE;
    }
}
