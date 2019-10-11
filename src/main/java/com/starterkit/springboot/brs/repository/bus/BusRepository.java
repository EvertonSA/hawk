package in.arakaki.hawk.repository.bus;

import in.arakaki.hawk.model.bus.Agency;
import in.arakaki.hawk.model.bus.Bus;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by Everton Arakaki.
 */
public interface BusRepository extends MongoRepository<Bus, String> {
    Bus findByCode(String busCode);

    Bus findByCodeAndAgency(String busCode, Agency agency);
}
