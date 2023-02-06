package uz.gilt.usecases.service;

import uz.gilt.usecases.dataaccesslayer.entity.Role;
import uz.gilt.usecases.dataaccesslayer.entity.enumeration.ERole;

public interface RoleService {
    Role getOrCreate(ERole role);
}
