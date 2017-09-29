/*
 * Class Name: Normal Tweet
 *
 * Version: Version 1.0
 *
 * Copyright (C) JPrieto, CMPUT 301, University of Alberta - All Rights Reserved.
 * You may use, distribute, or modify this code under terms and conditions of the
 * Code of Student Behaviour at the University of Alberta
 */

package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by jessicaa on 9/14/17.
 */

public class NormalTweet extends Tweet {
    /**
     *
     * @param message the message to be set to a Normal Tweet
     */
    public NormalTweet(String message) {
        super(message);
    }

    /**
     *
     * @param message the message to be set to a Normal Tweet
     * @param date the date to be set to a Normal Tweet
     */
    public NormalTweet(String message, Date date) {
        super(message,date);
    }

    /**
     * determines if the Tweet type is Important, implemented on classes that uses the abstract class
     * @return true if the tweet type is important, false otherwise
     */
    @Override
    public Boolean isImportant() {
        return Boolean.FALSE;
    }
}
