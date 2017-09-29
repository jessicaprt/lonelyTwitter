/*
 * Class Name: Tweet
 *
 * Version: Version 1.0
 *
 * Copyright (C) JPrieto, CMPUT 301, University of Alberta - All Rights Reserved. You may use, distribute, or modify this code under terms and conditions of the Code of Student Behaviour at the Universoty of Alberta
 */

package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;
import java.util.Date;

/**
 * Represents a Tweet
 *
 * @author  Jessica
 * @version 1.0
 * @see     Tweetable
 * @see     ImportantTweet
 * @since   1.0
 */

public abstract class Tweet implements Tweetable {
    private String message;
    private Date date;
    private ArrayList<Mood> moods;

    /**
     * Constructor for the Tweet class
     *
     * @param message
     */
    public Tweet(String message) {
        this.message = message;
        this.date = new Date();
        this.moods = new ArrayList<Mood>();
    }

    /**
     * Constructor for the tweet class
     *
     * @param message the message to be set to the message attribute
     * @param date the date to be set to the message attribute when initializing
     */

    public Tweet(String message, Date date) {
        this.message = message;
        this.date = date;
        this.moods = new ArrayList<Mood>();
    }

    /**
     * sets the current date on the date attribute of the class
     *
     * @param date the date to be set to the date attribute of the Tweets class
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * fetches the date attribute of the Tweet class
     *
     * @return the date for the Tweet class
     */
    public Date getDate() {
        return date;
    }

    /**
     * sets the user's tweet message to the message attribute of the tweet class
     *
     * @param message
     * @throws TweetTooLongException
     */
    public void setMessage(String message) throws TweetTooLongException {
        if (message.length() <= 140){
            this.message = message;
        } else {
            throw new TweetTooLongException();
        }
    }

    /**
     * fetches the message attribute of the Tweet class
     *
     * @return the message for the Tweet class
     */
    public String getMessage() {
        return message;
    }

    /**
     * sets the mood on the Tweet class
     *
     * @param moods the mood to be set to the Tweet class
     */
    public void setMoods(ArrayList<Mood> moods) {
        this.moods = moods;
    }

    /**
     * fetches the mood for the Tweet class
     * @return the mood attribute of the Tweet class
     */
    public ArrayList<Mood> getMoods() {
        return moods;
    }

    /**
     * determines if the Tweet type is Important, implemented on classes that uses the abstract class
     * @return true if the tweet type is important, false otherwise
     */
    public abstract Boolean isImportant();

    /**
     * overrides the method toString specifically for the Tweet class
     * @return the preferred version of toString when using for Tweet class
     */
    @Override
    public String toString() {
        return date.toString() + " | " + message;
    }
}