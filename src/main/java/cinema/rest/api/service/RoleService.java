package cinema.rest.api.service;

import cinema.rest.api.model.Role;

public interface RoleService {
    Role add(Role role);

    Role getByName(String roleName);
}
