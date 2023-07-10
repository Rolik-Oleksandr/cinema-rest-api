package cinema.rest.api.dao;

import cinema.rest.api.model.ShoppingCart;
import cinema.rest.api.model.User;

public interface ShoppingCartDao {
    ShoppingCart add(ShoppingCart shoppingCart);

    ShoppingCart getByUser(User user);

    ShoppingCart update(ShoppingCart shoppingCart);
}
