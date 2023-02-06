package uz.gilt.usecases.dataaccesslayer;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;
import uz.gilt.usecases.dataaccesslayer.entity.Role;
import uz.gilt.usecases.dataaccesslayer.entity.User;
import uz.gilt.usecases.dataaccesslayer.entity.enumeration.ERole;
import uz.gilt.usecases.service.RoleService;
import uz.gilt.usecases.service.UserService;

import java.util.List;

@Component
@Slf4j
@RequiredArgsConstructor
public class DataLoader implements ApplicationRunner {
    private final UserService userService;
    private final RoleService roleService;
    private final PasswordEncoder passwordEncoder;
    @Override
    public void run(ApplicationArguments args) {
        Role adminRole = roleService.getOrCreate(ERole.ROLE_ADMIN);
        if (!userService.existsByUsername("Administrator")){
            User user = userService.save(User.builder()
                            .username("Administrator")
                            .password(passwordEncoder.encode("pass"))
                            .roles(List.of(adminRole)).build());
            log.info("Admin was created: {}", user);
        }
    }
}