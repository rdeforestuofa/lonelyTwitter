package ca.ualberta.cs.lonelytwitter;

import android.test.ActivityInstrumentationTestCase2;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by deforest on 10/12/17.
 */

public class TweetListTest extends ActivityInstrumentationTestCase2 {

    public TweetListTest() {
        super(ca.ualberta.cs.lonelytwitter.LonelyTwitterActivity.class);

    }

    public void testAddTweet(){
        //assertTrue(Boolean.FALSE);
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("adding Tweet");
        tweets.addTweet(tweet);
        tweets.addTweet(tweet);
        assertTrue(tweets.hasTweet(tweet));
    }

    public void testDelete() {
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("test");
        tweets.addTweet(tweet);
        tweets.delete(tweet);
        assertFalse(tweets.hasTweet(tweet));
    }

    public void testHasTweet() {
        TweetList list = new TweetList();
        Tweet tweet = new NormalTweet("test");
        list.addTweet(tweet);
        assertTrue(list.hasTweet(tweet));

    }

    public void testGetTweet() {
        TweetList list = new TweetList();
        Tweet tweet = new NormalTweet("test");
        list.addTweet(tweet);
        Tweet returnedTweet = list.getTweet(0);
        assertEquals(returnedTweet.getMessage(), tweet.getMessage());
    }

    public void testGetCount() {
        TweetList list = new TweetList();
        Tweet tweet = new NormalTweet("test");
        Tweet tweet2 = new NormalTweet("test2");
        Tweet tweet3 = new NormalTweet("test3");
        list.addTweet(tweet);
        assertEquals(list.getCount(), 1);
        list.addTweet(tweet2);
        assertEquals(list.getCount(), 2);
        list.addTweet(tweet3);
        assertEquals(list.getCount(), 3);
    }

    public void testGetTweets() {
        TweetList list = new TweetList();
        Tweet tweet = new NormalTweet("test");
        Tweet tweet2 = new NormalTweet("test2");
        Tweet tweet3 = new NormalTweet("test3");
        list.addTweet(tweet);
        list.addTweet(tweet2);
        list.addTweet(tweet3);

        ArrayList<Tweet> test_list = list.getTweets();
        assertEquals(test_list.get(0).getDate().compareTo(test_list.get(1).getDate()), 1);
    }
}
