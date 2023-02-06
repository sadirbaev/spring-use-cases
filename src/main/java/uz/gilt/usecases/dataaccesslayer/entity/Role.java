package uz.gilt.usecases.dataaccesslayer.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Table;
import lombok.*;
import uz.gilt.usecases.dataaccesslayer.entity.enumeration.ERole;

@Entity
@Table(name = "role")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Role extends Base {
    @Enumerated(EnumType.STRING)
    private ERole name;
}
