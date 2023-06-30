package cinema.rest.api.config;

import cinema.rest.api.model.Role;
import cinema.rest.api.model.User;
import cinema.rest.api.service.RoleService;
import cinema.rest.api.service.UserService;
import java.util.Set;
import javax.annotation.PostConstruct;
import org.springframework.stereotype.Component;

@Component
public class DataInitializer {
    private final RoleService roleService;
    private final UserService userService;

    public DataInitializer(RoleService roleService, UserService userService) {
        this.roleService = roleService;
        this.userService = userService;
    }

    @PostConstruct
    public void inject() {
        Role adminRole = new Role();
        adminRole.setRoleName(Role.RoleName.ADMIN);
        roleService.add(adminRole);
        Role userRole = new Role();
        userRole.setRoleName(Role.RoleName.USER);
        roleService.add(userRole);
        User user = new User();
        user.setEmail("admin@mail.ua");
        user.setPassword("123");
        user.setRoles(Set.of(adminRole));
        userService.add(user);
    }
}
