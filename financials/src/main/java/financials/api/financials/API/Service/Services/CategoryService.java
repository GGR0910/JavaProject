package financials.api.financials.API.Service.Services;

import java.util.List;
import java.util.List;

import financials.api.financials.API.Models.Category;
import financials.api.financials.API.Repository.CategoryRepository;
import financials.api.financials.API.Service.Interfaces.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
@Service
public class CategoryService implements ICategoryService {

    @Autowired
    private CategoryRepository CategoryRepository;

    public List<Category> GetAllCategories() {
        return CategoryRepository.findAll();
    }

    public Category GetCategoryById(String id) {
        return CategoryRepository.findById(id).orElse(null);
    }

    public Category CreateCategory(Category category) {
        return CategoryRepository.save(category);
    }

    public Category UpdateCategory(String id, Category categoryDetails) {
        return CategoryRepository.save(categoryDetails);
    }

    public void DeleteCategory(String id) {
        CategoryRepository.deleteById(id);
    }
}
