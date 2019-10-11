package in.arakaki.hawk.repository.bus;

import in.arakaki.hawk.model.bus.Agency;
import in.arakaki.hawk.model.bus.Bus;
import in.arakaki.hawk.model.bus.Stop;
import in.arakaki.hawk.model.bus.Trip;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

/**
 * Created by Everton Arakaki.
 */
public interface TripRepository extends MongoRepository<Trip, String> {
    Trip findBySourceStopAndDestStopAndBus(Stop source, Stop destination, Bus bus);

    List<Trip> findAllBySourceStopAndDestStop(Stop source, Stop destination);

    List<Trip> findByAgency(Agency agency);
}
