package tacocloud.data;

import org.springframework.data.repository.CrudRepository;
import tacocloud.TacoOrder;

public interface OrderRepository extends CrudRepository<TacoOrder, Long>{
}
