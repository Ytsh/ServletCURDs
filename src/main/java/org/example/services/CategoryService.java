package org.example.services;

import org.example.model.Category;
import org.example.repository.CategoryRepository;

import java.sql.SQLException;
import java.util.List;

public class CategoryService {
    private CategoryRepository categoryRepository = new CategoryRepository();
    public List<Category> getAllCategory() throws SQLException, ClassNotFoundException {
        return this.categoryRepository.getAllCategory();

    }
    public Category updateCategory(Category category) throws SQLException, ClassNotFoundException{
        int id = category.getId();
        return this.categoryRepository.updateCategory(category,id);
    }

    public Category addCategory(Category category) throws SQLException {
        return this.categoryRepository.addCategory(category);
    }

    public void deleteCategory(Category category) throws SQLException {
        this.categoryRepository.deleteCategory(category);
    }
}
