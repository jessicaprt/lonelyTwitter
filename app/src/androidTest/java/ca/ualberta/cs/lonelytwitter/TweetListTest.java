package ca.ualberta.cs.lonelytwitter;

import android.test.ActivityInstrumentationTestCase2;

/**
 * Created by Jessica on 2017-10-12.
 */

public class TweetListTest extends ActivityInstrumentationTestCase2{
    public TweetListTest() {
        super(ca.ualberta.cs.lonelytwitter.LonelyTwitterActivity.class);
    }

    public void testAddTweet() {
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("adding Tweet");
        tweets.add(tweet);
        assertTrue(tweets.hasTweet(tweet));
    }

    public void testDeleteTweet() {
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("test!");
        tweets.add(tweet);
        tweets.delete(tweet);
        assertFalse(tweets.hasTweet(tweet));
    }
}