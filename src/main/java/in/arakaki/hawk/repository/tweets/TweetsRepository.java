package in.arakaki.hawk.repository.tweets;

import java.util.Set;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import in.arakaki.hawk.model.tweets.Tweets;

/**
 * Created by Everton Arakaki.
 */
public interface TweetsRepository extends MongoRepository<Tweets, String> {
    
	@Query("{'hashtag': ?0}")
    Set<Tweets> findByHashtag(String hashtag);
}
