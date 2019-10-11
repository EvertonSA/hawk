package in.arakaki.hawk.repository.bus;

import in.arakaki.hawk.model.bus.Trip;
import in.arakaki.hawk.model.bus.TripSchedule;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by Everton Arakaki.
 */
public interface TripScheduleRepository extends MongoRepository<TripSchedule, String> {
    TripSchedule findByTripDetailAndTripDate(Trip tripDetail, String tripDate);
}