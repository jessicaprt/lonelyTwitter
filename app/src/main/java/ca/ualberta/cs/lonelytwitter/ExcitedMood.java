package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by jessicaa on 9/14/17.
 */

public class ExcitedMood extends Mood {
    private String excitedMood = "excited";

    public ExcitedMood(Date date) {
        super(date);
    }

    public ExcitedMood() {
        super();
    }

    @Override
    public String CurrentMood() {
        return excitedMood;
    }
}