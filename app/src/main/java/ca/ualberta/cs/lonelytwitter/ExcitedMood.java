/*
 * Class Name: Escited Mood
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
 * Represents the excited mood for tweets
 *
 * @author  Jessica
 * @version 1.0
 * @see     Mood
 * @since   1.0
 */
public class ExcitedMood extends Mood {
    private String excitedMood = "excited";

    public ExcitedMood(Date date) {
        super(date);
    }

    public ExcitedMood() {
        super();
    }

    /**
     * gets the current mood for the Tweet class
     * @return excited mood
     */
    @Override
    public String CurrentMood() {
        return excitedMood;
    }
}