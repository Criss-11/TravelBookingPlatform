package TravelBookingPlatform.data;

import TravelBookingPlatform.Order;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<Order, Long> {
}
