package ca.ualberta.cs.lonelytwitter;


import java.util.Date;

public interface Tweetable {
    //fix redundant public access in interface
    String getMessage();

    Date getDate();

}
