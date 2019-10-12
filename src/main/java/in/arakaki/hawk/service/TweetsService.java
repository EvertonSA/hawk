package in.arakaki.hawk.service;

import java.util.Set;

import in.arakaki.hawk.dto.model.tweets.HashtagDto;
import in.arakaki.hawk.dto.model.tweets.TweetsDto;

/**
 * Created by Everton Arakaki.
 */
public interface TweetsService {

    Set<TweetsDto> getAllTweets();
    
    Set<TweetsDto> getAllTweetsByHashtag(HashtagDto hashtagDto);
    
    Set<TweetsDto> getAllTweetsByHashtag(String hashtag);
}
