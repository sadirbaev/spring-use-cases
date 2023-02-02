package uz.gilt.usecases.dataaccesslayer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uz.gilt.usecases.dataaccesslayer.entity.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
}
