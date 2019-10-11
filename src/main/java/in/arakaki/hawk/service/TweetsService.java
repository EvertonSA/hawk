package in.arakaki.hawk.service;

import java.util.Set;

import in.arakaki.hawk.model.tweets.Tweets;

/**
 * Created by Everton Arakaki.
 */
public interface TweetsService {

    Set<Tweets> getAllTweets();
    Set<Tweets> getAllTweetsByHashtag(String hashTag);
}
