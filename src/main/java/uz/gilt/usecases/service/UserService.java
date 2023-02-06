package uz.gilt.usecases.service;

import uz.gilt.usecases.dataaccesslayer.entity.User;

public interface UserService {
    boolean existsByUsername(String username);

    User save(User user);

    User getUserByUsername(String username);
}
