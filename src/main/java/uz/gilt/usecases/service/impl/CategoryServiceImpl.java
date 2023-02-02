package uz.gilt.usecases.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import uz.gilt.usecases.dataaccesslayer.domain.CategoryDomain;
import uz.gilt.usecases.dataaccesslayer.entity.Category;
import uz.gilt.usecases.dataaccesslayer.mapper.CategoryMapper;
import uz.gilt.usecases.dataaccesslayer.repository.CategoryRepository;
import uz.gilt.usecases.dto.CategoryDTO;
import uz.gilt.usecases.mapstruct.CategoryMapStruct;
import uz.gilt.usecases.service.CategoryService;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CategoryServiceImpl implements CategoryService {

    private final CategoryRepository categoryRepository;
    private final CategoryMapper categoryMapper;

    @Override
    public List<CategoryDTO> getAll() {
        return CategoryMapStruct.INSTANCE.categoryToCategoryDTO(categoryRepository.findAll());
    }

    @Override
    public CategoryDTO create(CategoryDTO categoryDTO) {
        Category newCategory = categoryRepository.save(Category.builder()
                .name(categoryDTO.getName())
                .build());
        return CategoryMapStruct.INSTANCE.categoryToCategoryDTO(newCategory);
    }

    @Override
    public List<CategoryDomain> getWithMybatis() {
        return categoryMapper.getCategories();
    }
}
