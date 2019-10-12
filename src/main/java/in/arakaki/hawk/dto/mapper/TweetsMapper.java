package in.arakaki.hawk.dto.mapper;

import java.util.stream.Collectors;

import in.arakaki.hawk.dto.model.tweets.*;

import in.arakaki.hawk.model.tweets.*;

/**
 * Created by Everton Arakaki.
 */
public class TweetsMapper {
    public static TweetsDto toTweetsDto(Tweets tweets) {
    	return new TweetsDto()
        		.setId(tweets.getId())
        		.setUserid(tweets.getUser().getName())
        		.setHashtag(tweets.getHashtag().stream().map( u -> u.getValue()).collect(Collectors.toList()));
    }
}
