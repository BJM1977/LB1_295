package ch.csbe.productmanager.resources.categories;
import ch.csbe.productmanager.resources.categories.dto.CategoryShowDto;
import jakarta.persistence.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("categories")
//http://localhost:8080/categories
public class CategoryController {
    @Autowired
    private CategoryService categoryService;
    @GetMapping
    public List<CategoryShowDto> getAllCategories() {
        return categoryService.findAll();
    }

    public CategoryService getCategoryService() {
        return categoryService;
    }

    public void setCategoryService(CategoryService categoryService) {
        this.categoryService = categoryService;
    }
}
