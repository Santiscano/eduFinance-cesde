package com.eduFinance.expenses.service;

import com.eduFinance.expenses.entity.Category;

import java.util.List;

public interface CategoryService {
    public List<Category> getAllCategories();
    public Category getCategoryById(int id);
    public Category addCategory(Category category);
    public Category updateCategory(Category category);
    public void deleteCategory(int id);
}
