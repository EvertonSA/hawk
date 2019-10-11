package in.arakaki.hawk.model.tweets;

import java.util.Set;

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
@Document(collection = "hashtag")
public class Hashtag {

    @Id
    private String id;

    private String value;

    private Set<User> users;

    private Set<Tweets> tweets;

}
