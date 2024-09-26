package ch.csbe.productmanager.resources.categories;
import ch.csbe.productmanager.resources.categories.dto.CategoryCreateDto;
import ch.csbe.productmanager.resources.categories.dto.CategoryDetailDto;
import ch.csbe.productmanager.resources.categories.dto.CategoryShowDto;
import ch.csbe.productmanager.resources.categories.dto.CategoryUpdateDto;
import ch.csbe.productmanager.resources.users.dto.UserCreateDto;
import ch.csbe.productmanager.resources.users.dto.UserDetailDto;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.persistence.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Tag(name ="CategoryController",description ="Controller for Category Parameters")
@RequestMapping("categories")
//http://localhost:8080/categories
public class CategoryController {
    @Autowired
    private CategoryService categoryService;
    @GetMapping
    public List<CategoryShowDto> getAllCategories() {
        return categoryService.findAll();
    }
    @PostMapping
    public CategoryDetailDto createCategory(@RequestBody CategoryCreateDto categoryCreateDto) {
        return categoryService.create(categoryCreateDto);
    }
    @DeleteMapping("{id}")
    public void DeleteCategory(@PathVariable Long id) {
        categoryService.delete(id);
    }
    @PutMapping("{id}")
    public CategoryDetailDto putCategory(@RequestBody CategoryUpdateDto categoryUpdateDto, @PathVariable Long id) {
        return categoryService.update(id,categoryUpdateDto);
    }
    public CategoryService getCategoryService() {
        return categoryService;
    }

    public void setCategoryService(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

}
