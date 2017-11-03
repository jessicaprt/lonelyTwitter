package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by romansky on 1/14/16.
 *
 * Refactored by: Jessica Prieto
 *
 * 5. removed modifiers for interface methods because they don't need it.
 *    Classes that implements the method will use modifiers.
 */
public interface Tweetable {
    String getMessage();
    Date getDate();
}
