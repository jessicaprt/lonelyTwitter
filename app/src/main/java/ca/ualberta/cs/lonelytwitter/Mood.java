/*
 * Class Name: Mood
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
 * Represents a the mood for the tweets
 *
 * @author  Jessica
 * @version 1.0
 * @see     Mood
 * @since   1.0
 */

public abstract class Mood {
    private Date date;

    public Mood(Date date) {
        this.date = date;
    }

    public Mood() {
        this.date = new Date();
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String CurrentMood() {
        return null;
    }

}
