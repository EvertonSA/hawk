package in.arakaki.hawk.repository.user;

import in.arakaki.hawk.model.user.User;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by Everton Arakaki.
 */
public interface UserRepository extends MongoRepository<User, String> {

    User findByEmail(String email);

}
