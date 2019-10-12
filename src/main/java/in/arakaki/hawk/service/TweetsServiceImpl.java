package in.arakaki.hawk.service;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import in.arakaki.hawk.dto.model.tweets.HashtagDto;
import in.arakaki.hawk.dto.model.tweets.TweetsDto;
import in.arakaki.hawk.exception.EntityType;
import in.arakaki.hawk.exception.ExceptionType;
import in.arakaki.hawk.exception.HawkException;
import in.arakaki.hawk.model.tweets.Tweets;
import in.arakaki.hawk.repository.tweets.TweetsRepository;

/**
 * Created by Everton Arakaki.
 */
@Component
public class TweetsServiceImpl implements TweetsService {

    @Autowired
    private TweetsRepository tweetsRepository;

    @Autowired
    private ModelMapper modelMapper;

    /**
     * Returns all the available tweets in the database.
     *
     * @return
     */

    @Override
    public Set<TweetsDto> getAllTweets() {
        return tweetsRepository.findAll().
                                stream().
                                map(tweets -> modelMapper.map(tweets, TweetsDto.class))
                                .collect(Collectors.toCollection(TreeSet::new));
    }

	@Override
	public Set<TweetsDto> getAllTweetsByHashtag(HashtagDto hashtagDto) {
		return tweetsRepository
				.findByHashtag(hashtagDto.getHashtag())
				.stream()
				.map(tweets -> modelMapper.map(tweets, TweetsDto.class))
				.collect(Collectors.toCollection(TreeSet::new));
	}

	@Override
	public Set<TweetsDto> getAllTweetsByHashtag(String hashtag) {
		return tweetsRepository
				.findByHashtag(hashtag)
				.stream()
				.map(tweets -> modelMapper.map(tweets, TweetsDto.class))
				.collect(Collectors.toCollection(TreeSet::new));
	}
	
    /**
     * Returns a new RuntimeException
     *
     * @param entityType
     * @param exceptionType
     * @param args
     * @return
     */
    private RuntimeException exception(EntityType entityType, ExceptionType exceptionType, String... args) {
        return HawkException.throwException(entityType, exceptionType, args);
    }

    /**
     * Returns a new RuntimeException
     *
     * @param entityType
     * @param exceptionType
     * @param args
     * @return
     */
    private RuntimeException exceptionWithId(EntityType entityType, ExceptionType exceptionType, String id,
            String... args) {
        return HawkException.throwExceptionWithId(entityType, exceptionType, id, args);
    }




}
