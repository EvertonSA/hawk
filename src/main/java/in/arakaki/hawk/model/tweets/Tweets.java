package in.arakaki.hawk.model.tweets;

import java.util.Set;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
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

    @DBRef
    private User user;

    private Set<String> hashtag;

    private String id_str;

}
