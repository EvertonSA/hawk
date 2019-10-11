package in.arakaki.hawk.repository.user;

import in.arakaki.hawk.model.user.Role;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by Everton Arakaki.
 */
public interface RoleRepository extends MongoRepository<Role, String> {

    Role findByRole(String role);

}
