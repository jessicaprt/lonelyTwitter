package ca.ualberta.cs.lonelytwitter;

import android.test.ActivityInstrumentationTestCase2;

import java.util.ArrayList;
import java.util.Arrays;

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
        tweets.addTweet(tweet);
        assertTrue(tweets.hasTweet(tweet));
    }

    public void testDeleteTweet() {
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("test!");
        tweets.addTweet(tweet);
        tweets.delete(tweet);
        assertFalse(tweets.hasTweet(tweet));
    }

    public void testHasTweet() {
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("test");
        tweets.addTweet(tweet);
        assertTrue(tweets.hasTweet(tweet));
    }

    public void testGetTweet() {
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("test");
        tweets.addTweet(tweet);
        Tweet getTweet = tweets.getTweet(0);
        assertEquals(getTweet.getMessage(), tweet.getMessage());
    }

    public void testGetTweets() {
        TweetList tweets = new TweetList();
        Tweet tweet1 = new NormalTweet("test1");
        Tweet tweet2 = new NormalTweet("test2");
        Tweet tweet3 = new NormalTweet("test3");
        Tweet tweet4 = new NormalTweet("test4");
        tweets.addTweet(tweet1);
        tweets.addTweet(tweet2);
        tweets.addTweet(tweet3);
        tweets.addTweet(tweet4);

        ArrayList<Tweet> getTweets = tweets.getTweets();
        assertEquals(getTweets, Arrays.asList(tweet1, tweet2, tweet3, tweet4));
    }

    public void testGetCount() {
        TweetList tweets = new TweetList();
        Tweet tweet1 = new NormalTweet("test1");
        Tweet tweet2 = new NormalTweet("test2");
        Tweet tweet3 = new NormalTweet("test3");
        Tweet tweet4 = new NormalTweet("test4");
        tweets.addTweet(tweet1);
        tweets.addTweet(tweet2);
        tweets.addTweet(tweet3);
        tweets.addTweet(tweet4);

        int tweetsSize = tweets.getCount();
        assertEquals(4, tweetsSize);
    }
}