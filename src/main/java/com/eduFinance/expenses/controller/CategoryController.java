package com.eduFinance.expenses.controller;

import com.eduFinance.expenses.entity.Category;
import com.eduFinance.expenses.service.CategoryServiceJPA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categories")
@CrossOrigin(origins = "*")
public class CategoryController {

    @Autowired
    CategoryServiceJPA categoryService;

    @GetMapping("")
    public List<Category> getAllCategories() {
        return categoryService.getAllCategories();
    }

    @GetMapping("/{id}")
    public Category getCategoryById(@PathVariable int id) {
        return categoryService.getCategoryById(id);
    }

    @PostMapping("")
    public Category addCategory(@RequestBody Category category) {
        return categoryService.addCategory(category);
    }
}
