package in.arakaki.hawk.repository.tweets;

import java.util.Set;

import org.springframework.data.mongodb.repository.MongoRepository;

import in.arakaki.hawk.model.tweets.Tweets;

/**
 * Created by Everton Arakaki.
 */
public interface TweetsRepository extends MongoRepository<Tweets, String> {
    
    Set<Tweets> findByHashtag(String hashtag);
}
