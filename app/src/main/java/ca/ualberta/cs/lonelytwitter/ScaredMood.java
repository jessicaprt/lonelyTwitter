/*
 * Class Name: ScaredMood
 *
 * Version: Version 1.0
 *
 * Copyright (C) JPrieto, CMPUT 301, University of Alberta - All Rights Reserved.
 * You may use, distribute, or modify this code under terms and conditions of the Code of Student Behaviour at the University of Alberta
 */

package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Represents the scared mood for tweets
 *
 * @author  Jessica
 * @version 1.0
 * @see     Mood
 * @since   1.0
 */

public class ScaredMood extends Mood {
    private String scaredMood = "scared";

    public ScaredMood(Date date) {
        super(date);
    }

    public ScaredMood() {
        super();
    }

    /**
     * gets the current mood for the Tweet class
     * @return scared mood
     */
    @Override
    public String CurrentMood() {
        return scaredMood;
    }
}
