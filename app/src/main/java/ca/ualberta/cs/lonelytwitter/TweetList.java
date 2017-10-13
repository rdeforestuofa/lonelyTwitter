package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

/**
 * Created by deforest on 10/12/17.
 */

public class TweetList {

    private ArrayList<Tweet> tweets = new ArrayList<Tweet>();

    public TweetList() {

    }

    public void addTweet(Tweet tweet) {
        if (tweets.contains(tweet)) {
            throw new IllegalArgumentException();
        }
        else {
            tweets.add(tweet);
        }
    }

    public boolean hasTweet(Tweet tweet) {
        return tweets.contains(tweet);
    }

    public void delete(Tweet tweet) {
        tweets.remove(tweet);
    }

    public Tweet getTweet(int index) {
        return tweets.get(index);
    }

    public ArrayList<Tweet> getTweets() {
        ArrayList<Tweet> temp = (ArrayList<Tweet>) tweets.clone();
        Collections.sort(temp, new Comparator<Tweet>() {
            public int compare(Tweet lhs, Tweet rhs) {
               return lhs.getDate().compareTo(rhs.getDate());
            }
        });
        return temp;
    }

    public int getCount() {
        return tweets.size();
    }


}
