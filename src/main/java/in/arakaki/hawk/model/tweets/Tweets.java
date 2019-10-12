package in.arakaki.hawk.model.tweets;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import in.arakaki.hawk.model.user.User;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

/**
 * Created by Everton Arakaki.
 */
@Getter
@Setter
@NoArgsConstructor
@Accessors(chain = true)
@Document(collection = "tweets")
public class Tweets {

    @Id
    private String id;
    
    private User user;

    private List<Hashtag> hashtag;

    private String id_str;

}
