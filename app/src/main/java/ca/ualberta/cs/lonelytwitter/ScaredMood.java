package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by jessicaa on 9/14/17.
 */

public class ScaredMood extends Mood {
    private String scaredMood = "scared";

    public ScaredMood(Date date) {
        super(date);
    }

    public ScaredMood() {
        super();
    }

    @Override
    public String CurrentMood() {
        return scaredMood;
    }
}
