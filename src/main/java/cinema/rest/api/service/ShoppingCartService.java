package cinema.rest.api.service;

import cinema.rest.api.model.MovieSession;
import cinema.rest.api.model.ShoppingCart;
import cinema.rest.api.model.User;

public interface ShoppingCartService {
    void addSession(MovieSession movieSession, User user);

    ShoppingCart getByUser(User user);

    void registerNewShoppingCart(User user);

    void clear(ShoppingCart shoppingCart);
}
