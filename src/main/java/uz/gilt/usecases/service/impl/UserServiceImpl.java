package uz.gilt.usecases.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;
import uz.gilt.usecases.dataaccesslayer.entity.User;
import uz.gilt.usecases.dataaccesslayer.repository.UserRepository;
import uz.gilt.usecases.service.UserService;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository repository;
    @Override
    public boolean existsByUsername(String username) {
        return repository.existsUserByUsername(username);
    }

    @Override
    public User save(User user) {
        return repository.save(user);
    }

    @Override
    public User getUserByUsername(String username) {
        return repository.findUserByUsername(username).orElseThrow(() ->
                new ResponseStatusException(HttpStatus.NOT_FOUND, String.format("User was not found by username: %s", username)));
    }
}
