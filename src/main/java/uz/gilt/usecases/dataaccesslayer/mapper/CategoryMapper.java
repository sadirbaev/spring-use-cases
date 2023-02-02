package uz.gilt.usecases.dataaccesslayer.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import uz.gilt.usecases.dataaccesslayer.domain.CategoryDomain;

import java.util.List;

@Mapper
public interface CategoryMapper {
    @Select("""
            select id, name, created_at, updated_at from category
            """)
    @ResultMap("categoryResultMap")
    List<CategoryDomain> getCategories();

}
