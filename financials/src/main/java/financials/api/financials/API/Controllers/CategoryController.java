package financials.api.financials.API.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import financials.api.financials.API.Models.Category;
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
        if (!apiKeyValidator.validate(apiKey)) {
            return ResponseEntity.badRequest().body(null);
        }
        List<Category> categories = categoryService.getAllCategories();
        return ResponseEntity.ok(categories);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Category> getCategoryById(@RequestHeader("apikey") String apiKey, @PathVariable Long id) {
        if (!apiKeyValidator.validate(apiKey)) {
            return ResponseEntity.badRequest().body(null);
        }
        Category category = categoryService.getCategoryById(id);
        if (category != null) {
            return ResponseEntity.ok(category);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public ResponseEntity<Category> createCategory(@RequestHeader("apikey") String apiKey, @RequestBody Category category) {
        if (!apiKeyValidator.validate(apiKey)) {
            return ResponseEntity.badRequest().body(null);
        }
        Category createdCategory = categoryService.createCategory(category);
        return ResponseEntity.ok(createdCategory);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Category> updateCategory(@RequestHeader("apikey") String apiKey, @PathVariable Long id, @RequestBody Category categoryDetails) {
        if (!apiKeyValidator.validate(apiKey)) {
            return ResponseEntity.badRequest().body(null);
        }
        Category updatedCategory = categoryService.updateCategory(id, categoryDetails);
        if (updatedCategory != null) {
            return ResponseEntity.ok(updatedCategory);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCategory(@RequestHeader("apikey") String apiKey, @PathVariable Long id) {
        if (!apiKeyValidator.validate(apiKey)) {
            return ResponseEntity.badRequest().build();
        }
        boolean isDeleted = categoryService.deleteCategory(id);
        if (isDeleted) {
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
