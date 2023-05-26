package tacocloud.data;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import tacocloud.TacoOrder;

import java.util.Date;
import java.util.List;

public interface OrderRepository extends CrudRepository<TacoOrder, Long>{
    List<TacoOrder> findByDeliveryZip(String deliveryZip);

    List<TacoOrder> readOrdersByDeliveryZipAndPlacedAtBetween(String deliveryZip,
                                                              Date startDate,
                                                              Date endDate);
    List<TacoOrder> findByDeliveryStateAndDeliveryCityAllIgnoresCase(String state,
                                                                     String city);
    List<TacoOrder> findByDeliveryCityOrderByDeliveryStreet(String city);

    @Query("Order o where o.deliveryCity='Seattle'")
    List<TacoOrder> readOrdersDeliveredInSeattle();
}
