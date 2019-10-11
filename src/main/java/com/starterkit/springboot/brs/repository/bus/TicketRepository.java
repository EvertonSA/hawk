package in.arakaki.hawk.repository.bus;

import in.arakaki.hawk.model.bus.Ticket;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by Everton Arakaki.
 */
public interface TicketRepository extends MongoRepository<Ticket, Long> {
}
