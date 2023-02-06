package uz.gilt.usecases.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import uz.gilt.usecases.dataaccesslayer.entity.Role;
import uz.gilt.usecases.dataaccesslayer.entity.enumeration.ERole;
import uz.gilt.usecases.dataaccesslayer.repository.RoleRepository;
import uz.gilt.usecases.service.RoleService;

@Service
@RequiredArgsConstructor
public class RoleServiceImpl implements RoleService {

    private final RoleRepository repository;
    @Override
    public Role getOrCreate(ERole role) {
        return repository.findByName(role).orElseGet(() -> repository.save(new Role(role)));
    }
}
