package uz.gilt.usecases.mapstruct;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import uz.gilt.usecases.dataaccesslayer.entity.Category;
import uz.gilt.usecases.dto.CategoryDTO;

import java.util.List;

@Mapper
public interface CategoryMapStruct {

    CategoryMapStruct INSTANCE = Mappers.getMapper(CategoryMapStruct.class);

    CategoryDTO categoryToCategoryDTO(Category category);
    Category categoryDTOToCategory(CategoryDTO categoryDTO);
    List<CategoryDTO> categoryToCategoryDTO(List<Category> category);
}
