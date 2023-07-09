package cinema.rest.api.service;

import cinema.rest.api.model.Order;
import cinema.rest.api.model.ShoppingCart;
import cinema.rest.api.model.User;
import java.util.List;

public interface OrderService {
    Order completeOrder(ShoppingCart shoppingCart);

    List<Order> getOrdersHistory(User user);
}
