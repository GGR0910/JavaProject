package financials.api.financials.API.Service.Interfaces;
import java.util.List;
import java.util.List;

import financials.api.financials.API.Models.Category;


public interface ICategoryService {
    public List<Category> GetAllCategories();
    public Category GetCategoryById(String id);
    public Category CreateCategory(Category category);
    public Category UpdateCategory(String id, Category categoryDetails);
    public void DeleteCategory(String id);
}
