package cinema.rest.api.dao;

import cinema.rest.api.model.Role;
import java.util.Optional;

public interface RoleDao {
    Role add(Role role);

    Optional<Role> getByName(String roleName);
}
