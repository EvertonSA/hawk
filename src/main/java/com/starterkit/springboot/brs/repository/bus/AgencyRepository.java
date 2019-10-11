package in.arakaki.hawk.repository.bus;

import in.arakaki.hawk.model.bus.Agency;
import in.arakaki.hawk.model.user.User;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by Everton Arakaki.
 */
public interface AgencyRepository extends MongoRepository<Agency, String> {
    Agency findByCode(String agencyCode);

    Agency findByOwner(User owner);

    Agency findByName(String name);
}
