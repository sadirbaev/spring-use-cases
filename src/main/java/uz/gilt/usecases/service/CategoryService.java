package uz.gilt.usecases.service;

import uz.gilt.usecases.dataaccesslayer.domain.CategoryDomain;
import uz.gilt.usecases.dto.CategoryDTO;

import java.util.List;

public interface CategoryService {
    CategoryDTO create(CategoryDTO categoryDTO);
    List<CategoryDTO> getAll();
    List<CategoryDomain> getWithMybatis();
}
