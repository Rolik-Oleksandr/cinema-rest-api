package cinema.rest.api.dao;

import cinema.rest.api.model.Order;
import cinema.rest.api.model.User;
import java.util.List;

public interface OrderDao {
    Order add(Order order);

    List<Order> getOrdersHistory(User user);
}
