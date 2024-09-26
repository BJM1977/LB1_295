package ch.csbe.productmanager.resources.categories;
import ch.csbe.productmanager.resources.categories.dto.*;
import ch.csbe.productmanager.resources.products.Product;
import ch.csbe.productmanager.resources.products.dto.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;
    @Autowired
    CategoryMapper categoryMapper;

    public CategoryDetailDto getById(long id) {
        Category category = this.categoryRepository.findById(id).orElseThrow(()->new
                ResourceNotFoundException("Category with the id"+id+"could not be found!"));
        return  categoryMapper.toDetailDto(category);
    }

    public List<CategoryShowDto> findAll() {
        List<Category> categorys = categoryRepository.findAll();
        List<CategoryShowDto> categoryShowDtos = new ArrayList<>();
        for (Category category : categorys) {
            CategoryShowDto mappedCategory = categoryMapper.toShowDto(category);
            categoryShowDtos.add(mappedCategory);
        }
        return categoryShowDtos;
    }
        public CategoryDetailDto create(CategoryCreateDto categoryCreateDto) {
            Category category = categoryMapper.toEntity(categoryCreateDto);
            Category savedCategory = categoryRepository.save(category);
            return categoryMapper.toDetailDto(savedCategory);
        }
        public CategoryDetailDto update(Long id, CategoryUpdateDto categoryToupdate){
            Category categoryEntinityToUpdate =categoryRepository.findById(id).orElseThrow(()->new
                    ResourceNotFoundException("Category with the id"+id+"could not be found!"));
            categoryMapper.update(categoryToupdate,categoryEntinityToUpdate);
            return categoryMapper.toDetailDto(categoryEntinityToUpdate);
        }
        public void delete(Long id) {
            categoryRepository.deleteById(id);
        }

    public CategoryRepository getCategoryRepository() {
        return categoryRepository;
    }

    public CategoryMapper getCategoryMapper() {
        return categoryMapper;
    }

    public void setCategoryRepository(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    public void setCategoryMapper(CategoryMapper categoryMapper) {
        this.categoryMapper = categoryMapper;
    }
}
