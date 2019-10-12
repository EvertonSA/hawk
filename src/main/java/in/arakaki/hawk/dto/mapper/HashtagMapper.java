package in.arakaki.hawk.dto.mapper;

import in.arakaki.hawk.dto.model.tweets.HashtagDto;
import in.arakaki.hawk.model.tweets.Hashtag;

/**
 * Created by Everton Arakaki.
 */
public class HashtagMapper {
    public static HashtagDto toHashtagtDto(Hashtag ticket) {
        return new HashtagDto();
    }
}
