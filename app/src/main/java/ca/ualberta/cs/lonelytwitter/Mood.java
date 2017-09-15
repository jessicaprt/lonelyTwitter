package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by jessicaa on 9/14/17.
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
