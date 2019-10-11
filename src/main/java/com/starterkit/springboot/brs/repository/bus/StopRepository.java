package in.arakaki.hawk.repository.bus;

import in.arakaki.hawk.model.bus.Stop;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by Everton Arakaki.
 */
public interface StopRepository extends MongoRepository<Stop, String> {
    Stop findByCode(String code);
}
