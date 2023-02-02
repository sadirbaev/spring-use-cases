package uz.gilt.usecases.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import uz.gilt.usecases.dataaccesslayer.domain.CategoryDomain;
import uz.gilt.usecases.dto.CategoryDTO;
import uz.gilt.usecases.service.CategoryService;

import java.util.List;

@RestController
@RequestMapping("api/category")
@RequiredArgsConstructor
public class CategoryController {

    private final CategoryService categoryService;

    @GetMapping
    public ResponseEntity<List<CategoryDTO>> getAll(){
        return ResponseEntity.ok(categoryService.getAll());
    }

    @PostMapping
    public ResponseEntity<CategoryDTO> create(@RequestBody CategoryDTO categoryDTO){
        return ResponseEntity.ok(categoryService.create(categoryDTO));
    }

    @GetMapping("/mybatis")
    public ResponseEntity<List<CategoryDomain>> getWithMybatis(){
        return ResponseEntity.ok(categoryService.getWithMybatis());
    }
}
