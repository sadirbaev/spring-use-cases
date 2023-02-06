package uz.gilt.usecases.dataaccesslayer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uz.gilt.usecases.dataaccesslayer.entity.Role;
import uz.gilt.usecases.dataaccesslayer.entity.enumeration.ERole;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(ERole name);
}
