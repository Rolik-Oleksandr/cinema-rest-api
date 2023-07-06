package cinema.rest.api.service;

import cinema.rest.api.model.User;

public interface AuthenticationService {
    User register(String email, String password);
}
