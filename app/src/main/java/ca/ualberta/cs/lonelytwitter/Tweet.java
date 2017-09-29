/*
 * Class Name: Tweet
 *
 * Version: Version 1.0
 *
 * Date : September 28, 2017
 *
 * Copyright (c) My Copyright, CMPUT301, University of Alberta - All Rights Reserved. You may use, distribute, or modify this code under terms and conditions of the Code of Students Behavior at University of Alberta
 */

package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;
import java.util.Date;

/**
 * Represents a Tweet
 *
 * @author Ryan De Forest
 * @version 1.0
 * @see NormalTweet
 * @see ImportantTweet
 * @since 1.0
 */

public abstract class Tweet implements Tweetable {

    private String message;
    private Date date;

    // old code from Lab 2
    //private ArrayList<Mood> moods;

    /**
     * Constructs Tweet objects with message only
     * @param message tweet message
     */

    public Tweet(String message){
        this.message = message;
        this.date = new Date();
    }

    /**
     * Constructs Tweet objects with message and date
     *
     * @param message tweet message
     * @param date tweet date
     */

    public Tweet(String message, Date date){
        this.message = message;
        this.date = date;
    }

    /**
     * Sets the date for a Tweet object
     * @param date tweet date
     */

    public void setDate(Date date){
        this.date = date;
    }

    /**
     * Returns the date for a Tweet object
     * @return tweet date
     */

    public Date getDate(){
        return date;
    }

    /**
     * Returns the message for a Tweet object
     * @return tweet message
     */

    public String getMessage(){
        return message;
    }

    /**
     * Abstract function to check if a tweet is Important or not
     * @return flag if tweet is important
     */

    public abstract Boolean isImportant();

    /**
     * Sets tweet messages
     *
     * @param message tweet message
     * @throws TweetTooLongException
     */

    public void setMessage(String message) throws TweetTooLongException{
        if (message.length() <= 140){
            this.message = message;
        }
        else{
            throw new TweetTooLongException();
        }
    }

    /**
     * Returns the contents of a Tweet object for display
     * @return string format of a Tweet object
     */

    @Override
    public String toString(){
        return date.toString() + " | " + message;
    }
}
