package financials.api.financials.API.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import financials.api.financials.API.Models.Category;
import financials.api.financials.API.Models.SystemUser;
import financials.api.financials.API.Service.Interfaces.ICategoryService;
import financials.api.financials.API.Service.Interfaces.ISystemUserService;

import java.util.List;

@RestController
@RequestMapping("/categories")
public class CategoryController {
    @Autowired
    private ICategoryService CategoryService;
    @Autowired
    private ISystemUserService SystemUserService;

    public CategoryController(ICategoryService categoryService, ISystemUserService systemUserService) {
        CategoryService = categoryService;
        SystemUserService = systemUserService;
    }

    @GetMapping
    public ResponseEntity<List<Category>> getAllCategories(@RequestHeader("apikey") String apiKey) {
        SystemUser user = SystemUserService.ValidateApiKey(apiKey);
        if (!user.Validate(apiKey)) {
            return ResponseEntity.badRequest().body(null);
        }
        List<Category> categories = CategoryService.GetAllCategories();
        return ResponseEntity.ok(categories);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Category> getCategoryById(@RequestHeader("apikey") String apiKey, @PathVariable String id) {
        SystemUser user = SystemUserService.ValidateApiKey(apiKey);
        if (!user.Validate(apiKey)) {
            return ResponseEntity.badRequest().body(null);
        }
        Category category = CategoryService.GetCategoryById(id);
        if (category != null) {
            return ResponseEntity.ok(category);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public ResponseEntity<Category> createCategory(@RequestHeader("apikey") String apiKey, @RequestBody Category category) {
        SystemUser user = SystemUserService.ValidateApiKey(apiKey);
        if (!user.Validate(apiKey)) {
            return ResponseEntity.badRequest().body(null);
        }
        Category createdCategory = CategoryService.CreateCategory(category);
        return ResponseEntity.ok(createdCategory);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Category> updateCategory(@RequestHeader("apikey") String apiKey, @PathVariable String id, @RequestBody Category categoryDetails) {
        SystemUser user = SystemUserService.ValidateApiKey(apiKey);
        if (!user.Validate(apiKey)) {
            return ResponseEntity.badRequest().body(null);
        }
        Category updatedCategory = CategoryService.UpdateCategory(id, categoryDetails);
        if (updatedCategory != null) {
            return ResponseEntity.ok(updatedCategory);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCategory(@RequestHeader("apikey") String apiKey, @PathVariable String id) {
        SystemUser user = SystemUserService.ValidateApiKey(apiKey);
        if (!user.Validate(apiKey)) {
            return ResponseEntity.badRequest().build();
        }
        CategoryService.DeleteCategory(id);
    
            return ResponseEntity.ok().build();
        }
    }

