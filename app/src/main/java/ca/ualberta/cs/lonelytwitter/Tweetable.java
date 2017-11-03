package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by romansky on 1/14/16.
 *
 * 5. Refactored by: Jessica Prieto
 *      removed modifiers for interface methods
 *      interface methods doesn't require modifiers because these methods are overrided by classes
 *      that implements it.
 */
public interface Tweetable {
    String getMessage();
    Date getDate();
}
